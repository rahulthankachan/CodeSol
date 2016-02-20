public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();
		test.withoutStringBuilder();
		test.withStringBuilder();




	}

	public void withoutStringBuilder() {

		long start = System.currentTimeMillis();
		String res = "";

		for (int i = 0; i < 10000; i++) {

			res += "X";
		}

		long end = System.currentTimeMillis();
		System.out.println("Without the builder -> " + (end - start));


	}

	public void withStringBuilder() {
		long start = System.currentTimeMillis();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < 10000; i++) {

			res.append("X");
		}

		long end = System.currentTimeMillis();
		System.out.println("With the builder -> " + (end - start));
		String finalString = res.toString();
		System.out.println("The length of the String is " + finalString.length());
	}

}
