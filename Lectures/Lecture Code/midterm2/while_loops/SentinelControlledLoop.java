import java.util.Scanner;

/**
 * This program uses a sentinel-controlled loop to read grades from the 
 * keyboard until the user enters -1. It then returns the average grade. 
 * Unlike the counting loop examples, which could only read a fixed number of 
 * grades, this program can read an arbitrary number of grades.
 */
public class SentinelControlledLoop {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Store the sentinel value in a constant. The choice of this value is 
		// important. It can't be legal data. In this case, it should not be a 
		// value between 0 and 100, since those are possible grades.
		final int SENTINEL = -1;
		
		// Initialize a variable to store the sum of the grades.
		int sum = 0;
		
		// Initialize a variable to store the number of grades. This was not 
		// required in the counting loop examples because the number of loop 
		// iterations was fixed. Now we must count the grades.
		int numGrades = 0;
		
		// Sentinel-controlled loops should usually have a priming read. This 
		// is simply a statement that reads the first input before entering the 
		// loop. A priming read prevents the sentinel value from being used as 
		// data. For example, what if the first input is -1?
		System.out.println("Enter next grade or " + SENTINEL + " to stop.");
		int grade = keyboard.nextInt();
		
		while (grade != SENTINEL) {
			
			// Add the grade to the sum and increment the number of grades.
			sum = sum + grade;
			numGrades = numGrades + 1;
			
			// If we use a priming read, then the next input should be read at 
			// the end of the loop.
			System.out.println("Enter next grade or " + SENTINEL + " to stop.");
			grade = keyboard.nextInt();
		}
		
		// Calculate the average and print the result to the user.
		double average = (double) sum / numGrades;
		System.out.println("Average grade: " + average);
	}
}
