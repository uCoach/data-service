package ucoach.data.model.builder;

import java.util.ArrayList;
import java.util.List;

import ucoach.data.internal.ws.HealthMeasure;
import ucoach.data.model.HealthMeasureModel;
import ucoach.data.util.DateHandler;

public class HealthMeasureModelBuilder {

	/**
	 * Build method
	 * @param measure
	 * @return
	 */
	public static HealthMeasureModel build(HealthMeasure measure) {
		HealthMeasureModel model = new HealthMeasureModel();
		model.setId(measure.getId());
		model.setHmType(HMTypeModelBuilder.build(measure.getHmType()));
		model.setValue(measure.getValue());
		model.setCreatedDate(DateHandler.toDate(measure.getCreatedDate()));
		
		return model;
	}

	/**
	 * Build list method
	 * @param measures
	 * @return
	 */
	public static List<HealthMeasureModel> buildList(List<HealthMeasure> measures) {
		
		List<HealthMeasureModel> modelList = new ArrayList<HealthMeasureModel>();

		for (HealthMeasure measure: measures) {
			HealthMeasureModel model = build(measure);
			modelList.add(model);
		}

		return modelList;
	}
}
