// The Arrays class must be imported, since it is not in the java.lang package.
import java.util.Arrays;

/* This program illustrates the use of various methods from the Arrays class. 
 * Many of these methods can be used to save us the trouble of writing a for 
 * loop. To understand the utility of these methods, you need to understand how 
 * an array is stored in memory. An array variable is stored on the stack and 
 * only contains the address of the array contents. The array contents are 
 * stored on the heap.
 */
public class ArraysClassExamples {

	public static void main(String[] args) {
		
		// Declare and initialize an array of doubles to use as a test case.
		double[] arr = {1.21, -0.5, -37.0, 98.5, -273.15};
		
		// Printing the reference variable arr only prints the address of the 
		// array on the heap, not the contents of the array.
		System.out.println("Address of array on the heap: " + arr);
		
		// To print the contents, we can use a for loop to iterate through 
		// every array element and print it individually. Alternatively, we can 
		// use the toString method of the Arrays class.
		System.out.println("Array contents: " + Arrays.toString(arr));
		System.out.println();
		
		
		// The following line does not make a copy of the array. It only copies 
		// the array reference.
		double[] arrCopy = arr;
		
		// Notice that if I change the first element of the array to 0, this 
		// change is reflected in both arr[0] and arrCopy[0];
		arr[0] = 0;
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("arrCopy[0]: " + arrCopy[0]);
		System.out.println();
		
		// In order to copy the contents of the array into a new array on the 
		// heap, we can construct a new array and use a for loop to copy each 
		// element of arr into arrCopy. Alternatively, we can use the copyOf 
		// method of the Arrays class.
		arrCopy = Arrays.copyOf(arr, arr.length);
		
		
		// Note that the addresses stored in arr and arrCopy are different, 
		// since they each point to a different array on the heap.
		System.out.println("(arr == arrCopy): " + (arr == arrCopy));
		
		// The contents of the two arrays, however, are the same. To check 
		// this, we can use a for loop to iterate through both arrays and 
		// compare the elements at each index. Alternatively, we can use the 
		// equals method.
		System.out.println("Arrays.equals(arr, arrCopy): " 
				+ Arrays.equals(arr, arrCopy));
		System.out.println();
		
		
		// If an array has already been constructed, we can't reassign the 
		// values using the curly braces notation (shown above when declaring 
		// and initializing arr). In order to assign all of the elements to a 
		// value like -1, we can use a for loop to iterate through every 
		// element and assign -1 to each individually. Alternatively, we can 
		// use the fill method.
		Arrays.fill(arrCopy, -1);
		System.out.println("arrCopy contents: " + Arrays.toString(arrCopy));
		
		// Note that the contents of arr are unchanged because we used copyOf 
		// to copy its contents to arrCopy earlier.
		System.out.println("arr contents: " + Arrays.toString(arr));
		System.out.println();
		
		
		// The Arrays class also has a sort method that rearranges the elements
		// into ascending order.
		Arrays.sort(arr);
		System.out.println("arr contents: " + Arrays.toString(arr));
		System.out.println();
		
		
		// Finally, the Arrays class has a binary search method that returns 
		// the index of an element in the array. This method should only be 
		// used on an array of sorted data. Note that arr was sorted above.
		System.out.println("Index of element -0.5: " 
				+ Arrays.binarySearch(arr, -0.5));
		
		// If we search for an element that is not in the array, binarySearch 
		// returns (-(insertion index) - 1), where the insertion index is the 
		// index where the element would need to be added to keep the array in 
		// sorted order.
		//
		// For instance, if we search for 42, the method will return -5. This 
		// is because if 42 were in the array, it would be at index 4. To 
		// indicate that it is not in the array, the method returns negative of 
		// this number minus 1. (Note that 1 is subtracted to differentiate 
		// between an element being at index 0 and its insertion index being 
		// index 0.)
		System.out.println("Index of element 42.0: " 
				+ Arrays.binarySearch(arr, 42.0));
	}
}
