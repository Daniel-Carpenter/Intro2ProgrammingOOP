/* This program implements an algorithm to find the largest value stored in an 
 * array of integers. It makes use of a for loop with a conditional inside the 
 * loop.
 */
public class FindMax {

	public static void main(String[] args) {
		
		// Declare and initialize an array of integers to use as a test case.
		int[] array = {-23, 42, 0, -89, 451, 121};
		
		// Declare a variable to store the maximum value in the array. Note the 
		// following:
		// 1. This variable must be declared outside of the for loop so that 
		// the current maximum value can be compared to the subsequent values 
		// in the array.
		//
		// 2. The initial value of the variable must be chosen carefully. There 
		// are two good options: (1) Use Integer.MIN_VALUE, which is guaranteed 
		// to be less than or equal to every integer in the array. (2) Use the 
		// first element of the array.
		int max = array[0];
		
		// Write a loop that executes once for every element in the array.
		for (int idx = 0; idx < array.length; ++idx) {
			
			// Get the integer stored in the array at index idx. Store the 
			// integer in a temporary variable so it can be compared to max and 
			// then assigned to max if necessary.
			int value = array[idx];
			
			// Check if the integer at index idx is larger than the integers 
			// stored at all the previous indices. If so, update the value 
			// stored in max.
			if (value > max) {
				max = value;
			}
		}
		
		System.out.println("Maximum integer in the array: " + max);
	}
}