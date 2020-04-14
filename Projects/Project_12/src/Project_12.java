// Daniel Carpenter

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_12 
{
	public static void main(String[] args)
			throws FileNotFoundException, IOException {

			final String FILENAME_COMMON = "common-dictionary.txt";
			final String FILENAME_PERSONAL = "personal-dictionary.txt";
			final int CAPACITY_PERSONAL_DICT = 100;
			String prompt = "Enter a word or 'quit' to stop: ";
			
			// Read the common dictionary and store the words in an array.
			ArrayList<String> common = readFile(FILENAME_COMMON);
			
			// Read the personal dictionary, creating the file if it doesn't 
			// exist. Store the words in an oversize array.
			//sizePersonal = readFileOversize(FILENAME_PERSONAL, personal);
			
			// Construct a Scanner to read user input from the keyboard.
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Spell Checker");
			System.out.println("-------------");
			
			// Perform a priming read to get the first word.
			System.out.print(prompt);
			String word = keyboard.nextLine().toLowerCase();
			
			// Enter the user input loop.
			while (!word.equals("quit")) {
				
				// Check if the word is in either dictionary.
//				if (checkSpelling(word, common, personal, sizePersonal)) {
//					System.out.println("The word is spelled correctly.");
//				} 
//				else {
//					System.out.println("The word was not found in the "
//						+ "dictionary.");			
//					System.out.println("Would you like to add it to your personal "
//						+ "dictionary (yes/no)?");
//					String response = keyboard.nextLine().toLowerCase();
					
					// If the user responds "yes" and there is room in the oversize
					// array, add the word to the end of the array and sort it.
//					if (response.equals("yes") && sizePersonal < personal.length) {
//						personal[sizePersonal] = word;
//						sizePersonal += 1;
//						Arrays.sort(personal, 0, sizePersonal);
					}
//				}
//				
//				// Get the next word from the user.
//				System.out.println();
//				System.out.print(prompt);
//				word = keyboard.nextLine().toLowerCase();
//			}
//			
//			keyboard.close();
//			writeFile(FILENAME_PERSONAL, personal, sizePersonal);
//			System.out.println("Goodbye!");
		}
		
		// READ FILE -----------------------------------------------
		public static ArrayList<String> readFile(String fileName) throws FileNotFoundException
		{
			Scanner input = new Scanner(new File(fileName));
			ArrayList<String> commonDictionary = new ArrayList<String>();
			
			while (input.hasNextLine())
			{
				commonDictionary.add(input.nextLine());
			}
			
			return commonDictionary;
		}
		
		
		// Return true if word is in either array; otherwise, return false. Note 
		// that the arrays are sorted, so binary search can be used.
		public static boolean checkSpelling(String word, String[] common, 
			String[] personal, int sizePersonal) {
				
			if (Arrays.binarySearch(common, word) >= 0) {
				return true;
			}
			
			if (Arrays.binarySearch(personal, 0, sizePersonal, word) >= 0) {
				return true;
			}
			
			return false;
		}
		
		// Write the nonempty elements of an oversize array to a given file.
		public static void writeFile(String filename, String[] array, int size)
				throws FileNotFoundException {

			PrintWriter writer = new PrintWriter(filename);

			for (int idx = 0; idx < size; ++idx) {
				writer.println(array[idx]);
			}

			// Close the file; otherwise, the contents will be lost.
			writer.close();
		}
}