import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* This program uses a nested loop to read data from a text file with multiple 
 * values on each line.
 */
public class ReadData {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner file = new Scanner(new File("data.txt"));
		
		// The first line of the file contains the number of rows and columns.
		int numRows = file.nextInt();
		int numCols = file.nextInt();
		
		// Use an accumulator to store the sum of all the data.
		int sum = 0;
		
		// Outer loop: Run the inner loop once for every row.
		for (int j = 0; j < numRows; ++j) {
			
			// Inner loop: Read all of the values on a single row.
			for (int i = 0; i < numCols; ++i) {
				sum += file.nextInt();
			}
			
			// Call nextLine to remove the trailing String on each line.
			file.nextLine();
		}
		
		file.close();
		
		// Calculate and print the average of all the data values.
		double average = (double) sum / (numRows * numCols);
		System.out.println("Average: " + average);
	}
}
