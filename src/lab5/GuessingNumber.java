package lab5;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
	
	private int magicNum;
	private final int range = 10;
	
	public GuessingNumber() {
		// TODO Auto-generated constructor stub
		Random random = new Random();
		magicNum = random.nextInt(range+1);
	}
	
	public void guess() {
		System.out.printf("Please input a integer between 0 and %d (-1 to give up): ", range);
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		while (input != magicNum && input != -1) {
			if (input < 0 || input > range){
				System.out.printf("Please input a integer between 0 and %d: ", range);
			} else if (input > magicNum) {
				System.out.print("Please try again. The correct answer is smaller: ");
			} else if (input < magicNum) {
				System.out.print("Please try again. The correct answer is bigger: ");
			}
			input = scanner.nextInt();
		}
		if (input != -1) {
			System.out.println("Congratulations!");
		}
	}
	
}
