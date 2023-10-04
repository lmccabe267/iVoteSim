import java.util.Scanner;

public class SimulationDriver {
	
	public static void main(String[] args) {
		String[] answers = {"a", "b", "c", "d"};
		VotingService votingService = new VotingService(new SingleChoice("What is the answer", answers));
		int classSize = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of students to simulate");
		classSize = scan.nextInt();
		scan.close();
		
		for(int i = 0; i < classSize; i++) {
			int random = (int)Math.floor(Math.random() * (3 - 0 + 1) + 0);
			
			String[] submitAnswers = {answers[random]};
			
			votingService.addSubmission(new Student("first" + i, "last" + i, i), submitAnswers);
		}
		
		votingService.submitAll();
		votingService.printSubmissions();
	}
}
