import geometry.Circle;

public class TestPad {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.radius = 10;
		System.out.println("The radius of the circle is " + c1.getRadius());

		Circle c2 = new Circle();
		c2.radius = 12;

		System.out.println("The values before : Circle 1 " + c1.radius + " Circle 2: " + c2.radius);

		swapper(c1, c2);

		System.out.println("The values before : Circle 1 " + c1.radius + " Circle 2: " + c2.radius);



	}

	public static void swapper(Circle c1, Circle c2) {

		Circle temp = c1;
		c1 = c2;
		c2 = temp;
		System.out.println("Inside the function");
		System.out.println("The values before : Circle 1 " + c1.radius + " Circle 2: " + c2.radius);
	}
}
