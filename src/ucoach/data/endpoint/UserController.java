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

@Path("/user")
public class UserController {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response createUser(String userData) {

		// Build JSON response object
		JSONObject json = new JSONObject();

		// Build new user
		User user = UserBuilder.build(userData);

		if (user == null) {
			System.out.println("Incorrect user data");
			json.put("status", 400).put("message", "Incorrect user data");
			return Response.status(400).entity(json.toString()).build();
		}
		
		// Persist user
		UserClient client = new UserClient();
		user = client.createUser(user);
		
		// Build new model from User class
		UserModel model = null;
		try{
			model = UserModelBuilder.build(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Return model
		return Response.status(200).entity(model).build();
	}
}
