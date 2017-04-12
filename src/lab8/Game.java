package lab8;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	
	public static void play() {
		switch (random.nextInt(3) + 1) {
		case 1:
			playGame(random.nextInt(9) + 1);
			break;
		case 2:
			playGame(random.nextInt(9) + 1, random.nextInt(9) + 1);
			break;
		case 3:
			playGame(random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1);
			break;
		};
	}
	
	private static void playGame(int a) {
		int input;
		do {			
			System.out.printf("Please find the square of %d: ", a);
			input = scanner.nextInt();
		} while (input != a*a );
		System.out.println("Congratulations!");
	}
	
	private static void playGame(float a, float b) {
		double input;
		do {			
			System.out.printf("Please find the product of %f and %f:　", a, b);
			input = scanner.nextDouble();
		} while (input != a*b);
		System.out.println("Congratulations!");
	}
	
	private static void playGame(int a, int b, int c) {
		int input;
		do {			
			System.out.printf("Please find the sum of %d, %d and %d:　", a, b, c);
			input = scanner.nextInt();
		} while (input != a + b + c);
		System.out.println("Congratulations!");
	}
}
