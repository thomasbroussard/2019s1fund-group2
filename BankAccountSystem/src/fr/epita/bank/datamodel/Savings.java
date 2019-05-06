package fr.epita.bank.datamodel;

public class Savings extends Account{
	
	private double rate;
	
	
	public Savings(double balance, double rate) {
		this.balance = balance;
		this.rate = rate;
	}
	
	
	/**
	 * <h3> goal </h3>
	 * This method computes the interest rate for the current year
	 * 
	 * <h3> usage </h3>
	 * <pre><code>
	 * Savings savings;
	 * double amount = savings.computeInterest();
	 * </code></pre>
	 * @return the computed amount
	 */
	public double computeInterest() {
		double amount = this.rate * this.balance;
		return amount;
	}
	
	
	/**
	 * <h3>goal</h3>
	 * This is whithdrawing some money on the current account
	 * 
	 * <h3>usage</h3>
	 * <pre><code>Savings savings;
	 * double amount = savings.withdraw(500.0);</code></pre>
	 * 
	 * @param amount the amount to be retracted
	 */
	public void withDraw(double amount) {
		if (this.balance > amount) {
			// this.balance = this.balance - amount;
			this.balance -= amount; // equivalent to commented line
		}
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	
	
	
}
