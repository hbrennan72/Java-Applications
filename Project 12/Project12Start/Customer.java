/**********************************************************************
* Hugh Brennan        		  |
* CITP 190			  		  |
* April 20, 2012   	  		  |
* Project 12		       	  |
* *********************************************************************
* 
* Other than adding this comment box, the <code>Customer</code> class 
* code has not been altered.
* 
**********************************************************************/

public class Customer
{
	private String email;
	private String firstName;
	private String lastName;

	public Customer()
	{
		email = "";
		firstName = "";
		lastName = "";
	}

	public Customer(String email, String firstName, String lastName)
	{
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public boolean equals(Object object)
	{
		if (object instanceof Customer)
		{
			Customer customer2 = (Customer) object;
			if(this.email.equals(customer2.getEmail()))
			{
				return true;
			}
		}
		return false;
	}

}