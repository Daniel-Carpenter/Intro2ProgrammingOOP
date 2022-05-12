import java.util.Arrays;

/* This program is an efficient implementation of insertion sort. It differs 
 * from the Zyante textbook in that it does not swap the element to be inserted 
 * with all the larger values in the sorted portion of the array. Rather, it 
 * shifts all of the larger elements to the right by one index and then inserts 
 * the element.
 */
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] data = {9, 4, 2, 1, 7, 8, 3, 6, 5};
		System.out.println(Arrays.toString(data));
		
		insertionSort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public static void insertionSort(int[] array) {
		
		// At the start of each iteration of the outer loop, the elements at 
		// indices less than i are in relative sorted order. Element i will be 
		// inserted into this portion of the array so that it stays sorted.
		for (int i = 1; i < array.length; ++i) {
			
			int temp = array[i];  // Copy element i into temporary storage.

			// Find the position to insert element i. Shift larger elements to 
			// the right to make room in the sorted part of the array.
			int j;
			for (j = i; j > 0; --j) {
				
				if (array[j-1] > temp) {
					array[j] = array[j-1];  // Shift element j to the right.
				}
				else {
					break;  // New position for element i is found.
				}
			}
			
			array[j] = temp;  // Insert element i into position j.
		}
	}
}
