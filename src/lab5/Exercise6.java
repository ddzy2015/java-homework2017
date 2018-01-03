package lab5;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int binary = scanner.nextInt();
		int multiplier = 1;
		int temp;
		int result = 0;
		while (binary != 0) {
			temp = binary % 10;
			binary /= 10;
			result += temp*multiplier;
			multiplier *= 2;
		}
		System.out.println(result);
	}
	
}
