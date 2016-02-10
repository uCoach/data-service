package ucoach.data.util;

import ucoach.data.external.client.GoogleFitClient;
import ucoach.data.external.model.Counter;
import ucoach.data.external.model.FitnessCounters;
import ucoach.data.internal.ws.HealthMeasure;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;

/**
 * Helper class to integrate external and internal data sources
 * @author Federico
 *
 */
public class Integration {

	private  Map<Integer, Counter> map = new HashMap<Integer, Counter>();
	public final int STEPS_ID = 3;
	public final int CALORIES_ID = 5;
	private final Date TODAY = new Date();
	private final Date YESTERDAY = DateHandler.removeDays(new Date(), 1);

	/**
	 * Constructor
	 * @param userId
	 * @throws Exception
	 */
	public Integration(String userId) throws Exception {
		GoogleFitClient client = new GoogleFitClient();
		FitnessCounters fitness = client.getFitnessCounters(userId);
		
		map.put(STEPS_ID, fitness.steps);
		map.put(CALORIES_ID, fitness.calories);
	}

	/**
	 * Get measure from external sources within a time frame
	 * @param measureTypeId
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public List<HealthMeasure> getMeasuresFromExternalSources(
			int measureTypeId,
			String fromDate,
			String toDate
	) {
		
		List<HealthMeasure> list = new ArrayList<HealthMeasure>();
		if (isInTimeFrame(fromDate, toDate, TODAY))
			list.add(getTodayMeasure(measureTypeId));
		
		if (isInTimeFrame(fromDate, toDate, YESTERDAY))
			list.add(getYesterdayMeasure(measureTypeId));
		
		return list;
	}

	/**
	 * Get measure from external sources
	 * @param measureTypeId
	 * @return
	 */
	public List<HealthMeasure> getMeasuresFromExternalSources(int measureTypeId) {
		
		List<HealthMeasure> list = new ArrayList<HealthMeasure>();
		list.add(getTodayMeasure(measureTypeId));
		list.add(getYesterdayMeasure(measureTypeId));

		return list;
	}

	/**
	 * Get today HealthMeasure
	 * @param measureTypeId
	 * @return
	 */
	private HealthMeasure getTodayMeasure(int measureTypeId) {
		if (!map.containsKey(measureTypeId))
			return null;
		
		Counter counter = (Counter) map.get(measureTypeId);
		
		HealthMeasure measure = new HealthMeasure();
		measure.setValue(Float.valueOf((float)(double) counter.todayCount));
		try {
			measure.setCreatedDate(DateHandler.toCalendar(TODAY));
		} catch (ParseException e) {}

		
		return measure;
	}
	
	/**
	 * Get yesterday HealthMeasure
	 * @param measureTypeId
	 * @return
	 */
	private HealthMeasure getYesterdayMeasure(int measureTypeId) {
		if (!map.containsKey(measureTypeId))
			return null;
		
		Counter counter = (Counter) map.get(measureTypeId);
		
		HealthMeasure measure = new HealthMeasure();
		measure.setValue(Float.valueOf((float)(double) counter.yesterdayCount));
		try {
			measure.setCreatedDate(DateHandler.toCalendar(YESTERDAY));
		} catch (ParseException e) {}

		return measure;
	}

	/**
	 * Helper method to calculate if date is in time frame
	 * @param fromDate
	 * @param toDate
	 * @param date
	 * @return
	 */
	private boolean isInTimeFrame(String fromDate, String toDate, Date date) {

		try {
			
			if (fromDate != null & toDate == null)
				if (DateHandler.stringToDate(fromDate).before(date)) return true;

			if (fromDate != null & toDate != null) {
				if (DateHandler.stringToDate(fromDate).before(date)
						& DateHandler.addDays(DateHandler.stringToDate(toDate), 1).after(date))
						return true;
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return false;
	}
}
