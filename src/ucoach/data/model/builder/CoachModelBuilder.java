package ucoach.data.model.builder;

import ucoach.data.internal.ws.Coach;
import ucoach.data.model.CoachModel;
import ucoach.data.util.DateHandler;

public class CoachModelBuilder {

	/**
	 * Build method
	 * @param coach
	 * @return
	 */
	public static CoachModel build(Coach coach) {

		CoachModel model = new CoachModel();
		model.setBirthdate(DateHandler.toDate(coach.getBirthdate()));
		model.setEmail(coach.getEmail());
		model.setFirstname(coach.getFirstname());
		model.setId(coach.getId());
		model.setLastname(coach.getLastname());
		model.setPassword(coach.getPassword());
		
		return model;
	}
}
