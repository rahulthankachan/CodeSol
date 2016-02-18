public class TestPad {

	public static void main(String[] args) {

		Calculator myCal = new MyCalculator();
		System.out.println("The sum of 3 and 5 is = " + myCal.sum(3, 5) );




	}
}

class MyCalculator implements Calculator {

	@Override
	public int sum(int x, int y) {
		return x + y;
	}
}





