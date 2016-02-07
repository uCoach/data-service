package ucoach.data.internal.client;

import java.util.List;

import javax.xml.ws.BindingProvider;

import ucoach.data.internal.client.Authorization;
import ucoach.data.internal.ws.HealthMeasure;
import ucoach.data.internal.ws.HealthMeasureInterface;
import ucoach.data.internal.ws.HealthMeasureService;

public class HealthMeasureClient {

	HealthMeasureInterface healthMeasureInterface;

	public HealthMeasureClient() {
		// Get service
		HealthMeasureService service = new HealthMeasureService();
		healthMeasureInterface = service.getHealthMeasureServicePort();
		
		// Authorize request
		Authorization.authorizeRequest((BindingProvider)healthMeasureInterface);
	}

	/**
	 * Method to get health measures by user by type
	 * @param userId
	 * @param typeId
	 * @return
	 */
	public List<HealthMeasure> getHealthMeasuresFromUserByType(
			String userId,
			String typeId
	) {

		List<HealthMeasure> measures;

		try {
			measures = healthMeasureInterface.getHealthMeasuresFromUserByType(Integer.parseInt(userId), Integer.parseInt(typeId));
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return measures;
	}
	
	/**
	 * Method to get health measures by user by type
	 * @param userId
	 * @param typeId
	 * @param fromDate
	 * @return
	 */
	public List<HealthMeasure> getHealthMeasuresFromUserByType(
			String userId,
			String typeId,
			String fromDate
	) {

		List<HealthMeasure> measures;

		try {
			measures = healthMeasureInterface.getHealthMeasuresFromUserByTypeAfterDate(
					Integer.parseInt(userId), Integer.parseInt(typeId), fromDate);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return measures;
	}
	
	/**
	 * Method to get health measures by user by type
	 * @param userId
	 * @param typeId
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public List<HealthMeasure> getHealthMeasuresFromUserByType(
			String userId,
			String typeId,
			String fromDate,
			String toDate
	) {

		List<HealthMeasure> measures;

		try {
			measures = healthMeasureInterface.getHealthMeasuresFromUserByTypeBetweenDates(
					Integer.parseInt(userId), Integer.parseInt(typeId), fromDate, toDate);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return measures;
	}

	/**
	 * Create new measure
	 * @param measure
	 * @param userId
	 * @return
	 */
	public HealthMeasure createHealthMeasure(HealthMeasure measure, int userId) {
		try {
			return healthMeasureInterface.createHealthMeasure(measure, userId, measure.getHmType().getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Delete health measure by id
	 * @param measureId
	 * @return
	 */
	public boolean deleteHealthMeasure(int measureId) {
		try {
			healthMeasureInterface.deleteHealthMeasure(measureId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
