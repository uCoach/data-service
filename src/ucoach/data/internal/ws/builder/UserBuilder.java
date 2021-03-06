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
			String userId = jsonParser.getElement("userId");
			String firstname = jsonParser.getElement("firstname");
			String lastname = jsonParser.getElement("lastname");
			String birthdate = jsonParser.getElement("birthdate");
			String email = jsonParser.getElement("email");
			String password = jsonParser.getElement("password");
			String twitterUsername = jsonParser.getElement("twitterUsername");
			
			// Create new user
			User user = new User();
			if (userId != "")
				user.setId(Integer.valueOf(userId));
			if (firstname != "")
				user.setFirstname(firstname);
			if (lastname != "")
				user.setLastname(lastname);
			if (email != "")
				user.setEmail(email);
			if (password != "")
				user.setPassword(password);
			if (birthdate != "")
				user.setBirthdate(DateHandler.toCalendar(birthdate));
			if (twitterUsername != "")
				user.setTwitterUsername(twitterUsername);

			return user;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
