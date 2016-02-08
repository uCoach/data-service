package ucoach.data.endpoint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import ucoach.data.internal.client.HealthMeasureClient;
import ucoach.data.internal.ws.HealthMeasure;
import ucoach.data.internal.ws.User;
import ucoach.data.internal.ws.builder.HealthMeasureBuilder;
import ucoach.data.internal.ws.builder.UserBuilder;
import ucoach.data.model.HealthMeasureModel;
import ucoach.data.model.builder.HealthMeasureModelBuilder;
import ucoach.data.util.Authorization;
import ucoach.data.util.Integration;

@Path("/measure")
public class HealthMeasureController {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response createMeasure(String data, @Context HttpHeaders headers) {

		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
  		
      return Response.status(401).entity(json.toString()).build();
		}

		// Build new measure
		HealthMeasure measure = HealthMeasureBuilder.build(data);
		if (measure == null) {
			System.out.println("Incorrect measure data");
			json.put("status", 400).put("message", "Incorrect measure data");
			return Response.status(400).entity(json.toString()).build();
		}

		User user = UserBuilder.build(data);
		if (user == null) {
			System.out.println("Incorrect user data");
			json.put("status", 400).put("message", "Incorrect user data");
			return Response.status(400).entity(json.toString()).build();
		}

		HealthMeasureClient client = new HealthMeasureClient();

		// Persist measure
		measure = client.createHealthMeasure(measure, user.getId());

		if (measure == null) {
			System.out.println("Unable to create measure");
			json.put("status", 500).put("message", "Unable to create measure");
			return Response.status(500).entity(json.toString()).build();
		}

		// Build new model from User class
		try{

			HealthMeasureModel model = HealthMeasureModelBuilder.build(measure);
			return Response.status(200).entity(model).build();

		} catch (Exception e) {

			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@DELETE
	@Path("/{measureId}")
  @Produces({MediaType.APPLICATION_JSON})
  public Response getUser(@PathParam("measureId") String measureId, @Context HttpHeaders headers) {
		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
      return Response.status(401).entity(json.toString()).build();
		}
		
		HealthMeasureClient client = new HealthMeasureClient();
		boolean deleted = client.deleteHealthMeasure(Integer.valueOf(measureId));
		if (!deleted) {
			System.out.println("Measure Not Found");
			json.put("status", 404).put("message", "Measure Not Found");
			return Response.status(404).entity(json.toString()).build();
		}
		
		json.put("status", 200).put("message", "Measure Deleted");
		return Response.status(200).build();
	}

	@GET
	@Path("/type/{typeId}/user/{userId}")
  @Produces({MediaType.APPLICATION_JSON})
  public Response getHealthMeasures(
  	@PathParam("typeId") String typeId,
  	@PathParam("userId") String userId,
  	@QueryParam("fromDate") String fromDate,
  	@QueryParam("toDate") String toDate,
  	@Context HttpHeaders headers
  ) {
		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
      return Response.status(401).entity(json.toString()).build();
		}

		// Validate user and type
		
		// New measure list
		HealthMeasureClient client = new HealthMeasureClient();
		List<HealthMeasure> measures = new ArrayList<HealthMeasure>();

		// Get internal data
		if (fromDate == null & toDate == null) 
			measures.addAll(client.getHealthMeasuresFromUserByType(userId, typeId));
		else if (fromDate != null & toDate == null)
			measures.addAll(client.getHealthMeasuresFromUserByType(userId, typeId, fromDate));
		else if (fromDate != null & toDate != null)
			measures.addAll(client.getHealthMeasuresFromUserByType(userId, typeId, fromDate, toDate));

		// Integrate with external data
		if (!(fromDate == null & toDate == null)) {
			try {
				Integration integration = new Integration(userId);
				measures.addAll(integration.getMeasuresFromExternalSources(Integer.valueOf(typeId), fromDate, toDate));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Unable to integrate with external data");
			}
		}

		// Build model and return
		List<HealthMeasureModel> model = HealthMeasureModelBuilder.buildList(measures);
		return Response.status(200).entity(model).build();
	}
}
