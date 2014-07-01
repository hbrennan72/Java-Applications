//Hugh Brennan
//CIPT 190
//Project 2-2

import java.util.Scanner;

public class Project2 
{
	public static void main(String[] args)
	{
		//Welcome message
		System.out.println("Rectangle Calculation Application");
		System.out.println();
		
		//Initialize the variables
		
		double area = 0.0;
		double perimeter = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter the length:    ");
			double length = sc.nextDouble();
			System.out.print("Enter the width:     ");
			double width = sc.nextDouble();
			
			area  = length * width;
			perimeter = 2 * length + 2 * width;
			String message = "Area: " + area + "\n"
						   + "Perimeter: " + perimeter + "\n";
			System.out.println(message);
						System.out.print("Do you wish to continue? (y/n):  ");
			choice = sc.next();
		}
	}
	
	
}
