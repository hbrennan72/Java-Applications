/**********************************************************************
* Hugh Brennan        |
* CIPT 190			  |
* March 16, 2012   |
* *********************************************************************
* This program first prompts the user to select either a customer or 
* employee.  If they select an employee, they are prompted to enter 
* a first name, last name, email address, and customer number. If 
* they select a customer, they are prompted to enter a first name, 
* last name, email address, and social security number.  Once the data
* has been entered, it is displayed for the user to review.
***********************************************************************/

import java.util.Scanner;
public class PersonApp
{
	public static void main(String args[])
	{
		//Welcome message
		System.out.println("Welcome to the Person Tester application");
		System.out.println();
				
		Scanner sc = new Scanner(System.in);
		String choice = "y";			
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Create customer or employee? (c/e):  ");
			String menuOption = sc.next();
			sc.nextLine();
						
			Person p = getPerson(menuOption);
			System.out.println();
			if (p != null)
				System.out.println(p);
			else
				System.out.println("Please enter c or e!");
						
			System.out.print("Continue? (y/n):  ");	
			choice = sc.next();
			System.out.println();
		
		}
	}
	
	public static Person getPerson(String menuOption)
	{
		Scanner sc = new Scanner(System.in);
		Person p = null;
		if (menuOption.equalsIgnoreCase("c"))
		{
			System.out.print("Enter first name:  ");
			String firstName = sc.nextLine();
			System.out.print("Enter last name:  ");
			String lastName = sc.nextLine();
			System.out.print("Enter email address:  ");
			String emailAddress = sc.nextLine();
			System.out.print("Customer number:  ");
			String customerNumber = sc.nextLine();
			System.out.println();
			System.out.print("You entered:  ");
						
			Customer c = new Customer();
			c.setFirstName(firstName);
			c.setLastName(lastName);
			c.setEmailAddress(emailAddress);
			c.setCustomerNumber(customerNumber);
			
			p = c;
			c.setCustomerNumber(customerNumber);
		}
		
		else if (menuOption.equalsIgnoreCase("e"))
		{
			System.out.print("Enter first name:  ");
			String firstName = sc.nextLine();
			System.out.print("Enter last name:  ");
			String lastName = sc.nextLine();
			System.out.print("Enter email address:  ");
			String emailAddress = sc.nextLine();
			System.out.print("Social security number:  ");
			String socialSecurityNumber = sc.nextLine();
			System.out.println();
			System.out.println("You entered:  ");	
						
			Employee e = new Employee();
			e.setFirstName(firstName);
			e.setLastName(lastName);
			e.setEmailAddress(emailAddress);
			e.setSocialSecurityNumber(socialSecurityNumber);
			
			p = e;
		}
		
		return p;
	
	
	}	
	
	
}
	
	

