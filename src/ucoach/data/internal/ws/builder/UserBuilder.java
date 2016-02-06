package ucoach.data.internal.ws.builder;

import ucoach.data.internal.ws.User;
import ucoach.data.util.JsonParser;

public class UserBuilder {

	public static User build(String data) {
		User user = new User();
		user.setFirstname("");

		return user;
	}
}
