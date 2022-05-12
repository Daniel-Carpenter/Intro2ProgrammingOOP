import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] data = {9, 4, 2, 1, 7, 8, 3, 6, 5};
		System.out.println(Arrays.toString(data));
	
		selectionSort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public static void selectionSort(int[] array) {
		
		// At the start of each iteration of the outer loop, the elements at 
		// indices less than i are in their final sorted position in the array.
		for (int i = 0; i < array.length - 1; ++i) {
			
			// Find the index of the minimum element in the unsorted part of 
			// the array. The sorted position of this element is at index i.
			int idxMin = i;
			for (int j = i + 1; j < array.length; ++j) {
				
				if (array[j] < array[idxMin]) {
					idxMin = j;
				}
			}
			
			// Swap the elements at indices i and idxMin.
			int temp = array[i];
			array[i] = array[idxMin];
			array[idxMin] = temp;
		}
	}
}
