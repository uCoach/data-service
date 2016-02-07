package ucoach.data.internal.ws.builder;

import ucoach.data.internal.ws.HealthMeasure;
import ucoach.data.internal.ws.HmType;
import ucoach.data.util.DateHandler;
import ucoach.data.util.JsonParser;

public class HealthMeasureBuilder {

	/**
	 * Build HealthMeasure
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static HealthMeasure build(String data) {
		
		try {
			// New parser
			JsonParser jsonParser = new JsonParser();
			jsonParser.loadJson(data);
		
			// Parse json data
			String value = jsonParser.getElement("value");
			String date = jsonParser.getElement("createdDate");
			String typeId = jsonParser.getElement("type");

			// Create new user
			HealthMeasure measure = new HealthMeasure();
			if (value != "")
				measure.setValue(Float.valueOf(value));
			if (date != "")
				measure.setCreatedDate(DateHandler.toCalendar(date));
			
			HmType type = new HmType();
			if (typeId != "")
				type.setId(Integer.valueOf(typeId));
			measure.setHmType(type);

			return measure;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
