import java.util.Arrays;

public class M2_Practice2 
{
	public static void main(String[] args)
	{
		int[] array = {10, 0, 12, 100, -200, 50, 1};
		int min = minOfArray(array);
		System.out.println(min);
	}
	
	public static int minOfArray(int[] array)
	{
		Arrays.sort(array);
		int min = array[0];
		return min;		
	}
}
