package ucoach.data.internal.client;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

import ucoach.data.internal.client.Authorization;
import ucoach.data.internal.ws.Goal;
import ucoach.data.internal.ws.GoalInterface;
import ucoach.data.internal.ws.GoalService;

public class GoalClient {

	GoalInterface goalInterface;

	public GoalClient() {
		// Get service
		GoalService service = new GoalService();
		goalInterface = service.getGoalServicePort();
		
		// Authorize request
		Authorization.authorizeRequest((BindingProvider)goalInterface);
	}

	/**
	 * Create new goal
	 * @param goal
	 * @param userId
	 * @return
	 */
	public Goal createGoal(Goal goal, int userId) {
		try {
			return goalInterface.createGoal(goal, userId, goal.getHmType().getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Update goal to achieved
	 * @param goalId
	 * @return
	 */
	public Goal achieveGoal(String goalId) {
		try {
			return goalInterface.achieveGoal(Integer.valueOf(goalId));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * getGoalsFromUser
	 * @param userId
	 * @return
	 */
	public List<Goal> getGoalsFromUser(String userId, String achieved) {
		try {
			return filterByAchieved(
					goalInterface.getGoalsFromUser(Integer.valueOf(userId)),
					achieved
			);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Get Goals From User After Due Date
	 * @param userId
	 * @param dueDate
	 * @return
	 */
	public List<Goal> getGoalsFromUser(String userId, String achieved, String dueDate) {
		try {
			return filterByAchieved(
					goalInterface.getGoalsFromUserAfterDueDate(Integer.valueOf(userId), dueDate),
					achieved
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * getGoalsFromUserByFrequencyAndDueDate
	 * @param userId
	 * @param frequency
	 * @param dueDate
	 * @return
	 */
	public List<Goal> getGoalsFromUser(String userId, String achieved, String frequency, String dueDate) {
		try {
			return filterByAchieved(
					goalInterface.getGoalsFromUserByFrequencyAndDueDate(Integer.valueOf(userId), frequency, dueDate),
					achieved
			);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private List<Goal> filterByAchieved(List<Goal> goals, String achieved) {

		if (achieved == null) return goals;

		List<Goal> filtered = new ArrayList<Goal>();
		switch (achieved) {
			case "false":
				for (Goal goal: goals) {
					if (goal.getAchieved() == 0) filtered.add(goal);
				}
				return filtered;
			case "true":
				for (Goal goal: goals) {
					if (goal.getAchieved() == 1) filtered.add(goal);
				}
				return filtered;
			default:
				return goals;
		}
	}
}
