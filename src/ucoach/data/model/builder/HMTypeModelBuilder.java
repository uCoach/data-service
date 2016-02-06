package ucoach.data.model.builder;

import ucoach.data.internal.ws.HmType;
import ucoach.data.model.HMTypeModel;

public class HMTypeModelBuilder {

	/**
	 * Build method
	 * @param type
	 * @return
	 */
	public static HMTypeModel build(HmType type) {

		if (type == null)
			return null;

		HMTypeModel model = new HMTypeModel();
		model.setId(type.getId());
		model.setName(type.getName());
		model.setUnits(type.getUnits());
		
		return model;
	}
}
