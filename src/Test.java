import ucoach.data.external.client.*;
import ucoach.data.external.model.FitnessCounters;

public class Test {
	public static void main(String[] args) throws Exception {
		GoogleFitClient googleClient = new GoogleFitClient();
		FitnessCounters counters = googleClient.getFitnessCounters("1");
		
		System.out.println(counters.toString());
	}
}
