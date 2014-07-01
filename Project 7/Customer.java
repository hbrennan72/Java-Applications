
public class Customer extends Person
{
	private String customerNumber;
	
	public Customer()
	{
		super();
		customerNumber = "";
	}
	
	public void setCustomerNumber(String customerNumber)
	{
		this.customerNumber = customerNumber;
	}
	
	public String getCustomerNumber()
	{
		return customerNumber;
	}
	
	public String toString()
	{
		return super.toString() + 
				"Customer number:" + " " + customerNumber + "\n";
	}
	
	String getDisplayText() 
	{
		return null;
	}
}

