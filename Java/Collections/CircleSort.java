import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TestPad {

	public static void main(String[] args) {

		List <Circle> my = new ArrayList<Circle> ();

		my.add(new Circle(3));
		my.add(new Circle(33));
		my.add(new Circle(2));
		my.add(new Circle(1));



		Collections.sort(my);

		System.out.println("The sorted arrays is");
		System.out.println(Arrays.toString(my.toArray()));
	}
}
