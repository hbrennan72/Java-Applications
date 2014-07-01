/**********************************************************************
* Hugh Brennan        |
* CIPT 190			  |
* February 17, 2012   |
* *********************
* This program accepts a numeric input value from the user.  The value
* must be between 0 - 10.  The resulting number is the factorial of the
* number that was entered.
***********************************************************************/

import java.util.Scanner;

public class Project4 
{
	public static void main(String[] args)
	{
		//Welcome message
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
			
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
			
		{
			System.out.println("Enter an integer that's greater" 
			+ "than 0 and less than 10:   ");
				
			int factorial = sc.nextInt();
			long myFactorial = factorial;			
			for (int i = factorial; i > 1; i--)
				{
				myFactorial = myFactorial * (i - 1);
				}
										
				System.out.println("The factorial of " + factorial
				+ " is " + myFactorial);
		        		       
				System.out.print("Do you wish to continue? (y/n):  ");
				choice = sc.next();
		}				
	
		
	}
}


