import java.util.HashMap;

public abstract class Question implements QuestionInterface{
	
	private String questionText;
	private String[] answers;
	HashMap<String, Integer> submissions = new HashMap<>();
	
	public Question(String questionText, String[] answers) {
		this.questionText = questionText;
		for(String answer: answers) {
			submissions.put(answer, 0);
		}
	}
	
	@Override
	public String getQuestionType() {
		return "";
	}
	
	@Override
	public String getQuestionText() {
		return this.questionText;
	}
	
	public String getAnswers() {
		return this.answers.toString();
	}
	
	public HashMap<String, Integer> getSubmissions(){
		return this.submissions;
	}
	
	@Override
	public boolean sendSubmission(String[] answers) {
		return false;
	}
	
}
