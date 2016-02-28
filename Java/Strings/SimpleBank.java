package banking;

import java.util.Scanner;

public class SimpleBank {

	private static BankAccount[] accounts;
	static int total = 0;
	static final int MAX = 5;

	public SimpleBank() {
		accounts = new BankAccount[MAX];
	}
	public void goToBank() {

		System.out.println("");
		Scanner scanner = new Scanner(System.in);


		do {

			System.out.println("Hi Welcome");
			System.out.println("1. To view all the balances");
			System.out.println("2. To open an account");
			System.out.println("3. To withdraw some money");
			System.out.println("4. To deposit some money");
			System.out.println("5. To quit the application");

			int input = Integer.parseInt(scanner.next());
			if (input == 5) {
				System.out.println("Thank you for banking with us.. Have a great day!!!");
				break;
			}

			if (input == 1) {
				int flag = SimpleBank.accountExists();
				if (flag == 1) {
					System.out.println("Yay some elements are there ");
					for (int i = 0; i < SimpleBank.total; i++) {
						BankAccount temp = SimpleBank.accounts[i];
						System.out.println("The account Balance is " + temp.balance + " for " + temp.accountNumber);

					}
				}
			}


			if (input == 2) {

				try {

						SimpleBank.lessThanMaxException();
						BankAccount b = new BankAccount();
						System.out.println("Enter the name of the customer ");
						b.accountHolderName = scanner.next();
						System.out.println("Enter the account number ");
						b.accountNumber = Integer.parseInt(scanner.next());
						System.out.println("Enter the amount to be deposited ");
						double amount = Double.parseDouble(scanner.next());

						if (amount == 0) {
							throw new RuntimeException("Balance cannot be null ");
						} else {
							b.balance = amount;
							SimpleBank.accounts[SimpleBank.total] = b;
							SimpleBank.total += 1;
						}

				} catch (RuntimeException e) {

					System.out.println("All acoounts are full now");

				}


			}

			if (input == 3) {
				System.out.print("Enter the account number ");
				int temp_account = Integer.parseInt(scanner.next());
				int flag = -1;
				for (int i = 0 ; i < accounts.length; i++) {
					if (accounts[i].accountNumber == temp_account) {
						flag = i;
						break;
					}
				}



				if (flag != -1) {
					System.out.print("Enter the amount to be withdrawn ");
					int withdraw = Integer.parseInt(scanner.next());
					BankAccount current = accounts[flag];
					try {
						SimpleBank.withdrawMoney(current, withdraw);
					} catch (LowBalanceException l) {
						System.out.println("There is lesser money than required ");
					}
					

				}




			}



			if (input == 4) {

				System.out.print("Enter the account number ");
				int temp_account = Integer.parseInt(scanner.next());
				int flag = -1;

				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i].accountNumber == temp_account) {
						flag = i;
						break;
					}
				}

				if (flag != -1) {

					System.out.print("Enter the amount of money to be deposited ");
					int deposit = Integer.parseInt(scanner.next());
					BankAccount current = accounts[flag];

					SimpleBank.depositMoney(current, deposit);
				}

			}
				
			


		} while (scanner.hasNext());
	}



	public static void main(String args[]) {

		SimpleBank bank = new SimpleBank();
		bank.goToBank();
	}


	public static int accountExists() {

		if (SimpleBank.total <= 0) {
			throw new RuntimeException("There are no account");
		}
		return 1;
	}



	public static int lessThanMax() {

		if (SimpleBank.total < 10) {
			return 1;
		} else {
			return 0;
		}
	}


	public static void withdrawMoney(BankAccount ba, double amount) throws LowBalanceException {

		if (ba.balance < amount) {
			throw new LowBalanceException("You dont havve enough money");
		} 

		ba.balance -= amount;

	}

	public static void depositMoney(BankAccount ba, double amount) {

		ba.balance += amount;
	}


	public static int lessThanMaxException() throws RuntimeException {

		if (SimpleBank.total >= 10) {
			throw new RuntimeException("Max storage reached");
		} 

		return 1;


	}




}
