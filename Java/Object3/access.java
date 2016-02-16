package geometry;

public class Circle {

	public double radius;
	Point center;
	private String figureName;

	public Circle(double radius, int x, int y) {
		this.radius = radius;
		this.center = new Point(x, y);
		this.figureName = "Fig" + radius + " cen " + x + y; 
	}

	public Circle() {
		this(1.0, 0, 0);
	}

	public double getRadius() {
		return radius;
	}

	public void updateRadius(Circle c1, double radius) {
		c1.radius = radius;
	}

	public Point getCenter() {
		return this.center;
	}

	public String getFigureName() {
		return this.figureName;
	}
}
