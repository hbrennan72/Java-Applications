/**********************************************************************
* @author Hugh Brennan        |
* CITP 190			  		  |
* April 13, 2012   	  		  |
* Project 11		       	  |
* *********************************************************************
* 
* The <code>CustomerIO</code> class returns customer information 
* providing the user has entered a valid customer number. It also
* throws a NoSuchCustomerException if the customer doesn't exist.
* 
**********************************************************************/
public class CustomerIO
{
    public static Customer getCustomer(int custNo)
    	throws NoSuchCustomerException
    {
    	Customer cust = new Customer();
		
    	if (custNo == 1000)
		{
			cust.name = "Andrew Antosca";
			cust.address = "485 Duane Terrace";
			cust.city = "Ann Arbor";
			cust.state = "MI";
			cust.zipCode = "48108";
		}
		
		else if (custNo == 1001)
		{
			cust.name = "Barbara White";
			cust.address = "3400 Richmond Parkway #3423";
			cust.city = "Bristol";
			cust.state = "CT";
			cust.zipCode = "06010";
		}
		
		else if (custNo == 1002)
		{
			cust.name = "Karl Vang";
			cust.address = "327 Franklin Street";
			cust.city = "Edina";
			cust.state = "MN";
			cust.zipCode = "55435";
		}
		
		else if (custNo == 1003)
		{
			cust.name = "Ronda Chavan";
			cust.address = "518 Comanche Dr.";
			cust.city = "Greensboro";
			cust.state = "NC";
			cust.zipCode = "27410";
		}
		
		else if (custNo == 1004)
		{
			cust.name = "Sam Carol";
			cust.address = "9379 N. Street";
			cust.city = "Long Beach";
			cust.state = "CA";
			cust.zipCode = "90806";
		}
      
		else 
		{
			throw new NoSuchCustomerException(custNo);
		}
		
		return cust;
		        	
    }  
}
