package PS3.PS3;

public class InsufficientFundsException extends Exception{
	
	private double withdrawal;
	private double balance;
	
	public InsufficientFundsException(String message, double balance, double withdrawal) {
		super(message);
		this.withdrawal = withdrawal;
		this.balance = balance;
		System.out.println("Cannot withdraw $" + withdrawal + " from account with $" + balance + ".");
	}
	
}
