import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TestPad {

	public static void main(String[] args) {

		List <Integer> my = new ArrayList<Integer> ();

		my.add(1);
		my.add(0);
		my.add(23);
		my.add(-2);


		Collections.sort(my);

		System.out.println("The sorted arrays is");
		System.out.println(Arrays.toString(my.toArray()));
	}
}
