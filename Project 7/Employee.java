
public class Employee extends Person
{
	private String socialSecurityNumber;
	
	public Employee()
	{
		//super();
		socialSecurityNumber = "";
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber)
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	public String toString()
	{
		return super.toString() + 
				"Social security number:" + " " +  socialSecurityNumber + "\n";
	}
	
	String getDisplayText() 
	{
		return null;
	}
}