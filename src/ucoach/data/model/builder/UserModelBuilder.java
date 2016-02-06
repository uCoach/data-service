package ucoach.data.model.builder;

import ucoach.data.internal.ws.User;
import ucoach.data.model.UserModel;
import ucoach.data.util.DateHandler;

public class UserModelBuilder {

	/**
	 * Build method
	 * @param user
	 * @return
	 */
	public static UserModel build(User user) {
		if (user == null)
			return null;

		UserModel model = new UserModel();
		model.setId(user.getId());
		model.setFirstname(user.getFirstname());
		model.setLastname(user.getLastname());
		model.setEmail(user.getEmail());
		model.setPassword(user.getPassword());
		model.setBirthdate(DateHandler.toString(user.getBirthdate()));
		model.setCoach(CoachModelBuilder.build(user.getCoach()));
		model.setCurrentHealthMeasures(
				HealthMeasureModelBuilder.buildList(user.getCurrentHealthMeasures().getHealthMeasure())
		);

		return model;
	}
}
