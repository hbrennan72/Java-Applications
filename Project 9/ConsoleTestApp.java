import myUtils.util.Console;
public class ConsoleTestApp
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		/***********************************
		* This is where a new Console 
		* object is created. 
		******************************/ 
		Console c = new Console();

		/***********************************
		* This is where a welcome message
		* is displayed.
		***********************************/ 
		c.println("Welcome to the Console Tester application");
		c.println();

		/***********************************
		* This is where an integer is 
		* entered and the getIntWithinRange 
		* method is referenced. 
		***********************************/ 
		c.println("Int Test");
		int i = c.getIntWithinRange("Enter an integer between -100 " + 
		"and 100: ", -101, 101);
		c.println();

		/***********************************
		* This is where a double is entered 
		* and the getDoubleWithinRange is 
		* referenced. 
		***********************************/ 
		c.println("Double Test");
		double d = c.getDoubleWithinRange("Enter any number between -100 " + 
		"and 100: ", -101, 101);
		c.println();

		/***********************************
		* This is where the email address is 
		* entered and the getRequiredString 
		* is referenced. 
		***********************************/ 
		c.println("Required String Test");
		String s1 = c.getRequiredString("Enter your email address: ");
		c.println();

		/***********************************
		* This is where a string is
		* selected and the getChoiceString
		* is referenced. 
		***********************************/ 
		c.println("String Choice Test");
		String s2 = c.getChoiceString("Select one (x/y): ", "x", "y");
		c.println();
	}
}