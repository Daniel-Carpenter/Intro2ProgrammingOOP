import java.util.ArrayList;
import java.util.Arrays;

public class MathEasy 
{
	private int number;
			public static void main(String[] args)
			{
				ArrayList<Integer> list = new ArrayList<Integer>();

				System.out.println(MathEasy.getNumber(10));
				System.out.println(MathEasy.multiply(10,2));
				System.out.println(MathEasy.powerTo(10,2));
				System.out.println(MathEasy.addToList(list,MathEasy.powerTo(200, 2)));
				System.out.println(MathEasy.addToList(list,MathEasy.powerTo(500, 2)));
				
				System.out.println(Arrays.toString(MathEasy.create2dArray(10, 5, 2)));				
			}
			
			public MathEasy(int number)
			{
				getNumber(number);
			}
			
				public static int getNumber(int number)
				{
					return number;
				}
				
				public static int multiply(int num1, int num2)
				{
					return num1*num2;
				}
	
				public static int powerTo(int number, int power)
				{
					int outputNum = number;
					for (int i = 0; i < power - 1; ++i)
					{
						outputNum = number * outputNum;
					}
					return outputNum;					
				}
				
				public static ArrayList<Integer> addToList(ArrayList<Integer> existingList, int number)
				{
					existingList.add(number);
					return existingList;
				}
				
				public static int[][] create2dArray(int rows, int cols, int skipRow)
				{
					int[][] array = new int[rows][cols];
					
					for (int i = 0; i < rows; ++i)
					{
						for (int j = 0; j < cols; ++j)
						{
							if (rows % skipRow == 0)
							{
								array[i][j] = 0;
							}
							
							array[i][j] = 1;
						}
					}
					return array;
				}

}
