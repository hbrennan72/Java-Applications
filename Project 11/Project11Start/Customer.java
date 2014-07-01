public class Customer
{
	public String name;
	public String address;
	public String city;
	public String state;
	public String zipCode;

	public String getNameAndAddress()
	{
		return name + "\n"
			+ address + "\n"
			+ city + ", " + state + " " + zipCode;
	}
}