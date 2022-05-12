import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class Nested_Loops 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// READ IN FILE
		Scanner file = new Scanner(new File ("TestData.txt"));
		int numberStudents = file.nextInt();
		file.nextLine();
		
		final int NUMBER_TESTS = 5; //constant because doesnt change
		int accumulator = 0;
		
		/* outer loop reads one line of the file and adds 
		 * one student's data to the running sum */
		
		// OUTER:
			for (int students = 0; students < numberStudents; ++students)
			{
				// INNER: adds up the numbers

				for (int tests = 0; tests < NUMBER_TESTS; ++tests)
				{
					accumulator = accumulator + file.nextInt();
				}
				
				file.hasNextLine();
			}
		double average = accumulator / (double) numberStudents * NUMBER_TESTS;
		System.out.println("The Average is: " + average);
	}

}
