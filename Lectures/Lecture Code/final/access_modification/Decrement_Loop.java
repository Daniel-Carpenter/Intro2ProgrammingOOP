
public class Decrement_Loop 
{
	public static void main (String[] args)
	{
		
		int factor = 0;
		int number = 36;
		int possible = number - 1;
		
		while (number % possible != 0)
		{
			--possible; // possible = possible - 1;
		}
		
		
	}

}
