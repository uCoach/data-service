package ucoach.data.endpoint;

import java.util.Date;

import javax.ws.rs.Consumes;
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

import ucoach.data.internal.client.UserClient;
import ucoach.data.internal.ws.User;
import ucoach.data.internal.ws.builder.UserBuilder;
import ucoach.data.model.UserModel;
import ucoach.data.model.builder.UserModelBuilder;
import ucoach.data.util.Authorization;

@Path("/user")
public class UserController {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response createUser(String userData, @Context HttpHeaders headers) {

		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
  		
      return Response.status(401).entity(json.toString()).build();
		}

		// Build new user
		User user = UserBuilder.build(userData);
		if (user == null) {
			System.out.println("Incorrect user data");
			json.put("status", 400).put("message", "Incorrect user data");
			return Response.status(400).entity(json.toString()).build();
		}

		UserClient client = new UserClient();
		User oldUser = client.getUserByEmail(user.getEmail());
		if (oldUser != null) {
			System.out.println("User already exists");
			json.put("status", 400).put("message", "User already exists");
			return Response.status(400).entity(json.toString()).build();
		}

		// Persist user
		user = client.createUser(user);

		if (user == null) {
			System.out.println("Unable to create user");
			json.put("status", 500).put("message", "Unable to create user");
			return Response.status(500).entity(json.toString()).build();
		}

		// Build new model from User class
		try{

			UserModel model = UserModelBuilder.build(user);
			return Response.status(200).entity(model).build();

		} catch (Exception e) {

			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@GET
	@Path("/{userId}")
  @Produces({MediaType.APPLICATION_JSON})
  public Response getUser(@PathParam("userId") String userId, @Context HttpHeaders headers) {
		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
      return Response.status(401).entity(json.toString()).build();
		}
		
		// Get user
		UserClient client = new UserClient();
		User user = client.getUserById(userId);
		if (user == null) {
			System.out.println("User Not Found");
			json.put("status", 404).put("message", "User Not Found");
			return Response.status(404).entity(json.toString()).build();
		}
		
		UserModel model = UserModelBuilder.build(user);
		return Response.status(200).entity(model).build();
	}
	
	@GET
	@Path("/email/{email}")
  @Produces({MediaType.APPLICATION_JSON})
  public Response getUserByEmail(@PathParam("email") String email, @Context HttpHeaders headers) {
		
		// Build JSON response object
		JSONObject json = new JSONObject();

		if(!Authorization.validateRequest(headers)){
  		json.put("status", 401).put("message", "Not Authorized");
      return Response.status(401).entity(json.toString()).build();
		}

		// Get user
		UserClient client = new UserClient();
		User user = client.getUserByEmail(email);
		if (user == null) {
			System.out.println("User Not Found");
			json.put("status", 404).put("message", "User Not Found");
			return Response.status(404).entity(json.toString()).build();
		}
		
		UserModel model = UserModelBuilder.build(user);
		return Response.status(200).entity(model).build();
	}
}
