import java.util.Scanner;

/*
 * This program is intended to help you with Question 4 of Homework 2. You can 
 * type your solution in the space indicated to check if it is correct.
 */
public class HW2_Q4 {

	public static void main(String[] args) {

		// Define the input string. Note that I could have written it all on a 
		// single line, but I broke it up to match the question.
		String input = "Book , Cost , Number\n"
					 + "Hamlet , 24.95 , 10\n"
					 + "King Lear , 18.42 , 13\n";
		
		// Construct a Scanner, but have it read the String defined above, 
		// rather than System.in. Note that I'm leaving the name of the 
		// variable as "keyboard" so that it matches the question.
		Scanner keyboard = new Scanner(input);
		
		// Declare and initialize variables to store the total cost and number.
		double totalCost = 0;
		int totalNumber = 0;

		// Write your code below using only these variables. Your code
		// should not contain literal values. For instance, do not calculate
		// the total cost with the statement "totalCost = 24.95 + 18.42".
		// Instead, use the Scanner to read the values from the keyboard.
		
		
		
		
		
		
		// Write your code here!
		// Only use the variables keyboard, totalCost, and totalNumber.
		
		
		
		
		
		
		
		
		
		// If your code is correct, the program should print out a total cost 
		// of 43.37 and a total number of 23.
		System.out.println("totalCost: " + String.format("%.2f", totalCost));
		System.out.println("totalNumber: " + totalNumber);
		
		keyboard.close();
	}

}
