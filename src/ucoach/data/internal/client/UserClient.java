package ucoach.data.internal.client;

import javax.xml.ws.BindingProvider;

import ucoach.data.internal.client.Authorization;
import ucoach.data.internal.ws.User;
import ucoach.data.internal.ws.UserInterface;
import ucoach.data.internal.ws.UserService;

public class UserClient {

	UserInterface userInterface;

	public UserClient() {
		// Get service
		UserService service = new UserService();
		userInterface = service.getUserServicePort();
		
		// Authorize request
		Authorization.authorizeRequest((BindingProvider)userInterface);
	}

	/**
	 * Method to get user by id
	 * @param userId
	 */
	public User getUser(String userId) {

		User user;

		try {
			// Get user by id
			user = userInterface.getUser(Integer.parseInt(userId));

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return user;
	}
}
