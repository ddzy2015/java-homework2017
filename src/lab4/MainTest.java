package lab4;

public class MainTest {

	public static void main(String[] args) {
		
		//test for GradeBook
		System.out.println("This is a test for GradeBook:");
		GradeBook gradeBook = new GradeBook("JAVA", "Dongzy");
		gradeBook.displayMessage();
		System.out.println("Instructor: " + gradeBook.get());
		gradeBook.set("Zhujh");
		System.out.println("Instructor: " + gradeBook.get());
		
		//test for Account
		System.out.println("\nThis is a test for Account(Debit):");
		Account account = new Account("Dongzy", 1000);
		System.out.println(account.getBalance());
		account.debit(500);
		System.out.println(account.getBalance());
		
		//test of Employee
		System.out.println("\nThis is a test for Employee:");
		Employee employee1 = new Employee("Zeyu", "Dong", 12);
		Employee employee2 = new Employee("Junhua", "Zhu", 15);
		System.out.printf("The yearly salary of %s %s is %.2f ten thousand￥\n",
				employee1.getFirstname(), 
				employee1.getLastname(), 
				employee1.getSalary());
		System.out.printf("The yearly salary of %s %s is %.2f ten thousand￥\n",
				employee2.getFirstname(), 
				employee2.getLastname(), 
				employee2.getSalary());
		employee1.setSalary(employee1.getSalary()*1.1);
		employee2.setSalary(employee2.getSalary()*1.1);
		System.out.printf("The yearly salary of %s %s is %.2f ten thousand￥\n",
				employee1.getFirstname(), 
				employee1.getLastname(), 
				employee1.getSalary());
		System.out.printf("The yearly salary of %s %s is %.2f ten thousand￥\n",
				employee2.getFirstname(), 
				employee2.getLastname(), 
				employee2.getSalary());
	}

}
