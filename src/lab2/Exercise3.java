package lab2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("Input three integers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		System.out.printf("sum: %d\n", num1 + num2 + num3);
		System.out.printf("aver: %d\n", (num1 + num2 +num3)/3);
		System.out.printf("product: %d\n", num1 * num2 * num3);
		int max = num1 > num2 ? num1 : num2;
		max = max > num3 ? max : num3;
		System.out.printf("max: %d\n", max);
		int min = num1 < num2 ? num1 : num2;
		max = min < num3 ? min : num3;
		System.out.printf("min: %d\n", min);
		scanner.close();
	}

}
