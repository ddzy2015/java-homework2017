package lab6;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0;
		int i = 0;
		int sign = 1;
		do {
			result += sign*4/(double)(2*i+1);
			System.out.println(result);
			sign *= -1;
			i++;
		} while (!(result < 3.14160 && result > 3.14159));
		System.out.printf("%d Times", i);
	}

}
