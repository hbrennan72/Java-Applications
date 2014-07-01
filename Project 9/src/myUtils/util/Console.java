/**********************************************************************
* @author Hugh Brennan        |
* CITP 190			  		  |
* April 2, 2012   	  		  |
* Project 9			       	  |
* *********************************************************************
* The <code>Console</code> class validates the data entered by the user 
* in the ConsoleTestApp class.  It validates whether data has been 
* entered, if the data is of the correct type, and if the data falls 
* with a certain range. 
***********************************************************************/

package myUtils.util;
import java.util.Scanner;

public class Console 
{
	Scanner sc = new Scanner (System.in);
	
	/********************************************
	* This method requires that the user enter a 
	* valid integer value.  If the user doesn't 
	* enter a correct integer value, the user 
	* will receive an error message.  
	********************************************/
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

	/*********************************************
	* This method requires that the user enter a 
	* integer value within a specific range.  If 
	* the value falls outside of the range, the 
	* user will receive an error message.  
	*********************************************/
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

	/********************************************
	* This method requires that the user enter a 
	* valid double value.  If the user doesn't 
	* enter a correct integer value, the user 
	* will receive an error message.  
	********************************************/
	public double getDouble(String prompt)
	{
		double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			String s = getRequiredString(prompt);
			try
			{
				d = Double.parseDouble(s);
				isValid = true;
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Error! Invalid decimal value." +  
				"Try again.");
				
			}
		}
		return d;
	}

	/*************************************************
	* This method requires that the user enter a 
	* double value within a specific range.  If 
	* the value falls outside of the range, the 
	* user will receive an error message.  
	*************************************************/
	public double getDoubleWithinRange(String prompt, 
			double min, double max)
	{
		double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			d = getDouble(prompt);
			if (d <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (d >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
		}
		return d;
	}

	/*********************************************
	* This method requires that the user enter a 
	* string.  If the user doesn't enter any data,
	* the user will receive an error message.  
	*********************************************/
	public String getRequiredString(String prompt)
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

	/******************************************************
	* This method requires that the user select a specific 
	* character. The user only has two choices. The method 
	* ignores the case of the character entered.
	******************************************************/
	public String getChoiceString(String prompt, 
			String s1, String s2)
	{
		String s = "";
		boolean isValid = false;
		while (isValid == false)
		{
			s = this.getRequiredString(prompt);
			if (
				!s.equalsIgnoreCase(s1) &&
				!s.equalsIgnoreCase(s2)
				)
			{
				System.out.println("Error! Entry must be '"+
					s1 +"' or '"+ s2 +"'. Try again.");
			}
			else
			{
				isValid = true;
			}
		}
		return s;
	}

	public void print(String s) 
	{
	
	} 
		
	/*********************************************
	* This method displays the prompt text in the 
	* console.
	*********************************************/
	public void println(String s) 
	{
		System.out.println(s);	
	} 
	
	/*********************************************
	* This method adds a blank line to the console 
	* so it is easier to read the text output.
	**********************************************/
	public void println() 
	{
		System.out.println();
	} 
}

	
	


