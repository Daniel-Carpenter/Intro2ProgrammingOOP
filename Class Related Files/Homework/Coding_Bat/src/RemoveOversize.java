import java.util.Arrays;
import java.util.Scanner;

public class RemoveOversize 
{

	public static void main(String[] args) 
	{
		// Do  not edit this code
		Scanner keyboard = new Scanner(System.in);
		
		final int SIZE = 20; // for the oversized array
		String[] array = new String[SIZE];
		// Read in data from keyboard--all array elements are presumed to be on one line
		String contents = keyboard.nextLine();
		String[] contentsInArray = contents.split(" ");
		// Make sure we're in the range of both arrays
		int index;
		for(index = 0; index <contentsInArray.length && index < array.length; ++index)
		{
			array[index] = contentsInArray[index];
		}
		int arraySize = index;
		
		String value = keyboard.nextLine(); // Get the value to remove
		
		int resultSize =  removeOversize(array, arraySize, value);
		
		System.out.println("The resulting array contains " + Arrays.toString(array) + " and is of size " + resultSize);
		keyboard.close();
	}

	public static int removeOversize(String[] source, int sourceSize, String removeMe)
	{
	       int initialSourceSize = sourceSize;
	       
	       for(int i=0;i<sourceSize;i++)
	       {
	           if(source[i].equals(removeMe))
	           {
	               for(int j=i+1;j<sourceSize;j++)
	               {
	                   source[j-1] = source[j];
	               }
	               sourceSize = sourceSize-1;
	           }
	       }
	       
	       for(int i=sourceSize;i<initialSourceSize;i++)
	       {
	           source[i] = null;
	       }

	       return sourceSize;
	}
}