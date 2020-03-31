import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class Project_10 
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		// Construct Image Array --------------------------------------------------------------
			String filename = "image.txt";
			int row = 3;
			int col = 2;
			int[][] image = new int[row][col];
			
		// Call Methods -----------------------------------------------------------------------
			saveImage(filename, image);
	}
	
	public static void saveImage(String filename, int[][] image) throws IOException, FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(new File(filename));
		
		int row 	= 0;
		int col 	= 0;
		int color 	= 255; // 255 <- grayscale
		
		// Construct the Image ----------------------------------------------------------------
			writer.println("P2"); 									// P2
			writer.println(image.length + " " + image[0].length);	// row height
			writer.println(color);									// 255

			// Create the Actual Image
			for (row = 0; row < image.length; ++row)
			{
				for (col = 0; col < image[0].length; ++col)
				{
					image[row][col] = color;
				}				
				
				// writer.println(image); 		// this is what prints the full array (height width)
				writer.println(color + " " + color); 			// Make shift way to get only values

			}
					
		// Close the File ---------------------------------------------------------------------
			writer.flush();
			writer.close();
	}
}
