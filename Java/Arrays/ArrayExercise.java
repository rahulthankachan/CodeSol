public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();

		int[] ansEleven = test.return11(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 11, 12, 13, 14, 15});
		System.out.println("The array elements are ");

		for (int i : ansEleven) {
			System.out.println(i);
		}

	}

	private int[] return11(int[] complete) {

		int[] elevenElement = new int[11];

		for (int i=0; i<complete.length; i ++) {
			if (i >= 11) 
				break;
			elevenElement[i] = complete[i];
		}

		return elevenElement;
	}
}
