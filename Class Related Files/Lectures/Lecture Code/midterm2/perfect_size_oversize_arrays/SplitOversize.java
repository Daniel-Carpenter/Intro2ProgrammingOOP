import java.util.Arrays;
import java.util.Scanner;

/* This program illustrates how to write a method that uses an oversize array.
 * The method takes a String, an array, and the number of elements of the array 
 * that are not considered empty (i.e., its size). The method copies the tokens 
 * of the String into consecutive empty elements of the array and returns the 
 * new size.
 */
public class SplitOversize {

	public static void main(String[] args) {

		String sentence = "Put these words in an oversize array!";
		
		// Construct an oversize array to store the tokens. The capacity of the 
		// array is the length, and the size is the number of elements not 
		// treated as empty space. The size is initially 0 because no tokens 
		// have been added to the array.
		String[] words = new String[10];  // The capacity is 10.
		int size = 0;
		
		// Print the initial contents and size of the array. Each element is 
		// null because no tokens have been added.
		System.out.println(Arrays.toString(words));
		System.out.println("size: " + size);
		System.out.println();
		
		// Split the sentence, copy the words into the array, and return the 
		// new size. Note that the method has three inputs: the string, the 
		// oversize array, and the current array size.
		size = split(sentence, words, size);
		
		// Print the new contents and size of the array. The capacity is still 
		// 10, but the size is now 7.
		System.out.println(Arrays.toString(words));
		System.out.println("size: " + size);
		System.out.println();
		
		// Try to add a second copy of the words to the array. There is not 
		// enough space to store them all, so only some of the words will be 
		// added. The new size is equal to the capacity. (The array is full.)
		size = split(sentence, words, size);
		System.out.println(Arrays.toString(words));
		System.out.println("size: " + size);
		System.out.println();
	}

	// Split a given String into tokens and copy them into a given oversize 
	// array. Return the new size of the array.
	public static int split(String string, String[] array, int size) {
		
		// Construct a Scanner to parse the String.
		Scanner stringParser = new Scanner(string);
		
		// Read each token and copy it into the array. Note that size is the 
		// number of nonempty elements in the array. Because the elements are 
		// indexed from 0, size is also the index of the next empty element.
		while (stringParser.hasNext() && size < array.length) {
			
			// Store the next token in the next empty element of the array.
			array[size] = stringParser.next();
			
			// Increase the size of the array by 1.
			size += 1;
			
			// Extra note: The loop condition includes the expression 
			// size < array.length. This prevents the size of the array from 
			// exceeding its capacity.
		}
		stringParser.close();
		
		// Return the new array size.
		return size;
	}
}
