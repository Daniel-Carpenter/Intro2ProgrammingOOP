//Key: Start with count = 0, then <
//	   Start with count = 1, then <=
// ++count;
// sum += value

import java.util.Scanner;

public class Count_Loop 
{
	public static void main(String[] args)
	{
		int count = 0;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		
		while (count < 5)
		{
			System.out.println("Enter a value");
			int value = input.nextInt();
			//sum = sum + 1
			sum += value;
			
			//count = count + 1
			++count;
		}
		
		double average = sum / count;
		System.out.println("Average equals: " + average);
		
	}
	
}
