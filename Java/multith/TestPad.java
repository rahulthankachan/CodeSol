public class TestPad {

	public static void main(String[] args) {
		System.out.println("Life is a rollercoaster even a computer has .....");

		Thread high = new Thread(new High());
		Thread low = new Thread(new Low());

		high.start();
		low.start();


	}
}
