public class TestPad {

	public static void main(String[] args) {

		MathUtil m = null;
		System.out.println("The declared value of PI is " + m.PI);
		m.printPi();   //// This is not the RIGHT Approach
		System.out.println("This is the correct way to access " + MathUtil.PI);

	}
}


class MathUtil {

	public static final double PI = 3.14;

	public static void printPi() {
		double ans = 22.0/7.0;
		System.out.println(ans);
	}
}
