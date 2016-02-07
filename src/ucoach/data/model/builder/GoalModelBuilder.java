package ucoach.data.model.builder;

import java.util.ArrayList;
import java.util.List;

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
		
		if (goal == null)
			return null;

		GoalModel model = new GoalModel();
		model.setId(goal.getId());
		model.setObjective(goal.getObjective());
		model.setValue(goal.getValue());
		model.setAchieved(goal.getAchieved());
		model.setFrequency(goal.getFrequency());
		model.setHmType(HMTypeModelBuilder.build(goal.getHmType()));
		model.setCreatedDate(DateHandler.toString(goal.getCreatedDate()));
		model.setDueDate(DateHandler.toString(goal.getDueDate()));
		
		return model;
	}
	
	/**
	 * Build list method
	 * @param goals
	 * @return
	 */
	public static List<GoalModel> buildList(List<Goal> goals) {
		
		if (goals == null)
			return null;

		List<GoalModel> modelList = new ArrayList<GoalModel>();

		for (Goal goal: goals) {
			if (goal == null) continue;
			
			GoalModel model = build(goal);
			modelList.add(model);
		}

		return modelList;
	}
}
