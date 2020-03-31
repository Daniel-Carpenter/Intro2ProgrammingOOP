import java.util.Scanner;

/**
 * This program uses a sentinel-controlled loop to read grades from the 
 * keyboard until the user enters -1. It then returns the number of passing 
 * grades.
 */
public class NumPassingGrades {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Define constants to store the sentinel value and the threshold for 
		// a passing grade.
		final int SENTINEL = -1;
		final int PASSING_GRADE = 70;
		
		// Declare a variable to store the number of passing grades.
		int numPass = 0;
		
		System.out.println("Enter the grades on a single line separated by "
				+ "spaces. Enter -1 after the last grade.");
		
		// Perform a priming read to get the first grade before entering the 
		// loop. This handles the case where the user enters only -1.
		int grade = keyboard.nextInt();
		
		while (grade != SENTINEL) {
			
			// Increment numPass if the grade is a passing grade.
			if (grade >= PASSING_GRADE) {
				++numPass;  // Equivalent to numPass = numPass + 1
			}
			
			// Get the next grade before re-entering the loop. All the grades 
			// are entered on a single line, so there is no need to prompt the 
			// user for input again.
			grade = keyboard.nextInt();
		}
		
		System.out.println("Number of students that passed: " + numPass);
	}
}
