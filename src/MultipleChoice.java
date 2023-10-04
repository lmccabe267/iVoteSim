
public class MultipleChoice extends Question {
		
	public MultipleChoice(String questionText, String[] answers) {
		super(questionText, answers);
	}
	
	public void submitAnswers(String[] answers) {
		for(String answer: answers) {
			if(submissions.containsKey(answer)) {
				submissions.put(answer, submissions.get(answer) + 1);
			}else {
				System.out.println("Invalid Answer");
			}
		}
	}
	
	@Override
	public String getQuestionType() {
		return "Multiple Choice";
	}
	
	@Override
	public boolean sendSubmission(String[] answers) {
		if(answers.length < 1) {
			return false;
		}
		submitAnswers(answers);
		return true;
	}
	

}
