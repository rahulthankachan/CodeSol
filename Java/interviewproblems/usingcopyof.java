import java.util.Arrays;

public class TestPad {

	public static void main(String[] args) {

		// This function is used to just copy the contents of an array into the other

		int[] myArray = new int[]{2,3,4,0};
		int[] tempArray = Arrays.copyOf(myArray, 50);

		Arrays.sort(tempArray);
		printArray(tempArray);

		System.out.println("The status of the array inside the Main function is");
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i]);
		}

	}


	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
