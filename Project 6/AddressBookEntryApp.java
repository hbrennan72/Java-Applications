/**********************************************************
* Hugh Brennan    |
* CITP 190		  |
* Project 6		  |
* March 2, 2012   |
* *********************************************************
* This program first presents the user with a list of
* three options.  The options include the ability to view
* entries in a text file, add an entry to a text file,
* or close the application.
**********************************************************/

import java.util.Scanner;
public class AddressBookEntryApp
{
	private static String addressData;

	
	@SuppressWarnings({ "static-access" })
	public static void main(String[] args)
	{
		
		{
			//Welcome message
			System.out.println("Welcome to the Address Book Application");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			Validator v = new Validator(sc);
		
			String menu =
					"1 - List entries" + "\n"
							+ "2 - Add entry" + "\n"
							+ "3 - Exit" + "\n";
			System.out.println(menu);
		
		
			/*******************************************************
			 * This validates that an integer has been entered	   *
			 * and that the integer is greater than 0; less than 4. *
			 *******************************************************/
			int menuOption = 0;
				
			while (menuOption >= 1 || menuOption <= 3)

			{
				menuOption = v.getIntWithinRange(sc, "Enter menu" +
						" number:  ", 0, 4);
				System.out.println();
				
				if (menuOption == 1)
				{
					addressData = AddressBookIO.getEntriesString();
					System.out.print(addressData);
					System.out.println();
					System.out.println(menu);
				}			

				else if (menuOption == 2)
				{
					addEntry();
					System.out.println(menu);
				}
			
				else 				
				{
					System.out.println("Goodbye!");
				}				
			}
		}
	}
		public static void addEntry()
		{
			String name = Validator.getString("Enter name: ");
			String emailAddress = Validator.getString("Enter email" +
				" address: ");
			String phoneNumber = Validator.getString("Enter phone number: ");
		
			AddressBookEntry entry = new AddressBookEntry();
			entry.setName(name);
			entry.setEmail(emailAddress);
			entry.setPhone(phoneNumber);
			AddressBookIO.saveEntry(entry);
		
			System.out.println();
			System.out.println("This entry has been saved.");
			System.out.println();
		
		}
}
