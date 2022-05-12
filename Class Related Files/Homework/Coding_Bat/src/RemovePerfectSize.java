import java.util.Arrays;
import java.util.Scanner;

public class RemovePerfectSize 
{

	public static void main(String[] args) 
	{
		// Do  not edit this code
		Scanner keyboard = new Scanner(System.in);
		
		// Read in data from keyboard--all array elements are presumed to be on one line
		String contents = keyboard.nextLine();
		String[] array = contents.split(" ");
		
		String value = keyboard.nextLine(); // Get the value to remove
		
		String[] result =  removePerfectSize(array, value);
		
		System.out.println("The resulting array contains " + Arrays.toString(result));
		keyboard.close();
	}

	public static String[] removePerfectSize(String[] source, String removeMe)
    {
		int count=0;
		for (int i = 0; i <source.length ; i++) 
		{
			if(source[i].equals(removeMe))
			{
				count++;
			}
		}
		
		int newLength=source.length-count;
		String[] ar=new String[newLength];
		int j=0;
		
		for (int i = 0; i <source.length ; i++) 
		{
			if(!source[i].equals(removeMe))
			{ ar[j]=source[i];
				j++;
			}
		}
	        return ar;
	    }
}

