import java.util.Scanner;

/*
 * This program illustrates the use of a for loop with a method that reads 
 * input from the user until an integer in a given range is found. The loop is 
 * written in a few alternative ways (in comments) to show that there are 
 * multiple, equivalent ways to write loops in Java.
 */
public class GetUserInput {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get an integer from the user between -3 and 7 inclusive.
		int userInput = getUserInput(keyboard, -3, 7);
		
		System.out.println("The user entered the integer " + userInput + ".");
	}
	
	// This method prompts the user for an integer in a given range. The method 
	// will continue to read inputs until an integer in the range is entered.
	public static int getUserInput(Scanner keyboard, int min, int max) {
		
		String prompt = "Enter an integer between " + min + " and " + max + ".";
		
		System.out.println(prompt);
		int input;
		// The priming read is performed in the for-loop header. I think it's 
		// easier to read the program if this is done on the line above (where 
		// the variable is declared), but this is perfectly legal Java code.
		for (input = keyboard.nextInt(); input < min || input > max; ) {
			
			System.out.println(prompt);
			input = keyboard.nextInt();
		}

		/* Below are some alternative ways to write the same loop.
		
		// The priming read can be done before the loop. In this case, the 
		// initialization part of the header is left blank.
		int input = keyboard.nextInt();
		for ( ; input < min || input > max; ) {
			
			System.out.println(prompt);
			input = keyboard.nextInt();
		}
		
		// This method is probably best written using a while loop, since the 
		// loop condition does not depend on an incremented variable.
		int input = keyboard.nextInt();
		while (input < min || input > max) {
			
			System.out.println(prompt);
			input = keyboard.nextInt();
		}
		*/
		
		return input;
	}
}
