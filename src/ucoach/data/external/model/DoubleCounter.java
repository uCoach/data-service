package ucoach.data.external.model;

public class DoubleCounter {
	public Double todayCount = 0.0;
	public Double yesterdayCount = 0.0;
	public Double lastWeekCount = 0.0;
	public Double lastMonthCount = 0.0;
	
	@Override
	public String toString() {
		return "DoubleCounter [todayCount=" + todayCount + ", yesterdayCount=" + yesterdayCount + ", lastWeekCount="
				+ lastWeekCount + ", lastMonthCount=" + lastMonthCount + "]";
	}
}
