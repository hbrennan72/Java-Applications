/***********************
 * Hugh Brennan
 * CITP 190
 * March 23, 2012
 * Project 8
 * ********************/

/******************************************
 * The Transactions class contains two 
 * public static methods for depositing or 
 * withdrawing funds from either the 
 * checking or savings account. 
 *****************************************/
public class Transactions
{
	
	public static void deposit(Depositable account, double amount)
	{
		account.deposit(amount);
		return;
	}
	
	public static void withdraw(Withdrawable account, double amount)
	{
		account.withdraw(amount);
		return;
	}

}
