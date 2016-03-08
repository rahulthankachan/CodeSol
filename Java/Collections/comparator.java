import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class TestPad {

	public static void main(String[] args) {

		List<Circle> myList = new ArrayList<Circle>();
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(23);
		Circle c3 = new Circle(2);

		myList.add(c1);
		myList.add(c2);
		myList.add(c3);

		Collections.sort(myList, new CircleComparator());

		for (Circle temp : myList) {
			System.out.println("The radius of the circle is " + temp.radius);
		}
		System.out.println("The sorted Circle list is as follows " + Arrays.toString(myList.toArray()));




	}
}


class Circle {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.valueOf(this.radius);
	}
}


class CircleComparator implements Comparator <Circle> {

	@Override
	public int compare(Circle a, Circle b){
		if (a.radius > b.radius) return 1;
		else if (a.radius == b.radius) return 0;
		return -1;
	}
}
