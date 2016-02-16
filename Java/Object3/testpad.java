import geometry.*;

public class TestPad {

	public static void main(String[] args) {

		Circle c1 = new Circle(12, 1, 2);
		System.out.println("The radius of the circle is " + c1.radius);
		Point cen = c1.center;
		System.out.println("The center is x = " + cen.x + " y=" + cen.y);


	}
}

