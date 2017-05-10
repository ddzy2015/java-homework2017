package lab12;

public class Complex {
	
	double realPart;
	double imaginaryPart;
	
	public Complex() {
		realPart = 0;
		imaginaryPart = 0;
	}

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex number) {
		return new Complex(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
	}
	
	public static Complex add(Complex number1, Complex number2) {
		return new Complex(number1.realPart + number2.realPart, number1.imaginaryPart + number2.imaginaryPart);
	}
	
	public Complex multiply(Complex number) {
		return new Complex(
				realPart * number.realPart - imaginaryPart * number.imaginaryPart,
				imaginaryPart * number.realPart + realPart * number.imaginaryPart
				);
	}
	
	public static Complex multiply(Complex number1, Complex number2) {
		return new Complex(
				number2.realPart * number1.realPart - number2.imaginaryPart * number1.imaginaryPart,
				number2.imaginaryPart * number1.realPart + number2.realPart * number1.imaginaryPart
				);
	}
	
	@Override
	public String toString() {
		return String.valueOf(realPart) + "+" + String.valueOf(imaginaryPart) + "i";
	}
	
	public static void main(String[] args) {
		Complex a = new Complex(1, 1);
		Complex b = new Complex(1, 2);
		System.out.println(a.add(b));
		System.out.println(Complex.add(a, b));
		System.out.println(a.multiply(b));
		System.out.println(Complex.multiply(a, b));
	}
	
}
