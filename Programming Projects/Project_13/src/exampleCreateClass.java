
public class exampleCreateClass 
{
	private int number;
			public static void main(String[] args)
			{
				System.out.println(exampleCreateClass.getNumber(10));
				System.out.println(exampleCreateClass.multiply(10,2));
				System.out.println(exampleCreateClass.powerTo(10,2));
			}
			
			public exampleCreateClass(int number)
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
}
