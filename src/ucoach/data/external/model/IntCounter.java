package ucoach.data.external.model;

public class IntCounter {
	public int todayCount = 0;
	public int yesterdayCount = 0;
	public int lastWeekCount = 0;
	public int lastMonthCount = 0;

	@Override
	public String toString() {
		return "IntCounter [todayCount=" + todayCount + ", yesterdayCount=" + yesterdayCount + ", lastWeekCount="
				+ lastWeekCount + ", lastMonthCount=" + lastMonthCount + "]";
	}
}
