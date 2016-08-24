import java.util.Arrays;
import java.util.Comparator;

public class TestPad {

	public static void main(String[] args) {

		// Creation of the objects

		Fruit f1 = new Fruit("Apple", 20, "Kashmir", 20.0f);
		Fruit f2 = new Fruit("Jackfruit", 2, "Kerala", 100.0f);
		Fruit f3 = new Fruit("Mango", 200, "Maharashtra", 60f);
		Fruit f4 = new Fruit("Oranges", 13, "Andhara Pradesh", 10.0f);
		Fruit f5 = new Fruit("Papaya", 24, "Punjab", 50.0f);

		Fruit[] myBox = new Fruit[] {f1, f2, f3, f4, f5};
		display(myBox);

		Arrays.sort(myBox);

		System.out.println("\nAfter Sorting using the static ananymous class ");
		Arrays.sort(myBox, NameComparator);
		display(myBox);


		System.out.println("\n\nSorting based on the average Price and using an independednt Comparator class");
		Arrays.sort(myBox, new FruitPriceComparator());
		display(myBox);


	}


	public static void display(Fruit[] array) {
		System.out.println("\n\nThe fruits in the bag are : ");
		for (Fruit f: array) {
			System.out.println(f);
		}
	}

	public static Comparator<Fruit> NameComparator = new Comparator<Fruit>() {
		@Override
		public int compare(Fruit f1, Fruit f2) {
			return f1.getName().compareTo(f2.getName());
		}
	};
}




class Fruit implements Comparable<Fruit>{
	private int qty;
	private String name;
	private String areaFound;
	private float averagePrice;

	public Fruit(String fName, int fQty, String fAreaFound, float fAveragePrice) {
		this.name = fName;
		this.qty = fQty;
		this.areaFound = fAreaFound;
		this.averagePrice = fAveragePrice;
	}

	public String getName() {
		return name;
	}
	
	public int getQuantity() {
	 	return qty;
	}

	public float getPrice() {
		return averagePrice;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Qty: " + qty + " Area Found: " + areaFound + " Average Price: " + averagePrice;
	}

	@Override 
	public int compareTo(Fruit other) {
		if (qty > other.qty) {
			return 1;
		} else if (qty < other.qty){
			return -1;
		}
		return 0;
	}
}


class FruitPriceComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit f1, Fruit f2) {
		if (f1.getPrice() - f2.getPrice() > 0) {
			return 1;
		} else if (f1.getPrice() - f2.getPrice() < 0) {
			return -1;
		}

		return 0;
	}

}





