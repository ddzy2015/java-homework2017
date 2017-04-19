package lab2;

import java.util.Scanner;

public class Exercise6 {


	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input r as integers:");
		int r = scanner.nextInt();
		System.out.printf("the diameter is: %d\n", 2*r);
		System.out.printf("the circumference is: %f\n", 2*PI*r);
		System.out.printf("the area is: %f", PI*r*r);
		scanner.close();
	}
	
}
