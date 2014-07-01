
/**********************************************************************
* Hugh Brennan        		  |
* CITP 190			  		  |
* April 20, 2012   	  		  |
* Project 12		       	  |
* *********************************************************************
* 
* The <code>Validator</code> class confirms that a valid string has 
* been entered when a string entry is required.
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