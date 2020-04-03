import java.util.Arrays;

public class SortingAlg_Self 
{
	public static void main(String[] args)
	{
		int[] array = {5, 3, 1, 2, 4, 8, 9, 7, 6};
		
		for (int start = 0; start < array.length - 1; ++start)
		{
			int minIndex = start;
			for (int test = start + 1; test < array.length - 1; ++test)
			{
				if (array[test] < array[minIndex])
				{
					minIndex = test;
				}
			}
			
			int temp = array[start];
			array[start] = array[minIndex];
		}
		System.out.println(Arrays.toString(array));
	}
}
