public class Circle implements Comparable <Circle>{

	public int radius = 0;

	public Circle(int in_radius) {
		this.radius = in_radius;
	}

	@Override
	public int compareTo(Circle o) {
		if (this.radius < o.radius) return -1;
		if (this.radius == o.radius) return 0;
		
		return 1;
	}

	@Override
	public String toString() {
		return "Radius" + String.valueOf(this.radius);
	}


}
