
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestPad {


	public static void main(String[] args) throws Exception{ 

		List<Integer> listOfInts = new ArrayList<Integer>();

		listOfInts.add(1);
		listOfInts.add(2);
		listOfInts.add(3);
		listOfInts.add(4);

		int sum = 0;

		for (Integer i : listOfInts) {
			sum += i;
		}

		System.out.println("The sum of the list is " + sum);

	}
}
