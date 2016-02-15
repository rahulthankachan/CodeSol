import java.util.Scanner;

public class TestPad{

	public static void main (String[] args) {

		Printer myPrint = new Printer();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Print quit to quit or else enter a digit for priting till");
		while (scanner.hasNext()) {
			String input = scanner.next();
			if ((input == null) || (input.equalsIgnoreCase("quit"))) {
				break;
			}else {
				int digits = Integer.parseInt(input);
				myPrint.printTillDigits(digits);
				System.out.println("Print quit to quit or else enter a digit for priting till");
			}

		}
	}



}


class Printer{

	public void printTillDigits (int digits) {

		while (digits > 0) {
			System.out.println(digits);
			digits -= 1;
		}
	}
}
