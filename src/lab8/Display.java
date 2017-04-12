package lab8;

public class Display {
	
	public static void triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void triangle(int n, String a) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				for (int j2 = 0; j2 < a.length(); j2++) {					
					System.out.print(" ");
				}
			}
			for (int j = 0; j < 2*i - 1; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
}
