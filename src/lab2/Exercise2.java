package lab2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("Input two integers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		System.out.printf("sum :%d\n", num1 + num2);
		System.out.printf("diff: %d\n", num1 - num2);
		System.out.printf("product: %d\n", num1 * num2);
		System.out.printf("quotient%.10f\n", (float) num1 / num2);
		scanner.close();
	}

}
