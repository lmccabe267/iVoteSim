import java.util.HashMap;

public class VotingService {
	
	private Question question;
	HashMap<Integer, Student> classroom;
	
	public VotingService(Question question) {
		this.question = question;
		this.classroom = new HashMap<>();
	}
	
	public void addSubmission(Student student, String[] answers) {
		student.setAnswers(answers);
		classroom.put(student.getId(), student);
	}
	
	public void submitAll() {
		classroom.forEach((key, value) -> {
			question.sendSubmission(value.getAnswers());
		});
	}
	
	public void printSubmissions() {
		System.out.println("-----------Question---------");
		System.out.println(question.getQuestionText());
		System.out.println("Question type: " + question.getQuestionType());
		System.out.println("---------Submissions--------");
		question.getSubmissions().forEach((key, value) -> {
			System.out.println(key + " -> " + value);
		});
	}
	
}
