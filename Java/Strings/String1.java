public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();
		String s1 = new String(args[0]);
		String s2 = s1.substring(2);

		System.out.println("The value of the new string is" + s2);
		System.out.println("The value of the old string is " + s1);
	}
}
