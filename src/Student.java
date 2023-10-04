
public class Student {
	
	private String firstName, lastName;
	private int id;
	private String[] answers;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public Student(String firstName, String lastName, int id, String[] answers) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.answers = answers;
	}
	
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	
	public String[] getAnswers() {
		return this.answers;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
}
