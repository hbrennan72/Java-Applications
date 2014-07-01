
import java.util.Scanner;

/**********************************************************************
* Hugh Brennan        		  |
* CITP 190			  		  |
* April 20, 2012   	  		  |
* Project 12		       	  |
* *********************************************************************
* 
* The <code>CustomerMaintApp</code> class prompts the user to select
* from the COMMAND MENU.  If they enter "list", they will be provided
* with a complete list of email addresses and names stored in a text
* file.  If they enter "add", they will be able to add an entry to the
* text file.  If they enter "bye", the program terminates.
* 
**********************************************************************/

public class CustomerMaintApp 
{

	@SuppressWarnings({ "static-access" })
	public static void main(String[] args)
	{
		
		{
			// Program welcome message
			System.out.println("Welcome to the Customer Maintenance + " +
					"application\n");
			
			Scanner sc = new Scanner (System.in);
			Validator v = new Validator(sc);
			
			// This method will display the COMMAND MENU
			displayMenu();

			String action = "";
			while (!action.equalsIgnoreCase("exit"))
			{
				// Accepts user COMMAND MENU input
				action = v.getRequiredString("Enter a command: ");
				System.out.println();

				if (action.equalsIgnoreCase("list"))
					displayAllCustomers();
				else if (action.equalsIgnoreCase("add"))
					addCustomer();
				else if (action.equalsIgnoreCase("exit") ||
						action.equalsIgnoreCase("quit"))
					System.out.println("Bye.\n");
				else
					System.out.println("The valid commands are list, add, " +
							"and exit." + "\n");
			}
		}
	}

	//Method that displays the COMMAND MENU when called	
	public static void displayMenu()
	{
		System.out.println("COMMAND MENU");
		System.out.println("list    - List all customers");
		System.out.println("add     - Add a customer");
		System.out.println("exit    - Exit this application\n");
	}
		
	//Method that displays all of customers in the text file
	public static void displayAllCustomers()
	{
		System.out.println("CUSTOMER LIST" + "\n");
		System.out.println(CustomerIO.getEntriesString());
	}
		
	//Method that accepts and saves user input
	public static void addCustomer()
	{
		String email = Validator.getRequiredString("Enter " +
				"customer email address: ");
		String fName = Validator.getRequiredString("Enter " +
				"first name: ");
		String lName = Validator.getRequiredString("Enter " +
				"last name: ");

		Customer cust = new Customer();
		cust.setEmail(email);
		cust.setFirstName(fName);
		cust.setLastName(lName);
		CustomerIO.saveEntry(cust);

		System.out.println();
		System.out.println(fName + " " + lName + " was added " +
				"to the database.\n");
	}

}
