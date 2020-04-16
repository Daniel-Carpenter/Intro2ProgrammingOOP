
/* 
 * Key takeaways:
 * --------------
 * 1. Perfect sized arrays need only the size if creating a method
 * 2. If you want to create an Oversize array from another array, the method needs an array and a size
*/

import java.util.Arrays;
import java.util.Scanner;

public class Constructing_PerfectArrays 
{	
	public static void main(String[] args)
	{		
		// Get Size of Array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter desired size of array:");
		int size = input.nextInt();
		
		// Create Array and Output to String
		int[] perfectArray = new int[size];
		perfectArray = createArrayPerfect(size);
		System.out.println();
		System.out.println("Perfect Size Array = " + Arrays.toString(perfectArray));
		
		// Create Oversize Array from Perfect Size Array Above
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Would you like to create an oversize array? (1/0)");
		if (input.nextInt() == 1)
		{
			System.out.println("Enter size greater than " + size  + " to print your array to an OVERSIZE array:");
			int oversizeArrayCapacity = input.nextInt();
			
			while (oversizeArrayCapacity < size)
			{
				System.out.println();
				System.out.println("Please enter value greater than " + size);
				oversizeArrayCapacity = input.nextInt();
			}
			
			int[] oversizeArray = new int[oversizeArrayCapacity];
			oversizeArray = createArrayOversize(perfectArray, oversizeArrayCapacity);
			
			System.out.println();
			System.out.println("Oversize Array = " + Arrays.toString(oversizeArray));
		}
		else
		{
			System.out.println();
			System.out.println("Goobye, I guess... X[ ");
		}
		
	}
	
	
	public static int[] createArrayPerfect(int size)
	{
		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[size];
		
		for (int i = 0; i < size; ++i)
		{
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter any number, remaining number of inputs: " + (size - i));

			number = input.nextInt();
			array[i] = number;
		}
		
		return array;
	}
	
	public static int[]	createArrayOversize(int[] perfectArray, int size)
	{
		
		int[] array = new int[size];
		
		for (int i = 0; i < perfectArray.length; ++i)
		{
			array[i] = perfectArray[i];
		}
		
		return array;
	}
}
