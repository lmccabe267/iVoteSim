
public class SingleChoice extends Question {
	
	
	
	public SingleChoice(String questionText, String[] answers) {
		super(questionText, answers);
	}
	
	public void submitAnswer(String answer) {
		if(submissions.containsKey(answer)) {
			submissions.put(answer, submissions.get(answer) + 1);
		}else {
			System.out.println("Invalid Answer");
		}
	}

	@Override
	public String getQuestionType() {
		return "Single Choice";
	}
	
	@Override
	public boolean sendSubmission(String[] answers) {
		if(answers.length != 1) {
			return false;
		}
		submitAnswer(answers[0]);
		return true;
	}
	
}
