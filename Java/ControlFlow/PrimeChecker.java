import java.util.Scanner;

public class TestPad{

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		PrimeChecker prime = new PrimeChecker();

		System.out.println("Enter the number to check for prime or QUIT for quitting");
			
		do {

			String input = scanner.next();

			if ((input.equalsIgnoreCase("quit")) || input == null ) {
				break;
			}else {
				int digit = Integer.parseInt(input);
				boolean result = prime.isPrime(digit);
				System.out.println("The number " + digit + " is Prime : " + result);
			}
			
			System.out.println("Enter the number to check for prime or QUIT for quitting");
		} while(scanner.hasNext());
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

class PrimeChecker{

	public boolean isPrime(int digit) {


		for (int i = 1; i <= digit/2; i++) {
			if (digit % i == 0) {
				if ((i != 1) && i!= digit) {
					return false;
				}
			}
		}

		return true;

	}
}
