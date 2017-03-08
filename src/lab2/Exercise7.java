package lab2;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input r as integers:");
		int num = scanner.nextInt();
		if (num < 10000) {
			System.out.println("fewer than five digits");
		} else if (num >= 100000) {
			System.out.println("more than five digits");
		} else {
			System.out.printf("%d\t", num / 10000);
			System.out.printf("%d\t", (num % 10000) / 1000);
			System.out.printf("%d\t", (num % 1000) / 100);
			System.out.printf("%d\t", (num % 100) / 10);
			System.out.printf("%d", num % 10);
		}
		scanner.close();
	}

}
