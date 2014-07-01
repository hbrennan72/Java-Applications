
/***********************
 * Hugh Brennan
 * CITP 190
 * March 23, 2012
 * Project 8
 * *********************
*/

public class SavingsAccount extends Account

{
	private double monthlyFee;
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	
	public SavingsAccount(double monthlyFee)
	{
		super(monthlyFee);
		this.monthlyFee = monthlyFee;
	}
		
	public void setMonthlyFee(double monthlyFee)
	{
		this.monthlyFee = monthlyFee;
	}
	
	public double getMonthlyFee()
	{
		return monthlyFee;
	}
		
	public void setMonthlyInterestPayment(double monthlyInterestPayment)
	{
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	public double getMonthlyInterestPayment()
	{
		return monthlyInterestPayment;
	}
	
	public void calculateMonthlyInterestPayment()
	{
		monthlyInterestPayment = getBalance() * monthlyInterestRate;
		return;
	}
		
}
