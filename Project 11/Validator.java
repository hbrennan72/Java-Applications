/**********************************************************************
* @author Hugh Brennan        |
* CITP 190			  		  |
* April 13, 2012   	  		  |
* Project 11		       	  |
* *********************************************************************
* 
* The <code>Validator</code> class confirms that a valid integer value
* has been entered and that it falls within a specific range.  It also
* confirms that a valid string has been entered when a string entry is
* required.
* 
***********************************************************************/

import java.util.Scanner;

public class Validator
{
	static Scanner sc = null;

	@SuppressWarnings("static-access")
	public Validator(Scanner sc)
	{
		this.sc = sc;   // initialize the Scanner object for this class
	}

	public int getInt(String prompt)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			String s = getRequiredString(prompt);
			try
			{
				i = Integer.parseInt(s);
				isValid = true;
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Error! Invalid integer value." +
						"Try again.");
			}
		}
		return i;
	}

	public int getIntWithinRange(String prompt, int min, int max)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			i = getInt(prompt);
			if (i <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (i >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
		}
		return i;
	}

	// force the user to enter a string
	public static String getRequiredString(String prompt)
	{
		String s = "";
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.equals(""))
			{
				System.out.println("Error! This entry is required." +
						"Try again.");
			}
			else
			{
				isValid = true;
			}
		}
		return s;
	}
		
}