//Hugh Brennan
//CIPT 190
//Project 2-2

import java.util.Scanner;

public class Project2_2 
{
	public static void main(String[] args) 
	
	{
				//Welcome message
				System.out.println("Welcome to the Letter Grade Converter");
				System.out.println();
				Scanner sc = new Scanner(System.in);
							
				String choice = "y";
				while (choice.equalsIgnoreCase("y"))
				{
						
					System.out.print("Enter numerical grade:    ");
					int numGrade = sc.nextInt();
					
					String letterGrade  = sc.next();
					
									
					String gradeA = "A";
					String gradeB = "B";
					String gradeC = "C";
					String gradeD = "D";
					
					String gradeF = "F";
							
					if (numGrade >= 88)
						letterGrade = gradeA;
					else if  (numGrade >= 80)
							letterGrade = gradeB;
					else if (numGrade >= 67)
							letterGrade = gradeC;
					else if (numGrade >= 60)
							letterGrade = gradeD;
					else	
							letterGrade = gradeF;
															
					System.out.println("Letter grade:  " + letterGrade + "\n");
					System.out.print("Do you wish to continue? (y/n):  ");
					choice = sc.next();
				}
		}

}
