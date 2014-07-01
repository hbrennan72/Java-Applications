/******************************************************************************
* Hugh Brennan        |
* CIPT 190			  |
* February 10, 2012   |
* *********************
* This program accepts two numeric values from the user.  The first value
* is a loan amount and the second is an interest rate.  Once these two values 
* have been entered, the application formats the interest rate as a percent.  
* It also determines the interest amount for the loan based on the loan amount 
* and interest rate that were entered by the user.
*******************************************************************************/

import java.util.Scanner;
import java.text.*;
import java.math.*;
public class Project3_1 
{

	public static void main(String[] args) 
	
	{
	
	//Welcome message
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
				
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter loan amount:    ");
			double loanAmount = sc.nextDouble();
			System.out.print("Enter interest rate:       ");
			double interestRate  = sc.nextDouble();
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(3);
			
			double interestTotal = loanAmount * interestRate;
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			System.out.println("Loan amount:     " + currency.format(loanAmount));
			System.out.println("Interest rate:   " + percent.format(interestRate));
			System.out.println("Interest:        " + Math.round(interestTotal) + "\n");
			System.out.print("Do you wish to continue? (y/n):  ");
			choice = sc.next();
		}

	}
}


