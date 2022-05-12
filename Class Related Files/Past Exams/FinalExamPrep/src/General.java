
public class General 
{
	public static void main(String[] args)
	{
		int mod = 6 % 9;
		System.out.println(mod);
		
		int intDiv = 35 / 12;
		System.out.println(intDiv);
		
		int number = 9; int bBound = 3; int hBound = 9;
		if (number % 2 == 1) number = number + 1;
		if (number <= bBound || number >= hBound) number = bBound + hBound / 2;
		else
		number = hBound;

		System.out.println(number);
		
		String data[] = {"a", "e", "f", "a", "b", "g"};
		int dataSize = data.length;
		String value = "a";
		int times = 3;
		
		System.out.println("New size: " + removeCount(data, dataSize, value, times));			
	}
	
	public static int removeCount(String[] data, int dataSize, String value, int times)
	{
		int newSize = dataSize;
		int i = 0;
		while(times >= 0 && i < dataSize)
		{
			if (data[i] == value)
				{
					newSize -= 1;
				}			
			++ i;
			--times;
		}
		return newSize;
	} 

}
