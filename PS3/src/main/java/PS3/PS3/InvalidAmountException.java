package PS3.PS3;

public class InvalidAmountException extends Exception {

	private double amount;

	public InvalidAmountException(String message, double amount) {
		super(message);
		this.amount = amount;
		System.out.println("Invalid amount, must be greater than zero: $" + amount);
	}
}
