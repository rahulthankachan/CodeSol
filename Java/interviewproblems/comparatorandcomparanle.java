import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TestPad {

	public static void main(String[] args) {

		List<Fruit> myList = new ArrayList<Fruit>();
		Fruit fruit1 = new Fruit("Banana", 2);
		Fruit fruit2 = new Fruit("Cherry", 200);
		Fruit fruit3 = new Fruit("Mango", 1);
		Fruit fruit4 = new Fruit("Apple", 250);

		myList.add(fruit1);
		myList.add(fruit2);
		myList.add(fruit3);
		myList.add(fruit4);

		for (Fruit temp: myList) {
			System.out.println("The fruit name is " + temp.name + " the quantity is " + temp.quantity);
		}
		
		Collections.sort(myList, QtyComparator);

		for (Fruit temp: myList) {
			System.out.println("The fruit name is " + temp.name + " the quantity is " + temp.quantity);
		}

		Collections.sort(myList, new FruitNameComparator());

		System.out.println("The space is require for the last where a separate class for the comparator is used \n\n\n");
		for (Fruit temp: myList) {
			System.out.println("The fruit name is " + temp.name + " the quantity is " + temp.quantity);
		}

	}

	public static Comparator<Fruit> QtyComparator = new Comparator<Fruit>() {

		        @Override
		        public int compare(Fruit e1, Fruit e2) {
		            return e1.quantity - e2.quantity;
		        }
   		 };

   	public static Comparator<Fruit> NameComparator = new Comparator<Fruit>() {
   		@Override
   		public int compare(Fruit f1, Fruit f2) {
   			return f1.name.compareTo(f2.name);
   		}
   	};
}





class Fruit implements Comparable<Fruit>{
	public int quantity;
	public String name;

	public Fruit(String name, int qty) {
		this.name = name;
		this.quantity = qty;
	}

	@Override
	public int compareTo(Fruit other) {
		if (this.quantity < other.quantity) {
			return 1;
		} else if (this.quantity > other.quantity) {
			return -1;
		} 
		return 0;
	}
}


class FruitNameComparator implements Comparator<Fruit> {

	@Override 
	public int compare(Fruit f1, Fruit f2) {
		if (f1.name.compareTo(f2.name) > 0) {
			return 1;
		} else if (f1.name.compareTo(f2.name) < 0) {
			return -1;
		}

		return 0;
	}
}



