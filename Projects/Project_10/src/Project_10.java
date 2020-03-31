import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class Project_10 
{
	public static void main(String[] args)
	{
		// Construct Image Array -------------------------------
			int row = 3;
			int col = 2;
			int[][] image = new int[row][col];
			String filename = "image.txt";
			
		// Call Methods ----------------------------------------
			saveImage(filename, image);
	}
	
	public static void saveImage(String filename, int[][] image) throws IOException, FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(new File(filename));
		
		for (int row = 0; row < image.length; ++row)
		{
			for (int col = 0; col < image[0].length; ++col)
			{
				image[row][col] = 42;
			}
		}
		
		writer.close();
	}

}
