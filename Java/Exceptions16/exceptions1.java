import java.util.Scanner;

public class TestPad {

	public static void main(String[] args) {

		int denominator = Integer.parseInt(args[0]);
		ExceptionsDemo ed = new ExceptionsDemo();
		System.out.println("The value after dividing 5 by " + denominator + " is "+ ed.divideBy(denominator));

	}
}


class ExceptionsDemo {

	public double divideBy(int denominator) {
		try {
		return 5/denominator;
	} catch (ArithmeticException e) {
		System.out.println("Division by 0 is not allowed");
		return -1;

	}


	}
}
