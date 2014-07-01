/**********************************************************
* Hugh Brennan    |
* CITP 190		  |
* Project 6		  |
* March 2, 2012   |
* *********************************************************
* This class stores the data for each entry.  It also 
* contains a constructor and set/get methods for the 
* instance variables.
**********************************************************/
public class AddressBookEntry 
{
	//These are the instance variables
	private String name;
	private String emailAddress;
	private String phoneNumber;
	
	//This is the constructor//
	public AddressBookEntry()
	{
		name = "";
		emailAddress = "";
		phoneNumber = "";
	}
	
	//The set and get methods for name
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
		
	//The set and get methods for emailAddress
	public void setEmail(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
		
	//The set and get methods for phoneNumber 
	public void setPhone(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}
