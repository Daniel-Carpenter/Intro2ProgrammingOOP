import java.util.Arrays;
import java.util.Scanner;

public class M2_2019 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array = null;
		array = readGrades(array,input);
		Arrays.sort(array);
		System.out.println("Max Grade = " + max(array));
		System.out.println("Curve = " + curve(array));
		System.out.println("Curved Grades = " + curvedGrades(array));
		System.out.println("Average = " + avg(array));
		
		
		
	}
	
	public static int[] readGrades(int[] arr, Scanner input)
	{
		int[] arrOut = null;
		for (int i = 0; i < 0; ++i)
		{
			arrOut = new int[i];
			arrOut[i] = input.nextInt();
			++i;
		}
		return arrOut;
	}
	
	public static int max(int[] arr)
	{
		int max = arr[arr.length - 1];
		return max;
	}
	
	public static int curve(int[] arr)
	{
		int curve = 100 - arr[arr.length - 1];
		return curve;
	}
	
	public static String curvedGrades(int[] arr)
	{
		for (int i = 0; i < arr.length; ++i)
		{
			arr[i] = arr[i] + curve(arr);
		}
		String grades = Arrays.toString(arr);
		return grades;
	}
	
	public static double avg(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; ++i)
		{
			sum = arr[i] + sum;
		}
		double avg = (double) sum / (arr.length);
		return avg;
	}
}
