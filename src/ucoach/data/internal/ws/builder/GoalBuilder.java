package ucoach.data.internal.ws.builder;

import ucoach.data.internal.ws.Goal;
import ucoach.data.internal.ws.HmType;
import ucoach.data.util.DateHandler;
import ucoach.data.util.JsonParser;

public class GoalBuilder {

	/**
	 * Build Goal
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static Goal build(String data) {
		
		try {
			// New parser
			JsonParser jsonParser = new JsonParser();
			jsonParser.loadJson(data);
		
			// Parse json data
			String frequency = jsonParser.getElement("frequency");
			String createdDate = jsonParser.getElement("createdDate");
			String dueDate = jsonParser.getElement("dueDate");
			String measureType = jsonParser.getElement("measureType");
			String objective = jsonParser.getElement("objective");
			String value = jsonParser.getElement("value");

			// Create new user
			Goal goal = new Goal();
			goal.setAchieved(0);
			if (createdDate != "") goal.setCreatedDate(DateHandler.toCalendar(createdDate));
			if (dueDate != "") goal.setDueDate(DateHandler.toCalendar(dueDate));
			if (frequency != "") goal.setFrequency(frequency);
			if (objective != "") goal.setObjective(objective);
			if (value != "") goal.setValue(Float.valueOf(value));

			HmType type = new HmType();
			if (measureType != "") type.setId(Integer.valueOf(measureType));
			goal.setHmType(type);

			return goal;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
