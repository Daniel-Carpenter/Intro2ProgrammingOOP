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
			int row 		= 250;
			int col 		= 250;
			int stripeWidth = 10;
			int squareWidth = 10;
			
			int[][] image 	= new int[row][col];
			
		// Call Methods -----------------------------------------------------------------------
			saveImage(filename, image);
			
			// Vertical Array -----------------------------------------------------------------
				int[][] verticalArray = createVerticalStripes(row, col, stripeWidth);
				for (int i = 0; i < row; ++i)
				{
					System.out.println(Arrays.toString(verticalArray[i]));						// need to make print
				}
			
			// Horizontal Array ---------------------------------------------------------------
				System.out.println("--------------------------------------------------------"); // delete later
				
				int[][] horizontalArray = createHorizontalStripes(row, col, stripeWidth);
				for (int i = 0; i < row; ++i)
				{
					System.out.println(Arrays.toString(horizontalArray[i]));					// need to make print
				}
			
			// Checkerboard Array ---------------------------------------------------------------
				System.out.println("--------------------------------------------------------"); // delete later
				
				int[][] checkboardArray = createCheckerboard(row, col, squareWidth);
				for (int i = 0; i < row; ++i)
				{
					System.out.println(Arrays.toString(checkboardArray[i]));					// need to make print
				}
				System.out.println("--------------------------------------------------------"); // delete later
			// Diagonal Array ---------------------------------------------------------------
				
				int[][] diagonalArray = createDiagonalStripes(row, col, stripeWidth);
				for (int i = 0; i < row; ++i)
				{
					System.out.println(Arrays.toString(diagonalArray[i]));					// need to make print
				}
	}
	
	// ----------------------------------^ MAIN METHOD ABOVE ^-------------------------------------
	
	
	// SAVE IMAGE METHOD --------------------------------------------------------------------------
		public static void saveImage(String filename, int[][] image) throws IOException, FileNotFoundException
		{
			PrintWriter writer = new PrintWriter(new File(filename));
			
			int color = 255; // 255 <- grayscale
			
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
		
	// VERTICAL STRIPE METHOD ---------------------------------------------------------------------
		public static int[][] createVerticalStripes(int height, int width, int stripeWidth)
		{
			final int white = 0; // 255 <- grayscale
			final int black = 255;
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
					
					array[row][col] = color;
				}
			}
		
		return array;	
		}
	
	// HORIZONAL STRIPE METHOD --------------------------------------------------------------------
		public static int[][] createHorizontalStripes(int height, int width, int stripeWidth)
		{
			final int white 	= 0; // 255 <- grayscale
			final int black 	= 255;
			int color = black;
						
			int[][] array = new int[height][width];
			
			// Create the Actual array
			for (int row = 0; row < array.length; ++row)
			{	
				if (row % (stripeWidth * 2) >= stripeWidth)
				{
					color = black;
				}
				else
				{
					color = white;
				}
				
				for (int col = 0; col < array[0].length; ++col)
				{
					array[row][col] = color;
				}
			}
			
			return array;
		}
	
	// CHECKBOARD METHOD --------------------------------------------------------------------------
		public static int[][] createCheckerboard(int height, int width, int squareWidth)
		{
				final int white 	= 0; // 255 <- grayscale
				final int black 	= 255;
				int color = white;
							
				int[][] array = new int[height][width];
				
				// Create the Actual array
				for (int row = 0; row < array.length; ++row)
				{
					// OUTER LOOP --------------------------------------------
						if (row % squareWidth == 0)
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
					// INNER LOOP --------------------------------------------
						for (int col = 0; col < array[0].length; ++col)
						{						
							if (col % squareWidth == 0)
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
							
							if (col == (width - 1))
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
							
							array[row][col] = color;

						}
				}
			return array;
		}
		
	// DIAGONAL METHOD ----------------------------------------------------------------------------
		public static int[][] createDiagonalStripes(int height, int width, int stripeWidth)
		{
			
			// METHOD BELOW ----------------------------------------------			
				final int white 	= 0; // 255 <- grayscale
				final int black 	= 255;
							
				int[][] array = new int[height][width];
				
				// OUTER LOOP
				for (int row = 0; row < array.length; ++row)
				{
					// INNER LOOP
					for (int col = 0; col < array[0].length; ++col)
					{						
						if ((col + row) % (stripeWidth*2) < stripeWidth)
						{
							array[row][col] = black;
							
						}
						else 
						{
							array[row][col] = white;
						}
					}
					
				}
			return array;
		}
}
