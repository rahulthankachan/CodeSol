package banking;

public class LowBalanceException extends Exception {

	public LowBalanceException(String input) {
		super(input);
	}
}
