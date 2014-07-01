/****************************************************************************
* Hugh Brennan        |
* CIPT 190			  |
* February 10, 2012   |
* *********************
* This program accepts a numeric input value from the user.  The value
* must be between 0 - 99.  The results that are displayed show the number of 
* quarters, dimes, nickels, and pennies contained in the number.
*****************************************************************************/

import java.util.Scanner;

public class Project3_2 
{
	public static void main(String[] args)
		{
			
			//Welcome message
			System.out.println("Welcome to the Interest Calculator");
			System.out.println();
			Scanner sc = new Scanner(System.in);
					
			String choice = "y";
			while (choice.equalsIgnoreCase("y"))
			
			{
				System.out.println("Enter number of cents (0-99):   " + "\n");
				int myChange = sc.nextInt();
				
				int myQuarter = myChange / 25;
					myChange = myChange % 25;
				int myDime = myChange / 10;
					myChange = myChange %10;
				int myNickel = myChange / 5;
					myChange = myChange % 5;
				int myPenny = myChange / 1;
					myChange = myChange % 1;
					
					
				System.out.println("Quarters:   " + myQuarter);
		        System.out.println("Dimes: =    " + myDime);
		        System.out.println("Nickels: =  " + myNickel);
		        System.out.println("Pennies: =  " + myPenny);
		       
				System.out.print("Do you wish to continue? (y/n):  ");
				choice = sc.next();
							
			}
		}
}
