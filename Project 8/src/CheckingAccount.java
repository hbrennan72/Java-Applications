/*******************************************
 * Hugh Brennan
 * CITP 190
 * March 23, 2012
 * Project 8
 ******************************************/

/*******************************************
 * The CheckingAccount class inherits the 
 * Account class.  It includes an instance
 * variable for the monthly fee.  It also
 * includes methods to subtract the monthly
 * fee from the account balance and return
 * monthly fee. 
 ******************************************/

public class CheckingAccount extends Account

{
	private double monthlyFee;
	
		public CheckingAccount(double monthlyFee)
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
	
		/********************************************
		 * This method subtracts the monthly fee and 
		 * returns it.
		 *******************************************/
		public double subtractMonthlyFee()
		{
			balance = balance - monthlyFee;
			return balance;
		}
	
}