import ucoach.data.external.client.*;
public class Test {
	public static void main(String[] args) throws Exception {
		GoogleFitClient googleClient = new GoogleFitClient();
		String counters = googleClient.getFitnessCounters("1");
		System.out.println(counters);
	}
}
