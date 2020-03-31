import java.util.Arrays;
import java.util.Scanner;

/* This program illustrates how to write a method that returns a perfect size 
 * array. The method takes a String and returns the tokens (words) in an array. 
 * The length of the array is equal to the number of tokens. (The tokens are 
 * delimited by whitespace.)
 */
public class SplitPerfect {

	public static void main(String[] args) {
		
		String sentence = "Put these words in a perfect size array!";
		
		// Split the sentence and return a perfect size array with the words. 
		// Note that the method takes the sentence as the only input.
		String[] words = split(sentence);
		
		System.out.println(Arrays.toString(words));
	}
	
	// Split a given String into tokens and return them in a perfect size array.
	// That is, the array will have no extra space. This requires the String to
	// be parsed twice.
	public static String[] split(String string) {
		
		// Construct a Scanner to parse the String.
		Scanner stringParser = new Scanner(string);
		
		// Count the number of tokens in the String. Note that hasNext returns 
		// true if there are one or more tokens that have not been read.
		int numTokens = 0;
		while (stringParser.hasNext()) {
			stringParser.next();  // Read, but do not store, the next token.
			numTokens += 1;       // Increment the number of tokens.
		}
		
		// Construct an array with exactly enough space to store the tokens.
		// (The array is the perfect size.)
		String[] tokens = new String[numTokens];
		
		// Close the old Scanner and construct a new one so the tokens can be 
		// read again. (The old Scanner is positioned at the end of the String.)
		stringParser.close();		
		stringParser = new Scanner(string);
		
		// Read the tokens a second time and copy them into the array.
		for (int idx = 0; idx < tokens.length; ++idx) {
			tokens[idx] = stringParser.next();
		}
		stringParser.close();
		
		return tokens;
	}
}
