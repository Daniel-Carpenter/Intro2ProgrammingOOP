/**
 * This program illustrates the use of a for loop with a method that reverses a 
 * string.
 */
public class ReverseString {
	
	public static void main(String[] args) {
		
		// Create a test string.
		String testString = "For loops are rad!";
		
		// Reverse the test string.
		String reversed = reverseString(testString);
		
		// Print the original and reversed strings.
		System.out.println("Original string: " + testString);
		System.out.println("Reversed string: " + reversed);
	}

	// This method takes a single string parameter and returns a copy of the 
	// string with the characters reversed.
	public static String reverseString(String inputString) {
		
		// Declare a String reference to store the reversed string. Initialize 
		// it to the empty string.
		String reversed = "";
		
		// The for-loop variable index takes on every integer from 0 to one 
		// less than the length of the input string. It is written this way 
		// because the characters of the string are indexed from 0. That is, 
		// the first character is at index 0, and the last character is at 
		// index length - 1, where length is the number of characters.
		for (int index = 0; index < inputString.length(); index = index + 1) {
			
			// Extract the character at the current index.
			char character = inputString.charAt(index);
			
			// Make a copy of the current reversed string with the current 
			// character prepended to the front. (If the character were 
			// appended instead, the final string would be the same as the 
			// input string. To reverse it, we need to prepend the character.)
			reversed = character + reversed;
		}
		
		// Return a copy of the input string with the characters reversed.
		return reversed;
	}
}
