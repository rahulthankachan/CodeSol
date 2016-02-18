public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("The sum of the array is " + test.sumAll(new int[]{1,2,3}));


	}

	private int sumAll(int[] arraySent) {

		int total = 0;

		for (int i = 0; i < arraySent.length; i++) {
			total += arraySent[i];
		}
		return total;
	}
}
