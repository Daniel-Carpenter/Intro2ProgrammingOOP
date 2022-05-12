import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		int size = (int) (Math.random() * 10);
		int[] array = createRandomArrayPerfect(size);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(insertionSort(array,size)));
	}
	
	public static int[] createRandomArrayPerfect(int size)
	{
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; ++i)
		{
			array[i] = (int) (Math.random() * 100);
		}
		
		return array;
	}
	
	public static int[] insertionSort(int[] array, int size)
	{
		for(int start = 0; start < array.length; ++start)
		{
			int aux = array[start];
			int inner;
			
			for(inner = start - 1; inner >= 0 && array[inner] > aux; --inner)
			{
				array[inner + 1] = array[inner];
			}
			array[inner + 1] = aux;
		}
		
		return array;
	}
}
