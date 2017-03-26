package lab5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		System.out.println("Please input 10 integer.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int largest = number;
		counter++;
		while (counter < 10) {
			number = scanner.nextInt();
			largest = number > largest ? number:largest;
			counter++;
		}
		System.out.printf("the largest is %d", largest);
	}

}
