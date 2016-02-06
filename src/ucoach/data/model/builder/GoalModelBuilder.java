package ucoach.data.model.builder;

import ucoach.data.internal.ws.Goal;
import ucoach.data.model.GoalModel;
import ucoach.data.util.DateHandler;

public class GoalModelBuilder {

	/**
	 * Build method
	 * @param goal
	 * @return
	 */
	public static GoalModel build(Goal goal) {
		GoalModel model = new GoalModel();
		model.setId(goal.getId());
		model.setObjective(goal.getObjective());
		model.setValue(goal.getValue());
		model.setAchieved(goal.getAchieved());
		model.setFrequency(goal.getFrequency());
		model.setHmType(HMTypeModelBuilder.build(goal.getHmType()));
		model.setCreatedDate(DateHandler.toDate(goal.getCreatedDate()));
		model.setDueDate(DateHandler.toDate(goal.getDueDate()));
		
		return model;
	}
}
