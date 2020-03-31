import java.lang.Object;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class PopularMovie
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String filename = "movie-list.txt";
		String[] fileInput = readFile(filename);
		
	}

	public static String[] readFile(String filename) throws FileNotFoundException
	{
		int count = 0;	
		Scanner file = new Scanner(new File(filename)); // read in file
	
		while (file.hasNextLine())
		{
			++count;
			String movieName = file.nextLine();
			file.nextLine();
		}
			
		String[] movieTitles = new String[count];
		String movie = file.nextLine();
		movieTitles[count] = movie;
		++count;
		return movieTitles;
	}

	public static void lowercase(String[] array)
	{
		for (int i = 0; i < array.length; ++i)
		{
			array[i] = array[i].toLowerCase();
		}
		
	}

	public static String findMostFrequent(String[] array)
	{
		int count = 0;
		//Arrays.sort(array);
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(array) );
        String[] array2 = linkedHashSet.toArray(new String[] {});
		return array2;
	}
}