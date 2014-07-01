import java.util.Scanner;
import java.util.Arrays;

public class SortedStudentsApp
{

	static Scanner sc = new Scanner(System.in);				// get a scanner

	public static void main(String[] args)
	{

		System.out.println("Welcome to the Student Scores Application.");


	}

	public static int getStudentCount()
	{
		int studentCount = 0;
		boolean isValid = false;

		while (!isValid)
		{
			System.out.print("\nEnter number of students to enter: " );
			if (sc.hasNextInt())				// make sure the next token is an integer
			{
				studentCount = sc.nextInt();	// discard the entire line if it isn't
				if (studentCount > 0)			// make sure it is greater than zero
					isValid = true;
			}
			sc.nextLine();						// discard any remaining data
		}
		return studentCount;					// return the studentCount
	}

	public static String getString(String prompt)
	{
		String s = "";
		boolean isValid = false;

		while (!isValid)						// loops until user enters a non-blank line
		{
			System.out.print(prompt);
			s = sc.nextLine();
			if (!s.equals(""))
				isValid = true;
		}
		return s;
	}

	public static int getScore(String prompt)
	{
		int score = 0;
		boolean isValid = false;

		while (!isValid)
		{
			System.out.print(prompt);
			if (sc.hasNextInt())					// make sure the next token is an integer
			{
				score = sc.nextInt();				// discard the entire line if it isn't
				if (score >= 0 && score <= 100)		// make sure it is in the range 0 to 100
					isValid = true;
			}
			sc.nextLine();							// discard any remaining data
		}
		return score;								// return the score
	}

}