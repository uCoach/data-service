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

		counters.steps.todayCount = Double.valueOf(jsonParser.getElement("steps/today"));
		counters.calories.todayCount = Double.valueOf(jsonParser.getElement("calories/today"));
		counters.distance.todayCount = Double.valueOf(jsonParser.getElement("distance/today"));

		counters.steps.yesterdayCount = Double.valueOf(jsonParser.getElement("steps/yesterday"));
		counters.calories.yesterdayCount = Double.valueOf(jsonParser.getElement("calories/yesterday"));
		counters.distance.yesterdayCount = Double.valueOf(jsonParser.getElement("distance/yesterday"));
		
		counters.steps.lastWeekCount = Double.valueOf(jsonParser.getElement("steps/last-week"));
		counters.calories.lastWeekCount = Double.valueOf(jsonParser.getElement("calories/last-week"));
		counters.distance.lastWeekCount = Double.valueOf(jsonParser.getElement("distance/last-week"));
		
		counters.steps.lastMonthCount = Double.valueOf(jsonParser.getElement("steps/last-month"));
		counters.calories.lastMonthCount = Double.valueOf(jsonParser.getElement("calories/last-month"));
		counters.distance.lastMonthCount = Double.valueOf(jsonParser.getElement("distance/last-month"));
		
		return counters;
	}
}
