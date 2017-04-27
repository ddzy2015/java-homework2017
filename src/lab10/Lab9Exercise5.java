package lab10;

public class Lab9Exercise5 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		diamondPrintArrayOdd(array);
	}
	
	private static void diamondPrintArrayOdd(int[] array) {
		if (array.length%2!=0) {
			int middle = (array.length-1)/2;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if ((i+j) >= middle &&
							(i+j) <= (3*array.length-3)/2 &&
							j <= i + (middle) &&
							i <= j + (middle)) {
						System.out.printf("%d ", array[(i+j)%array.length]);						
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
}
