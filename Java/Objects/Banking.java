
import java.util.Scanner;

public class TestPad {

	public static void main(String[] args) {

		BankAccount user1 = new BankAccount();
		BankAccount user2 =  new BankAccount();

		user1.accountHolder = "Rahul";
		user1.accountNumber = 12345;
		user1.accountBalance = 200;

		user2.accountHolder = "Teena";
		user2.accountNumber = 98765;
		user2.accountBalance = 200;

		Scanner scanner = new Scanner(System.in);

		String ans = "y";


		do {

			System.out.println("Select the user 1 or 2");
			String input = scanner.next();
			int userSelected = Integer.parseInt(input);

			System.out.println("Select the type of transaction \n\t1. Get the account Balance \n\t2. Deposit \n\t3. Withdraw");

			BankAccount current;
			if (userSelected == 1) 
				current = user1;
			else
				current = user2;
			int operation = Integer.parseInt(scanner.next());
			if (operation == 1){
				System.out.println("The current Balance of " + current.accountHolder + " is " + current.getBalance() );
			}else if (operation == 2) {
				System.out.println("Enter the amount to deposit ");
				double moneyToDeposit = Double.parseDouble(scanner.next());
				current.depositMoney(moneyToDeposit);
			}else if (operation == 3) {
				System.out.println("Enter the amount to withdraw");
				double moneyToWithdraw = Double.parseDouble(scanner.next());
				if (moneyToWithdraw <= current.getBalance()) {
					current.withdrawMoney(moneyToWithdraw);
				}

			}




			System.out.println("The current Account Information is as follows");
			System.out.println("For the account holder " + user1.accountHolder + " The balance is " + user1.getBalance());
			System.out.println("For the account holder " + user2.accountHolder + " The balance is " + user2.getBalance());

			System.out.println("Input yes to continue");
			ans = scanner.next();

		}while(ans.equalsIgnoreCase("yes"));




	}
}


class BankAccount {

	public String accountHolder;
	public double accountBalance = 0;
	public int accountNumber;

	public Double getBalance() {

		return accountBalance;

	}

	public void depositMoney(double moneyToAdd) {
		accountBalance += moneyToAdd;
	}

	public void withdrawMoney(double moneyToWithdraw) {
		accountBalance -= moneyToWithdraw;
	}


}
