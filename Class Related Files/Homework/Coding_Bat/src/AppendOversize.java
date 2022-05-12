import java.util.Arrays;
import java.util.Scanner;

public class AppendOversize 
{

	public static void main(String[] args) 
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);
		final int SIZE = 20;
		int[] array = new int[SIZE];
		int[] append = new int[SIZE];
		
		// Read in the first array
		int value = keyboard.nextInt(); // priming read
		int index;
		for(index=0; index<array.length && value != -1; ++index)
		{
			array[index] = value;
			value = keyboard.nextInt(); // priming read
		}
		keyboard.nextLine(); // get the carriage return out of there
		
		// Get the size from the number of values put in the first array
		int arraySize = index;
		
		// Read in the second array
		value = keyboard.nextInt(); // priming read
		for (index=0; index<append.length && value != -1; ++index)
		{
			append[index] = value;
			value = keyboard.nextInt(); // priming read
		}
		int appendSize = index;
		
		arraySize = appendOversize(array, arraySize, append, appendSize);
		System.out.println("Array is " + Arrays.toString(array) + " size is " + arraySize);
		keyboard.close();
	}
	
	public static int appendOversize(int[] array, int size, int[] toAppend, int toAppendSize) 
	{

        if (size == array.length) 
        { 
            return size; 
        } 
        else 
        {
            int i = 0;

            while (size < array.length && i < toAppendSize) 
            { 
            	array[size++] = toAppend[i++];

            }

        }
        
        return size;
    }
}
