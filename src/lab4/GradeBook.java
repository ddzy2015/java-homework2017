package lab4;

public class GradeBook {
	
	private String instructor;
	private String course;
	
	public GradeBook(String course, String name) {
		// TODO Auto-generated constructor stub
		this.course = course;
		instructor = name;
	}
	
	public void set(String name) {
		instructor = name;
	}
	
	public String get() {
		return instructor;
	}
	
	public void displayMessage() {
		System.out.printf("Welcome to %s\n", course);
		System.out.printf("This course is presented by %s\n", instructor);
	}
	
}
