import java.util.Scanner;

public class M2_Practice1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[0];
		readGrades(input, array);
		
	}
	
	public static int[] readGrades(Scanner input, int[] array)
	{
		int numGrades = 0;
		int grades = input.nextInt();
		
		while (grades != -1)
		{
			array[numGrades] = grades;
			++numGrades;
			grades = input.nextInt();
		}
		
		return array;
	}
}
