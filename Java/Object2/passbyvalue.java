import geometry.Circle;

public class TestPad {

	public Circle c1;
	public Circle c2;


	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.radius = 10;
		System.out.println("The radius of the circle is " + c1.getRadius());

		Circle c2 = new Circle();
		c2.radius = 12;


		TestPad myTest = new TestPad();
		myTest.c1 = c1;
		myTest.c2 = c2;

		System.out.println("This is for the class circles");
		System.out.println("The values before : Circle 1 " + myTest.c1.radius + " Circle 2: " + myTest.c2.radius);
		System.out.println("This is for the ouside normal variable");
		System.out.println("The values before : Circle 1 " + c1.radius + " Circle 2: " + c2.radius);

		myTest.truSwapper();

		System.out.println("After Swapping .....");
		System.out.println("This is for the class circles");
		System.out.println("The values before : Circle 1 " + myTest.c1.radius + " Circle 2: " + myTest.c2.radius);

		System.out.println("This is for the ouside normal variable");
		System.out.println("The values before : Circle 1 " + c1.radius + " Circle 2: " + c2.radius);







	}

	public void swapper(Circle c1, Circle c2) {

		Circle temp = c1;
		c1 = c2;
		c2 = temp;
		System.out.println("Inside the function");
		System.out.println("The values before : Circle 1 " + c1.radius + " Circle 2: " + c2.radius);
	}

	public void updateRadius(Circle c1, double rad) {
		c1.radius = rad;
	}

	public void truSwapper(){
		Circle temp = this.c1;
		this.c1 = this.c2;
		this.c2 = temp;

	}


}
