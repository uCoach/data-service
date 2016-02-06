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
		UserModel model = new UserModel();
		model.setId(user.getId());
		model.setFirstname(user.getFirstname());
		model.setLastname(user.getLastname());
		model.setEmail(user.getEmail());
		model.setPassword(user.getPassword());
		model.setBirthdate(DateHandler.toDate(user.getBirthdate()));
		model.setCoach(CoachModelBuilder.build(user.getCoach()));
		model.setCurrentHealthMeasures(
				HealthMeasureModelBuilder.buildList(user.getCurrentHealthMeasures().getHealthMeasure())
		);

		return model;
	}
}
