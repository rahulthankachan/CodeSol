import java.util.Scanner;

public class TestPad{

	public static void main (String[] args) {

		Printer myPrint = new Printer();

		Scanner scanner = new Scanner(System.in);
		
		do {

			String input = scanner.next();
			if (((input == null)) || (input.equalsIgnoreCase("quit"))) {
				break;
			}else {
				int digits = Integer.parseInt(input);
				myPrint.printTillDigits(digits);
			}


		} while (scanner.hasNext());
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
