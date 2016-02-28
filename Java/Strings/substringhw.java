public class TestPad {

	public static void main(String args[]) {

		TestPad test = new TestPad();
		System.out.println("The value within the brackets is " + test.getInnerContent(args[0]));
	}

	public String getInnerContent(String in) {
		String out = "";

		int first = in.indexOf('>');
		int last = in.indexOf('<', first + 1);
		out = in.substring(first + 1, last);
		return out;
	}
}

