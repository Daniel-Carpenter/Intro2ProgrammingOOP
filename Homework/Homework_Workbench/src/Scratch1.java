import java.util.Arrays;

public class Scratch1 
{
	public static void main(String[] args)
	{
		int[] array = {-1, 1, 0, -100000000, 100000000};
		System.out.println("Max = " + maxOfArray(array));
		System.out.println("Min = " + minOfArray(array));
		System.out.println("Count = " + array.length);
		System.out.println("Range = " + rangeOfArray(array));
	}
	
	public static int maxOfArray(int[] array)
	{
		Arrays.sort(array);
		int output = array[array.length - 1]; // need to take one less because zero-indexed
		return output;
	}
	
	public static int minOfArray(int[] array)
	{
		Arrays.sort(array);
		int output = array[0];
		return output;
	}
	
	public static int rangeOfArray(int[] array)
	{
		Arrays.sort(array);
		int output = array[array.length - 1] - array[0];
		return output;
	}
}
