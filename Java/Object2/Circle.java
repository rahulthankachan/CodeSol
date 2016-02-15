package geometry;

public class Circle {

	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this(1);
	}

	public double getRadius() {
		return radius;
	}

	public void updateRadius(Circle c1, double radius) {
		c1.radius = radius;
	}
}
