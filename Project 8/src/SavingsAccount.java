/***********************
 * Hugh Brennan
 * CITP 190
 * March 23, 2012
 * Project 8
 **********************/

/*******************************************
 * The SavingsAccount class inherits the 
 * Account class.  It includes instance
 * variables for monthly interest rate and 
 * the monthly interest payment.
 ******************************************/
public class SavingsAccount extends Account

{
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	public SavingsAccount(double monthlyInterestRate)
	{
		super(monthlyInterestRate);
		this.monthlyInterestRate = monthlyInterestRate;
	}
	
	public double getMonthlyInterestPayment()
	{
		return monthlyInterestPayment;
	}
	
	/********************************************
	 * This method calculates the monthly
	 * interest rate and returns the balance
	 *******************************************/
	public void calculateMonthlyInterestPayment()
	{
		monthlyInterestPayment = balance * monthlyInterestRate;
		balance = balance + monthlyInterestPayment;
		return;
	}
		
}
