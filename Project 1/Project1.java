/** Project1.java -- This is a project to practice using Eclipse
 * 
 * @author Hugh Brennan
 * Project 1
 * CITP 190
 * @version January 19, 2012
 */
import java.util.Scanner;

public class Project1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int total = 0;
		int number1;
		int number2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		number1 = sc.nextInt();
		
		System.out.print("Enter the seond integer: ");
		number2 = sc.nextInt();
		
		total = number1 + number2;
		
		System.out.println("The total is " + total);
				
		// TODO Auto-generated method stub

	}

}
