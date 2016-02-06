package ucoach.data.external.client;

import javax.ws.rs.core.Response;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import ucoach.data.util.*;

public class BaseClient {
	
	protected JsonParser jsonParser = new JsonParser();
	protected String baseUrl = "http://localhost:5700";
	protected transient WebTarget baseTarget;
	protected String mediaType = MediaType.APPLICATION_JSON;

	/**
	 * Class constructor
	 */
	public BaseClient() {
		ClientConfig config = new ClientConfig().register(new JacksonFeature());
		Client client = ClientBuilder.newClient(config);
    baseTarget = client.target(UriBuilder.fromUri(baseUrl).build());
	}

	/**
	 * Perform GET request
	 * @param target
	 * @return
	 */
	protected Response getRequest(WebTarget target) {
		
		// Build request
		Builder builder = target.request().accept(mediaType);
		Authorization.authorizeRequest(builder);

		// GET request
		return builder.get();
	}

	/**
	 * Parse response status
	 * @param response
	 * @throws Exception
	 */
	protected void parseResponseStatus(Response response) throws Exception {
		// Parse status
		int status = response.getStatus();
		if (!(status == 200 || status == 201 || status == 204)) {
			System.out.println("Internal Error: response returned " + status);
			System.out.println(response.readEntity(String.class));
			throw new Exception();
		}
	}
}
