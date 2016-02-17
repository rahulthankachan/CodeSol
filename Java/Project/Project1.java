package com.dizauvi.training;

import java.util.Scanner;

public class SimpleBank {

	public static void main(String[] args) {

		SimpleBank bank = new SimpleBank();
		bank.showWelcomeMessage();
		bank.showHelpMessage();
		
		do {

			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();

			if (bank.shouldQuit(input)) {
				System.out.println("Thanks for using the system..");
				break;

		 	}else if (input.equalsIgnoreCase("help")) {
		 		bank.showHelpMessage();
		 	}


		} while(true);

	}

	private boolean shouldQuit(String command) {

		if (command.trim().equalsIgnoreCase("quit")) {
			return true;
		} else {
			return false;
		}
	} 

	private void showHelpMessage() {

		String help = "You can do the following...\n open <amount> to open a new account\n\tAn account number will be printed which you must remember.\nclose <accountNumber> to close an existing account.\ndeposit <accountNumber <amount> - to deposit the amount in the account\nbalance <accountNumber> - for balance enquiry"
			+ "\nhelp - to print this help\nquit - to quit the application";
		System.out.println(help);

	}

	private void showWelcomeMessage() {
		System.out.println("Welcome to Simple Banking");
	}


}
