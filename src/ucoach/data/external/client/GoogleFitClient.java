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
	public String getFitnessCounters(String userId) throws Exception {

		// Build target URL and send GET request
		WebTarget target = baseTarget.path("counters/user/" + userId);
		Response response = getRequest(target);
		
		// Parse response
		parseResponseStatus(response);
		String jsonResponse = response.readEntity(String.class);

		FitnessCounters counters = new FitnessCounters();
		jsonParser.loadJson(jsonResponse);
		try {
			return jsonParser.getElement("distance");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}		
	}
}
