/***********************
 * Hugh Brennan
 * CITP 190
 * March 23, 2012
 * Project 8
 * ********************/

/****************************************************************
* This is the Account class.  It implements the three interfaces.
* The class also includes a instance variable for the balance.
****************************************************************/

public class Account implements Depositable, Withdrawable, Balanceable
{

	protected double balance;

	public Account (double balance)
	{
		this.balance = balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public double getBalance()
	{
		return balance;
	}
	
	@Override
	public void withdraw(double amount) 
	{
		if (amount <= balance)
		{
			balance = balance - amount;
		}
	}

	@Override
	public void deposit(double amount) 
	{
		balance = balance + amount;	
	}
	
}