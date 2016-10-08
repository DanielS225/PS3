package PS3.PS3;

import java.util.Date;
import PS3.PS3.InsufficientFundsException;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;// assumed the same for all accounts
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}

	public Account(int id, double balance, double annualInterestRate) {
		this(id, balance);
		this.annualInterestRate = annualInterestRate;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}

	public void withdraw(double w) throws InsufficientFundsException {
		if (w > this.balance) {
			throw new InsufficientFundsException("Cannot make withdrawal", this.balance, w);
		} else {
			this.balance -= w;
		}
	}

	public void deposit(double d) throws InvalidAmountException {
		if (d > 0) {
			this.balance += d;
		} else
			throw new InvalidAmountException("Invalid amount", d);
	}

}
