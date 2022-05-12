/*
 *  The Scanner class is defined in the java.util package, not java.lang.
 *  This means we must import it in order to use it in our programs.
 */
import java.util.Scanner;

public class ModuloPractice {
	
	public static void main(String[] args) {
		
		// Construct a Scanner object and connect it to the keyboard.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Let's calculate x % y.");
		
		// Get input from the user.
		System.out.print("Please enter x: ");
		int x = keyboard.nextInt();
		System.out.print("Please enter y: ");
		int y = keyboard.nextInt();
		
		// We have the input. Now perform the calculation.
		int remainder = x % y;
		
		// Tell the user the result.
		System.out.println(x + " % " + y + " is " + remainder);
		
		// Close the Scanner so Eclipse is happy.
		keyboard.close();
	}
}
