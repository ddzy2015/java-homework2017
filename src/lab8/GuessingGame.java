package lab8;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	private int magicNum;
	private int max = 100;
	private int min = 1;
	private enum Status{CONTINUE, WON, LOST};
	
	public GuessingGame() {
		Random random = new Random();
		magicNum = random.nextInt(max) + 1;
	}
	
	public void guess() {
		Random random = new Random();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Status gameStatus = Status.CONTINUE;
		
		while (gameStatus == Status.CONTINUE) {
			System.out.printf("--Please input a integer between %d and %d--\n", min, max);
			int input = scanner.nextInt();
			if (input < 0 || input > max){
				System.out.printf("You should input a integer between %d and %d\n", min, max);
				continue;
			} else {
				if (input > magicNum) {
					System.out.println("Your input is too large");
					max = input - 1;
				} else if (input < magicNum) {
					System.out.println("Your input is too small");
					min = input + 1;
				} else {
					gameStatus = Status.WON;
					System.out.printf("You win the game, the magicNumber is %d\n", magicNum);
					break;
				}
			}
			
			input = random.nextInt(max - min + 1) + min;
			System.out.printf("The computer guess %d, ", input);
			if (input > magicNum) {
				System.out.println("the number is too large");
				max = input - 1;
			} else if (input < magicNum) {
				System.out.println("the number is too small");
				min = input + 1;
			} else {
				System.out.println("you lost game.");
				gameStatus = Status.LOST;
			}
		}
	}
	
}
