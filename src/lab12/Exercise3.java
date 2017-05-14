package lab12;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sideCount;
		float sideLength;
		double area;
		System.out.print("please input the number of side: ");
		sideCount = scanner.nextInt();
		System.out.print("please inpot the side lenth: ");
		sideLength = scanner.nextFloat();
		area = sideCount * sideLength * sideLength / (4 * Math.tan(Math.PI / sideCount));
		System.out.println("the area of the polygon is: " + String.valueOf(area));
		scanner.close();
	}

}
