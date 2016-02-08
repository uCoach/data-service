package ucoach.data.external.client;

import ucoach.data.external.model.FitnessCounters;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class GoogleFitClient extends BaseClient {

	public GoogleFitClient() {
		// Call parent constructor
		super();
		baseTarget = baseTarget.path("google-fit");
	}

	/**
	 * Get authorization link
	 * @param userId
	 * @return
	 * @throws Exception 
	 */
	public String getAuthorizationLink(String userId) throws Exception {

		// Build target URL and send GET request
		WebTarget target = baseTarget.path("authorization/user/" + userId);
		Response response = getRequest(target);
		
		// Parse response
		parseResponseStatus(response);
		String jsonResponse = response.readEntity(String.class);

		jsonParser.loadJson(jsonResponse);
		try {
			String message = jsonParser.getElement("message");
			if (message == "")
				return jsonParser.getElement("location");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
		return "";
	}
	
	/**
	 * Get fitness counters
	 * @param userId
	 * @return
	 * @throws Exception 
	 */
	public FitnessCounters getFitnessCounters(String userId) throws Exception {

		// Build target URL and send GET request
		WebTarget target = baseTarget.path("counters/user/" + userId);
		Response response = getRequest(target);
		
		// Parse response
		parseResponseStatus(response);
		String jsonResponse = response.readEntity(String.class);

		FitnessCounters counters = new FitnessCounters();
		jsonParser.loadJson(jsonResponse);

		counters.steps.todayCount = getValueFromJson("steps/today");
		counters.calories.todayCount = getValueFromJson("calories/today");
		counters.distance.todayCount = getValueFromJson("distance/today");

		counters.steps.yesterdayCount = getValueFromJson("steps/yesterday");
		counters.calories.yesterdayCount = getValueFromJson("calories/yesterday");
		counters.distance.yesterdayCount = getValueFromJson("distance/yesterday");
		
		counters.steps.lastWeekCount = getValueFromJson("steps/last-week");
		counters.calories.lastWeekCount = getValueFromJson("calories/last-week");
		counters.distance.lastWeekCount = getValueFromJson("distance/last-week");
		
		counters.steps.lastMonthCount = getValueFromJson("steps/last-month");
		counters.calories.lastMonthCount = getValueFromJson("calories/last-month");
		counters.distance.lastMonthCount = getValueFromJson("distance/last-month");
		
		return counters;
	}

	/**
	 * Helper method to get Double value from JSON
	 * @param expr
	 * @return
	 * @throws Exception
	 */
	private Double getValueFromJson(String expr) throws Exception {
		String value = jsonParser.getElement(expr);
		if (value == "" || value == null || value.length() == 0) return 0.0;
		
		return Double.valueOf(value);
	}
}
