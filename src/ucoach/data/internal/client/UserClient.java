package ucoach.data.internal.client;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

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
	public User getUserById(String userId) {

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
	
	/**
	 * Method to get user by id
	 * @param userId
	 */
	public User getUserByEmail(String email) {

		User user;

		try {
			// Get user by id
			user = userInterface.getUserByEmail(email);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return user;
	}

	/**
	 * Create new user
	 * @param user
	 */
	public User createUser(User user) {
		try {
			return userInterface.createUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
