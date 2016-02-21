public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();
		ExceptionDemo ex = new ExceptionDemo();
		int x = 0;

		try{
			x = ex.isGreaterThan(Integer.parseInt(args[0]));
		} catch (CustomException1 e) {
			e.printStackTrace();
			x = 30;
		} catch (CustomException2 e) {
			x = 50;
		} finally {
			System.out.println("This will always be printed");
		}

		System.out.println("The value of x is " + x);
		

		

	}


}


class ExceptionDemo {

	public int isGreaterThan(int input) throws CustomException1, CustomException2 {

		if (input > 5) throw new CustomException1("It's too big");
		else if (input == 5) throw new CustomException2("You just dont get it, dont you :P");
		return input;

	}

}


class CustomException1 extends Exception {
	public CustomException1(String message) {
		super(message);
	}

}

class CustomException2 extends Exception {

	public CustomException2(String message) {
		super(message);
	}
}
