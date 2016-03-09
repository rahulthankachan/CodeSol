package banking;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;



public class SimpleBank {

	private static Map<Integer, BankAccount> accounts;
	static int total = 0;

	public SimpleBank() {
		accounts = new HashMap<Integer, BankAccount>();
	}
	public void goToBank() {

		System.out.println("");
		Scanner scanner = new Scanner(System.in);

		readAllAccounts();

		do {

			System.out.println("The current time is " + System.currentTimeMillis());
			System.out.println("Hi Welcome");
			System.out.println("1. To view all the balances");
			System.out.println("2. To open an account");
			System.out.println("3. To withdraw some money");
			System.out.println("4. To deposit some money");
			System.out.println("5. To quit the application");
			System.out.println("6. Print Sorted");
			System.out.println("7. Close an account");

			int input = Integer.parseInt(scanner.next());
			if (input == 5) {
				try (BufferedWriter bw= new BufferedWriter(new FileWriter("banking/SimpleBank.txt"))) {
					for (BankAccount temp : accounts.values()) {
						bw.write(temp.toWrite() + "\n");
					} 


				} catch (IOException e) {

				}

				System.out.println("Thank you for banking with us.. Have a great day!!!");
				break;
			}

			if (input == 1) {
				int flag = (SimpleBank.accounts.size() > 0) ? 1 : 0;//SimpleBank.accountExists();
				if (flag == 1) {
					System.out.println("Yay some elements are there ");
					for (Integer x : accounts.keySet()){
						BankAccount temp = accounts.get(x);
						System.out.println("The account numbe is " + temp.accountNumber + " The balance is " + temp.balance);
						System.out.println("The current status of the account is " + temp.status);
					}
				}
			}


			if (input == 2) {

				try {

						//SimpleBank.lessThanMaxException();
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
							SimpleBank.accounts.put(b.accountNumber, b);
						}

				} catch (RuntimeException e) {

					System.out.println("All acoounts are full now");

				}


			}

			if (input == 3) {
				System.out.print("Enter the account number ");
				int temp_account = Integer.parseInt(scanner.next());
				int flag = -1;
				if (SimpleBank.accounts.containsKey(temp_account)) {
					flag = 1;
				}



				if (flag != -1) {
					System.out.print("Enter the amount to be withdrawn ");
					int withdraw = Integer.parseInt(scanner.next());
					BankAccount current = this.accounts.get(temp_account);
					try {
						SimpleBank.withdrawMoney(current, withdraw);
					} catch (LowBalanceException l) {
						System.out.println("There is lesser money than required ");
					}
					

				}




			}



			if (input == 7) {

				System.out.println("Enter the account number of the person to be deleted ");
				int toDelete = Integer.parseInt(scanner.next());
				BankAccount tempAccount = this.accounts.get(toDelete);
				tempAccount.status = BankAccountStatus.CLOSED;


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

	public static void readAllAccounts() {

		try (BufferedReader br = new BufferedReader(new FileReader("banking/SimpleBank.txt"))) {
			String tempAccount = null;
			while ((tempAccount = br.readLine()) != null) {
				BankAccount temp = BankAccount.parse(tempAccount);
				accounts.put(temp.accountNumber, temp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}




}




class AccountsCompare implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount a, BankAccount b) {

		if (a.balance > b.balance) return 1;
		else if (a.balance == b.balance) return 0;

		return -1;
	}

}





