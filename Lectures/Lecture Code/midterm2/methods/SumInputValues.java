import java.util.Scanner;

/**
 * This program uses a method named sumInputValues to read a sequence of 
 * integers from the user and return the sum. This method has two parameters: 
 * a reference to a Scanner object and an integer. The Scanner is used to read 
 * the user input, and the integer specifies the end of the input sequence.
 */
public class SumInputValues {

	public static void main(String[] args) {
		
		// The Scanner is constructed in the main method and passed as an 
		// argument to the method sumInputValues.
		Scanner keyboard = new Scanner(System.in);
		
		// The sentinel value is stored in a constant variable and passed as a 
		// second argument to the method sumInputValues.
		final int SENTINEL = -1;
		
		// Call the method sumInputValues and assign the result to a variable. 
		int inputSum = sumInputValues(keyboard, SENTINEL);
		
		// Print the sum returned by the method sumInputValues.
		System.out.println("Sum of input values: " + inputSum);
		
		keyboard.close();
	}
	
	// This method returns the sum of a sequence of integers input by the user.
	public static int sumInputValues(Scanner keyboard, int sentinel) {
		
		// Initialize an accumulator to store the sum of the inputs.
		int sum = 0;
		
		String prompt = "Enter next value or " + sentinel + " to stop.";
		
		// Perform a priming read to get the first user input.
		System.out.println(prompt);
		int input = keyboard.nextInt();
		
		// Continue reading user input until the sentinel value is found.
		while (input != sentinel) {
			
			sum = sum + input;
			
			System.out.println(prompt);
			input = keyboard.nextInt();
		}
		
		return sum;
	}
}
