
public class Nested_Loops2 
{
	public static void main(String[] args)
	{
		
		String[] first 	= {"a", "b", "c", "d"};
		String[] second = {"b", "c"}; 
		int firstIndex 	= 0;
		int secondIndex = 0;
		boolean found 	= false;
		
		// OUTER LOOP <- Does first appear in second?
		for (firstIndex = 0; firstIndex < first.length; ++firstIndex);
		{
			String firstValue = first[firstIndex];
			
			// INNER LOOP <- steps into second to validate
			for (secondIndex = 0; secondIndex < second.length; ++ secondIndex)
			{
				if (second[secondIndex].equals(firstValue))
				{
					found = true;
				}
			}
		}
		
		if (!found)
		{
			output[outputSize] = firstValue; // this needs to be initialized
			++outputSize;
		}
	}
	
	System.out.println(Arrays.toString(output));
	System.out.println(outputSize);
}
