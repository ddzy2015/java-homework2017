package lab6;

import java.util.Iterator;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input an integer n: ");
		int n = scanner.nextInt();
		int i = 2;
		int count = 0;
		while (i < n) {
			if (primeTest(i)) {
				if (count % 10 == 0) {
					System.out.println();
				}
				System.out.printf("%d\t", i);
				count++;
			}
			i++;
		}
	}
	
	public static boolean primeTest(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
