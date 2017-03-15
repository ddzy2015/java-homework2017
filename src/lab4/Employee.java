package lab4;

public class Employee {
	
	private String firstname;
	private String lastname;
	private double salary;
	
	public Employee(String first, String last, double salary0) {
		// TODO Auto-generated constructor stub
		firstname = first;
		lastname = last;
		salary = salary0;
	}
	//start get method
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public double getSalary() {
		return salary;
	}
	//start set method
	public void setFirstname(String first) {
		firstname = first;
	}
	
	public void setLastname(String last) {
		lastname = last;
	}
	
	public boolean setSalary(double setValue) {
		if (setValue > 0) {
			salary = setValue;
			return true;
		}
		return false;
	}
	
}
