package banking;

import java.lang.Enum;

public class BankAccount {

	int accountNumber;
	double balance;
	String accountHolderName;
	BankAccountStatus status;

	public BankAccount() {
		this.status = BankAccountStatus.OPEN;
	}

	@Override
	public String toString() {
		return "Account " + String.valueOf(accountNumber) + " balance " + String.valueOf(balance);
	}

	public static BankAccount parse(String account) {
		String[] strAll = account.split(":");
		BankAccount parsed = new BankAccount();
		parsed.accountNumber = Integer.parseInt(strAll[0]);
		parsed.accountHolderName = strAll[1];
		parsed.balance = Double.parseDouble(strAll[2]);
		parsed.status = BankAccountStatus.valueOf(strAll[3]);

		return parsed;

	}

	public String toWrite(){

		return this.accountNumber + ":" + this.accountHolderName + ":" + this.balance + ":" + this.status;
	}
}
