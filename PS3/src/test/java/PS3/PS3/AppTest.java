package PS3.PS3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigorous Test :-)
	 */
	public void testApp() {
		Account test = new Account(1122, 20000, 4.5);// new account, ID,
														// balance, interest
		System.out.println(test.getBalance());
		assertEquals(20000.0, test.getBalance());
		assertEquals(4.5, test.getAnnualInterestRate());
		assertEquals(1122, test.getID());
		try {
			test.withdraw(2500);
		} catch (InsufficientFundsException e) {

		}
		assertEquals(test.getBalance(), (20000.0 - 2500));
		try {
			test.deposit(3000);
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
		assertEquals(test.getBalance(), (20000.0 - 2500 + 3000));
		System.out.println("Balance is " + test.getBalance() + ", Monthly interest is " + test.getMonthlyInterestRate()
				+ " for account created on " + test.getDateCreated());

		Account test2 = new Account();
		test2.setID(1123);
		test2.setBalance(10);
		try {
			test2.withdraw(2500);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		test2.setAnnualInterestRate(1);
		try {
			test2.deposit(-3000);
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
	}
}
