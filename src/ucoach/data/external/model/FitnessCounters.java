package ucoach.data.external.model;

public class FitnessCounters {
	public IntCounter steps = new IntCounter();
	public DoubleCounter distance = new DoubleCounter();
	public DoubleCounter calories = new DoubleCounter();

	@Override
	public String toString() {
		return "FitnessCounters [steps=" + steps.toString() + ", distance=" + distance.toString() + ", calories=" + calories.toString() + "]";
	}
}
