
/***********************
 * Hugh Brennan
 * CITP 190
 * March 23, 2012
 * Project 8
 * *********************
*/
public class CheckingAccount extends Account

{
	private double monthlyFee;
	private double withdrawalAmount = 0.0;
	private double depositAmount = 0.0;
	private double subtractMonthlyFee;
	
	public CheckingAccount(double monthlyFee)
	{
		super(monthlyFee);
		this.monthlyFee = monthlyFee;
	}
	
	public void setWithdrawalAmount(double withdrawalAmount)
	{
		this.withdrawalAmount = withdrawalAmount;
	}
	
	public double getWithdrawalAmount()
	{
		return withdrawalAmount;
	}
	
	public void setdepositAmount(double depositAmount)
	{
		this.depositAmount = depositAmount;
	}
	
	public double getDepositAmount()
	{
		depositAmount = getDepositAmount() + getBalance();
		return depositAmount;
	}
	
	public void setMonthlyFee(double monthlyFee)
	{
		this.monthlyFee = monthlyFee;
	}
	
	public double getMonthlyFee()
	{
		return monthlyFee;
	}
		
	public double subtractMonthlyFee()
	{
		//double subtractMonthlyFee = getBalance() - monthlyFee;
		return subtractMonthlyFee;
	}

	public double getSubtractMonthlyFee() {
		return subtractMonthlyFee;
	}

	public void setSubtractMonthlyFee(double subtractMonthlyFee) {
		this.subtractMonthlyFee = subtractMonthlyFee;
	}
		
}
