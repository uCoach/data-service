package ucoach.data.internal.ws.builder;

import ucoach.data.internal.ws.User;
import ucoach.data.util.DateHandler;
import ucoach.data.util.JsonParser;

public class UserBuilder {

	/**
	 * Build User
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static User build(String data) {
		
		try {
			// New parser
			JsonParser jsonParser = new JsonParser();
			jsonParser.loadJson(data);
		
			// Parse json data
			String firstname = jsonParser.getElement("firstname");
			String lastname = jsonParser.getElement("lastname");
			String birthdate = jsonParser.getElement("birthdate");
			String email = jsonParser.getElement("email");
			String password = jsonParser.getElement("password");
			
			// Create new user
			User user = new User();
			user.setFirstname(firstname);
			user.setLastname(lastname);
			user.setEmail(email);
			user.setPassword(password);
			user.setBirthdate(DateHandler.toCalendar(birthdate));

			return user;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
