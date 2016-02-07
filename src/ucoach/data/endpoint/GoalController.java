package ucoach.data.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import ucoach.data.internal.client.GoalClient;
import ucoach.data.internal.ws.Goal;
import ucoach.data.internal.ws.User;
import ucoach.data.internal.ws.builder.GoalBuilder;
import ucoach.data.internal.ws.builder.UserBuilder;
import ucoach.data.model.GoalModel;
import ucoach.data.model.builder.GoalModelBuilder;
import ucoach.data.util.Authorization;

@Path("/goal")
public class GoalController {
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response createGoal(String data, @Context HttpHeaders headers) {
		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
  		
      return Response.status(401).entity(json.toString()).build();
		}

		// Build new measure
		Goal goal = GoalBuilder.build(data);
		if (goal == null) {
			System.out.println("Incorrect goal data");
			json.put("status", 400).put("message", "Incorrect goal data");
			return Response.status(400).entity(json.toString()).build();
		}

		User user = UserBuilder.build(data);
		if (user == null) {
			System.out.println("Incorrect user data");
			json.put("status", 400).put("message", "Incorrect user data");
			return Response.status(400).entity(json.toString()).build();
		}
		
		GoalClient client = new GoalClient();
		
		// Persist goal
		goal = client.createGoal(goal, user.getId());

		if (goal == null) {
			System.out.println("Unable to create goal");
			json.put("status", 500).put("message", "Unable to create goal");
			return Response.status(500).entity(json.toString()).build();
		}

		// Build new model from class
		try{

			GoalModel model = GoalModelBuilder.build(goal);
			return Response.status(200).entity(model).build();

		} catch (Exception e) {

			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@PUT
	@Path("/{goalId}/achieved")
  @Produces({MediaType.APPLICATION_JSON})
  public Response updateGoal(@Context HttpHeaders headers, @PathParam("goalId") String goalId) {
		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
  		
      return Response.status(401).entity(json.toString()).build();
		}
		
		GoalClient client = new GoalClient();
		
		// Persist update
		Goal goal = client.achieveGoal(goalId);
		if (goal == null) {
			System.out.println("Goal not found");
			json.put("status", 404).put("message", "Goal not found");
			return Response.status(404).entity(json.toString()).build();
		}
		
		// Build new model from class
		try{

			GoalModel model = GoalModelBuilder.build(goal);
			return Response.status(200).entity(model).build();

		} catch (Exception e) {

			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
