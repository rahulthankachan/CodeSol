package geometry;

public class Point {

	public double x;
	public double y;

	public double distanceFrom(Point other) {
		return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
	}
}

