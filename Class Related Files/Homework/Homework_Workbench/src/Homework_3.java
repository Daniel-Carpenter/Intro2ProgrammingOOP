
public class Homework_3 
{
	public static void main(String[] args)
	{
		double blendedColors = blend(10,10);
		System.out.println(blendedColors);
		
	}	
	
	public static int blend(double color1, double color2)
	{
		int result = (int) color1 + (int) color2;
				
	return result;	
	}
}
