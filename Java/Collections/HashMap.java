import java.util.Map;
import java.util.HashMap;

public class TestPad {

	public static void main(String[] args) {

		Map <Integer, String> my = new HashMap <Integer, String> ();
		my.put(1, "Rahul Thankachan");
		my.put(2, "Teena ");
		my.put(3, "Value 3");


		System.out.println("The value for the key 1 is " + my.get(1));
		System.out.println("Checking if Ram is there in the database " + my.containsKey(5));

		System.out.println("The size of the Map is " + my.size());
	}
}
