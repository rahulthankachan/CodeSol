public class TestPad {

	public static void main(String[] args) {

		int denominator = Integer.parseInt(args[0]);
		ExceptionsDemo demo = new ExceptionsDemo();

		double ans = demo.divide5By(denominator);
		System.out.println("The ans after division is " + ans);

		try {
			demo.lessthan5(denominator);
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}

}


class ExceptionsDemo {

	public int divide5By(int denominator)  throws MyRuntimeException{

		try {
			return 5/denominator;

		} catch (ArithmeticException e) {
			throw new MyRuntimeException("Cannot divide by 0!");
		}

	}

	public void lessthan5(int input) throws CustomException {
		if (input > 5) throw new CustomException("The value is too big!!");
	}

}


class CustomException extends Exception {

	public CustomException(String message) {

		super(message);

	}

}

class MyRuntimeException extends RuntimeException {
	public MyRuntimeException(String message) {
		super(message);
	}
}
