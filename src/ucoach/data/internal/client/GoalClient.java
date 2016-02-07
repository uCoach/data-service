package ucoach.data.internal.client;

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
	
}
