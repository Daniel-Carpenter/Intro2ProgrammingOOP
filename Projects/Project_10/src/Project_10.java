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
			int row = 2;
			int col = 12;
			int[][] image = new int[row][col];
			int stripeWidth = 3;
			
		// Call Methods -----------------------------------------------------------------------
			saveImage(filename, image);
			
			// VERTICAL ARRAY -----------------------------------------------------------------
			int[][] verticalArray = createVerticalStripes(row, col, stripeWidth);
			
			for (int i = 0; i < row; ++i)
			{
				System.out.println(Arrays.toString(verticalArray[i]));	
			}			
	}
	
	public static void saveImage(String filename, int[][] image) throws IOException, FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(new File(filename));
		
		int color 	= 255; // 255 <- grayscale
		
		// Construct the Image ----------------------------------------------------------------
			writer.println("P2"); 									// P2
			writer.println(image.length + " " + image[0].length);	// row height
			writer.println(color);									// 255

			// Create the Actual Image
			for (int row = 0; row < image.length; ++row)
			{
				for (int col = 0; col < image[0].length; ++col)
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
	public static int[][] createVerticalStripes(int height, int width, int stripeWidth)
	{
		final int white 	= 0; // 255 <- grayscale
		final int black 	= 255;
		int color = black;
					
		int[][] array = new int[height][width];
		
		// Create the Actual array
		for (int row = 0; row < array.length; ++row)
		{
			color = black;
			for (int col = 0; col < array[0].length; ++col)
			{
				if (col % stripeWidth == 0)
				{
					if (color == white)
					{
						color = black;
					}
					else
					{
						color = white;
					}
				}
			}
		}
	
	return array;	
	}
}
