
/**********************************************************************
* @author Hugh Brennan        |
* CITP 190			  		  |
* April 13, 2012   	  		  |
* Project 11		       	  |
* *********************************************************************
* 
* The <code>NoSuchCustomerException</code> class accepts an int
* parameter.  It stores the int in a private instance variable and has
* a getCustomer method that returns private instance variable value.
* 
**********************************************************************/

@SuppressWarnings("serial")
public class NoSuchCustomerException extends Exception 

{
	
	private int cusNum;
 
		public NoSuchCustomerException(int cusNum)
		{
			super("The customer number " + cusNum + " does not exist.");
			this.cusNum = cusNum;
		}
		public void setCusNum(int cusNum)
		{
			this.cusNum = cusNum;
		}

		public int getCustomer()
		{
			return cusNum;
		}
  
}

