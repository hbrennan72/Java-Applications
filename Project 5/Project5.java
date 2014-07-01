/**********************************************************************
* Hugh Brennan        |
* CIPT 190			  |
* February 24, 2012   |
* *********************
* This program accepts a loam amount, interest rate,
* and number of years from the user.  The value
* must be between 0 - 10.  The resulting number is the factorial of the
* number that was entered.
***********************************************************************/

import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;

public class Project5
{

	/**************************
	 * This is the main method
	 * ************************
	 */
	public static void main(String[] args)
	{
		//Welcome message
		System.out.println("Welcome to the Loan Calculator");
		System.out.println();
		for (int i = 2; i < 10; i++)
				{
				    System.out.println(i);
				}
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y"))

		{
			double loanAmount = getDoubleWithinRange(sc,
				"Enter the loan amount:  ", 0, 1000000);

			double yearlyInterestRate = getDoubleWithinRange(sc,
				"Enter yearly interest rate:  ", 0, 20);

			int myYears = getIntWithinRange(sc,
				"Enter number of years:  ", 0, 100);

			double monthlyInterestRate = yearlyInterestRate/12/100;

			int months = myYears * 12;

			double monthlyPayment = loanAmount * monthlyInterestRate/
					(1 - 1/Math.pow(1 + monthlyInterestRate, months));


			/****************************************
			* Formats the output for the loan amount,
			* interest rate, and monthly loan amount.
			*****************************************
			*/
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			currency.setMaximumFractionDigits(2);
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(1);

			//Results from user input and subsequent calculations
			System.out.println("Loan amount:\t\t\t"
					+ currency.format (loanAmount));
			System.out.println("Yearly Interest Rate:\t\t"
					+ percent.format(yearlyInterestRate/100));
			System.out.println("Number of Years:\t\t" + myYears);
			System.out.println("Monthly payment:\t\t"
					+ currency.format(monthlyPayment));
			System.out.println();
		    System.out.print("Do you wish to continue? (y/n):  ");
		    choice = sc.next();
		    System.out.println();
		}


	}

	/**********************************
	 * This method verifies that a
	 * valid number has been entered
	 * ********************************
	 */
	public static double getDouble(Scanner sc, String prompt)
	{
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextDouble())
			{
				d = sc.nextDouble();
				isValid = true;
			}
			else
			{
				System.out.println("Error!  The number is not valid");
			}
			sc.nextLine();
		}
		return d;
	}


	/**************************************
	 * This method verifies that the number
	 * entered falls with a certain range.
	 * ************************************
	 */
	public static double getDoubleWithinRange(Scanner sc, String prompt,
	double min, double max)
	{
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false)
		{
			d = getDouble(sc, prompt);
			if (d <= min)
			{
				System.out.println("The number must be greater than "
				+ min + ".");
			}
			else if (d >= max)
			{
				System.out.println("The number must be less than "
				+ max + ".");
			}
			else
				isValid = true;
			}
			return d;
	}

	/**************************************
	 * This method verifies that an integer
	 * has been entered
	 * ************************************
	 */

	public static int getInt(Scanner sc, String prompt)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextInt())
			{
				i = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("The number is not valid.");
			}
				sc.nextLine();
			}
			return i;
	}

	/***************************************
	 * This method verifies that the integer
	 * entered falls with a certain range.
	 * *************************************
	 */

	public static int getIntWithinRange(Scanner sc, String prompt,
	int min, int max)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			i = getInt(sc, prompt);
			if (i <= min)
				{
					System.out.println("The number must be greater than "
					+ min + ".");
				}
				else if (i >= max)
				{
					System.out.println("The number must be less than "
					+ max + ".");
				}
				else
					isValid = true;
			}
			return i;
	}
}

