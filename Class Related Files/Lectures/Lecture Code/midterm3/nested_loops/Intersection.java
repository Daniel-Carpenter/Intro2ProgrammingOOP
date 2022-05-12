import java.util.Arrays;

/* This program illustrates the use of nested loops to find the integers common 
 * to two arrays of unique integers.
 */
public class Intersection {

	public static void main(String[] args) {
		
		// Define two arrays to use as a test case.
		int[] array1 = {3, 42, 28, 29, 7, 451};
		int[] array2 = {101, 2, 42, -11, 451, 18, 47};
		
		// Find the integers in both arrays.
		int[] intersec = intersection(array2, array1);
		
		System.out.println("Integers in both arrays: " + 
				Arrays.toString(intersec));
	}
	
	// Given two arrays of unique integers, return the integers that appear in 
	// both arrays.
	public static int[] intersection(int[] arr1, int[] arr2) {
		
		// Step 1: Count the number of integers common to both arrays.
		int numCommon = 0;
		
		// Outer loop: Step through each integer in the first array.
		for (int j = 0; j < arr1.length; ++j) {
			
			// Store the integer in arr1 at index j in a variable.
			int elem1 = arr1[j];
			
			// Initialize a variable to track if elem1 was found in arr2.
			boolean found = false;
			
			// Inner loop: Step through each integer in the second array.
			for (int k = 0; k < arr2.length; ++k) {
			
				// Store the integer in arr2 at index k in a variable.
				int elem2 = arr2[k];
			
				// Check if elem1 and elem2 are the same integer.
				if (elem1 == elem2) {
					found = true;
				}
			}
			
			// At this point in the code, elem1 has been compared with every 
			// integer in arr2. If elem1 appears anywhere in arr2, the variable
			// found will be true.
			if (found) {
				numCommon += 1;
			}
		}
		
		// Step 2: Construct a perfect size array to store the common integers.
		int[] output = new int[numCommon];
		
		// Initialize a variable to track the size of the output array. This 
		// variable is used to add the common integers.
		int size = 0;
		
		// Step 3: Repeat the logic of step 1. This time, however, add the 
		// common integers to the output array, rather than just counting them. 
		// (The temporary variables are omitted this time.)
		for (int j = 0; j < arr1.length; ++j) {
			
			boolean found = false;
			
			for (int k = 0; k < arr2.length; ++k) {
			
				if (arr1[j] == arr2[k]) {
					found = true;
				}
			}
			
			if (found) {
				output[size] = arr1[j];
				++size;
			}
		}
		
		return output;
	}
}
