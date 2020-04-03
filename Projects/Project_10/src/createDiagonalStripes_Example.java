import java.util.Arrays;

public class createDiagonalStripes_Example 
{
	public static void main(String[] args)
	{
		int height		= 4;
		int width		= 4;
		int stripWidth	= 2;
		
		// METHOD BELOW ----------------------------------------------			
			final int white 	= 0; // 255 <- grayscale
			final int black 	= 255;
			int color = white;
						
			int[][] array = new int[height][width];
			
			// Create the Actual array
			for (int row = 0; row < array.length; ++row)
			{
				for (int col = 0; col < array[0].length; ++col)
				{
						
					array[row][col] = col + row;
					array[row][col] = (array[row][col] + 1) % (stripWidth + 1);
					if (array[row][col] % stripWidth == 0)
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
				
				System.out.println(Arrays.toString(array[row]));
			}
	}
}


