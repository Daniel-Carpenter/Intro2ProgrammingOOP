
public class insertionSort_Self 
{
	public static void main(String[] args)
	{
		int[] array = {4, 7, 2, 5, 1, 3, 8, 0, 0, 0};
		int arraySize = array.length;
		
	}
	
	public static void insertionSort(int[] array)
	{
		int start = 0;
		int aux = 0;
		
		for (start = 1; start < array.length; ++start);
		{
			//Move value to aux
			aux = array[start];
		}
		
		
		// shift values that are larhet than the value in the aux
		for (int inner = start -1; inner >= 0 && array[inner] > aux; --inner)
		{
			//shift
			array[inner + 1] = array[inner];
		}
		
		// Shift aux back to the array
		array[start] = aux;
	}

}
