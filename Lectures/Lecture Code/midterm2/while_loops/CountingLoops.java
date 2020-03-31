import java.util.Scanner;

/**
 * This program contains two examples of a counting loop. Each example reads 
 * five grades from the user and prints the average. The first initializes 
 * the counter to 0. The second initializes the counter to 1.
 */
public class CountingLoops {

	public static void main(String[] args) {
		
		// Construct a scanner to read grades from the user.
		Scanner input = new Scanner(System.in);
		
		//----------------------------------------------------------------------
		// Example 1
		//----------------------------------------------------------------------
		
		// Declare and initialize a variable to store the sum of the grades.
		int sum = 0;
		
		// Initialize the counter to 0.
		int counter = 0;
		// Note that the loop condition is LESS THAN the number of times we 
		// want the loop to execute.
		while (counter < 5) {
			
			// Get the next grade from the user and add it to the sum.
			System.out.println("Enter next grade.");
			int grade = input.nextInt();
			sum = sum + grade;
			
			// Important! We must increment the counter by 1 at the end of the 
			// loop; otherwise, the loop will run forever.
			counter = counter + 1;
		}
		
		// Calculate the average. By initializing counter to 0, the final value 
		// is the number of times the loop executed (5).
		double average = (double) sum / counter;
		System.out.println("Average grade: " + average);
		
		//----------------------------------------------------------------------
		// Example 2
		//----------------------------------------------------------------------
		
		// Reset the sum to 0 for the second example.
		sum = 0;
		
		// Initialize the counter to 1.
		counter = 1;
		// Note that the loop condition is LESS THAN OR EQUAL TO the number of 
		// times we want the loop to execute.
		while (counter <= 5) {
			
			System.out.println("Enter next grade.");
			int grade = input.nextInt();
			sum = sum + grade;
			
			counter = counter + 1;
		}

		// Calculate the average. By initializing counter to 1, the final value 
		// is 1 plus the number of times the loop executed (6).
		average = (double) sum / (counter - 1);
		System.out.println("Average grade: " + average);
	}
	
}
