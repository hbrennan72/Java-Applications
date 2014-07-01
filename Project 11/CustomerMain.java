/**********************************************************************
* @author Hugh Brennan        |
* CITP 190			  		  |
* April 13, 2012   	  		  |
* Project 11		       	  |
* *********************************************************************
* 
* The <code>CustomerMain</code> class prompts the user to enter a 
* customer number.  If a valid customer number is entered, the details 
* for that customer are displayed.  If the user enters an invalid 
* number, the user receives an error message. The user is also prompted 
* to continue.
* 
***********************************************************************/

import java.util.Scanner;

public class CustomerMain 
{

	public static void main(String[] args)
	{
		//The welcome message
		System.out.println("Welcome to the Customer application.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		Validator v = new Validator(sc);
		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
			
			int custNo = v.getIntWithinRange("Enter a customer number: ", +
					0, 5000);
									
			try	
			{
                Customer cust = CustomerIO.getCustomer(custNo);
                System.out.println("\n" + cust.getNameAndAddress());
            }
            catch (NoSuchCustomerException e)
            {	
            	System.out.println("\n" + e.getMessage());	  
            }
 			
			System.out.println();
			choice = Validator.getRequiredString("Keep going? y/n: ");
			System.out.println();
		}

	}

}
