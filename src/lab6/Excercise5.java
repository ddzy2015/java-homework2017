package lab6;

public class Excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		do {
				int d1 = i % 10;
				int d2 = (i % 100) / 10;
				int d3 = i / 100;
				System.out.println(d1*d1*d1+d2*d2*d2+d3*d3*d3);
				i++;
		} while (i <= 999);
	}

}
