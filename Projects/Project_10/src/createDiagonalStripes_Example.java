import java.util.Arrays;

public class createDiagonalStripes_Example 
{
	public static void main(String[] args)
	{
		int height		= 4;
		int width		= 4;
		int stripeWidth	= 2;
		
		// METHOD BELOW ----------------------------------------------			
			final int white 	= 0; // 255 <- grayscale
			final int black 	= 255;
			int color = black;
						
			int[][] array = new int[height][width];
			
			// Create the Actual array
			for (int row = 0; row < array.length; ++row)
			{
				// OUTER LOOP -------------------------------------------- // GO THROUGH LOOP TO MAKE DIAGONAL

				// INNER LOOP --------------------------------------------
					for (int col = 0; col < array[0].length; ++col)
					{						
						if ((col + row) % stripeWidth == 0)
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


