
/**********************************************************************
* @author Hugh Brennan        |
* CITP 190			  		  |
* April 6, 2012   	  		  |
* Project 10		       	  |
* *********************************************************************
* 
* The <code>Student</code> class stores the first name, last name,
* and score. It also contains a get and set method for the last name,
* first name, and score instance variables.
* 
***********************************************************************/

public class Student implements IComparable

{
	private String firstName;
	private String lastName;
	private String score;

	public Student()
	{
		firstName = "";
		lastName = "";
		score = "";
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
	
	public void setScore(String score)
	{
		this.score = score;
	}
	
	public String getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return lastName + "," + " " + firstName + ":" + " " + score; 
	}
	
	public String compareTo(Object obj) 
	{
		//Student i = (Student) obj;
		if (this.getLastName() == getLastName())
			return firstName;
		return firstName;
	}
}
