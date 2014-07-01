/**********************************************************
* Hugh Brennan    |
* CITP 190		  |
* Project 6		  |
* March 2, 2012   |
* *********************************************************
* This class verifies that a valid integer has been 
* entered and that it falls within a certain range.  It 
* also checks that valid text has been entered. 
**********************************************************/

import java.util.Scanner;

public class Validator 
{
	
	static Scanner sc = null;
	
	@SuppressWarnings("static-access")
	public Validator(Scanner sc)
	{
		this.sc = sc;   
	}

	//This method will validate the menu option
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
				System.out.println("Please enter a valid menu choice.");
			}
			sc.nextLine();
		}
		return i;
	}
	
	//This method will validate the menu option is between 1 & 3
	public static int getIntWithinRange(Scanner sc, String prompt, 
			int min, int max)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			i = getInt(sc, prompt);
			if ( i <= min)
				System.out.println("The number must be greater " +
						"than zero");
			else if (i >= max)
				System.out.println("The number must be less than " +
						"four");
			else	
				isValid = true;
		}
		return i;
	}
	
	//This method will validate valid text has been entered
	public static String getString(String prompt)
	{
		String s = "";
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.equals(""))
			{
				System.out.println("This is a required entry.");
			}
			else
			{
				isValid = true;
			}
		}
		return s;
	}
}
