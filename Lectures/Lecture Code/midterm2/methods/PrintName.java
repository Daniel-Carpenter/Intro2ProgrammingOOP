/*
 * This program illustrates a method call inside the main method. The method 
 * printName, which is defined below the main method, prints Strings that are 
 * passed to the method as arguments.
 */
public class PrintName {
	
	public static void main(String[] args) {
		
		// Call the method printName with the arguments "James", "Dizikes", and 
		// false. The method prints the Strings to the console.
		printName("James", "Dizikes", false);
		
		// Call the method again, but change the last argument to false. The 
		// method now prints the Strings in reverse order.
		printName("James", "Dizikes", true);
		
		// Call the method a third time, but use variables instead of String 
		// literals as arguments. The method works this way too.
		String firstName = "James";
		String lastName = "Dizikes";
		printName(firstName, lastName, false);
	}
	
	// printName has two String parameters and one boolean parameter. The 
	// method prints the Strings to the console in one of two ways based on 
	// the value of the boolean parameter.
	public static void printName(String first, String last, boolean lastFirst)
	{
		if (lastFirst) {
			System.out.println(last + ", " + first);
		}
		else {
			System.out.println(first + " " + last);
		}
	}
}
