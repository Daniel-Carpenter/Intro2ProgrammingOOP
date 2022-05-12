import java.util.Arrays;

public class Scratch2 
{
	public static void main(String[] args)
	{
		int[] array = {-7, 4, 9, -5, 11, 14};
		System.out.println("Element 9:  " + Arrays.binarySearch(array, 9));
		System.out.println("Length:     " + array.length);
		System.out.println("array[1]:   " + array[1]);
		
		Arrays.sort(array);
		System.out.println("Element 11: " + Arrays.binarySearch(array, 11));
		System.out.println("Element 2: " + Arrays.binarySearch(array, 2));
	}

}
