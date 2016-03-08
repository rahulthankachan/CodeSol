import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class TestPad {

	public static void main(String[] args) {

		Circle c1 = new Circle(2);
		Circle c2 = new Circle(1);

		List<Circle> myList = new ArrayList<Circle>();
		myList.add(c1);
		myList.add(c2);

		Collections.sort(myList);

		System.out.println("The circles with their arrays is " + Arrays.toString(myList.toArray()));


	}
}



class Circle implements Comparable <Circle>{

	int radius = 0;

	public Circle(int radius) {
		this.radius = radius;
	}


	@Override 
	public int compareTo(Circle c) {
		if (this.radius < c.radius) return -1;
		else if (this.radius == c.radius) return 0;

		return 1;
	}

	@Override
	public String toString(){
		return String.valueOf(radius);
	}
}

