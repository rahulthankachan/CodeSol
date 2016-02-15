public class TestPad {

	public static void main(String[] args) {

		Point point1 = new Point();
		point1.x = 0;
		point1.y = 0;

		Point point2 = new Point();
		point2.x = 3;
		point2.y = 4;

		System.out.println("The distance between the points is " + point1.distanceFrom(point2));

		Line line1 = new Line();
		line1.point1 = point1;
		line1.point2 = point2;

		System.out.println("The length of the line segment is " + line1.getLength());

		Point point3 = new Point();
		point3.x = 2;
		point3.y = 2;

		Triangle t = new Triangle();
		t.point1 = point1;
		t.point2 = point2;
		t.point3 = point3;

		System.out.println("The perimeter of the Triangle is " + t.getPerimeter());


	}
}


class Point {

	public double x;
	public double y;

	public double distanceFrom(Point other) {
		return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
	}
}

class Line {

	public Point point1;
	public Point point2;

	public double getLength() {
		return point1.distanceFrom(point2);
	}
}

class Triangle {

	public Point point1;
	public Point point2;
	public Point point3;

	public double getPerimeter() {

		return point1.distanceFrom(point2) + point2.distanceFrom(point3) + point3.distanceFrom(point1);
	}
}
