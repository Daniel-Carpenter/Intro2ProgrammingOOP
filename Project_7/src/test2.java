import java.util.Arrays;

public class test2 
{
	// MAIN METHOD
	public static void main(String[] args)
	{

	// DECLARATIONS
		int size = 3;
		int lowerBound = 2;
		int upperBound = 7;
		String message;
		
	//SORT ARRAY
		int[] wheelNums = randomIntArray(lowerBound, upperBound, size);
		Arrays.sort(wheelNums); // sort
		System.out.println(Arrays.toString(wheelNums)); // print
		
	// OUTPUT OF GAME
		int tokensWon = calculateWinnings(wheelNums);
		if (tokensWon == 0)
		{
			message = "Sorry, you lost :(";
		}
		else if (tokensWon == 1)
		{
			message = "Pair! You win 1 token.";
		}
		else if (tokensWon == 2)
		{
			message = "Sequence! You win 2 tokens";
		}
		else if (tokensWon == 50)
		{
			message = "Triple 7s! You win 50 tokens";
		}
		else 
		{
			message ="Triple " + wheelNums[0] + "! You win " + (wheelNums[0] * 3) + " tokens.";
		}
		
		System.out.println(message);
	}
	
	
	// RANDOM INT
	public static int randomInt(int lowerBound, int upperBound)
	{	
		int output = (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
		return output;
	}
	
	
	// RANDOM ARRAY
	public static int[] randomIntArray(int lowerBound, int upperBound, int size) 
	{
	    int[] array = new int[size];
	    
	    for (int i = 0; i < array.length; i++) 
	    {
	    	array[i] = randomInt(lowerBound,upperBound);
	    }
	    return array;
	}
	    
	//CALCULATE WINNINGS
	public static int calculateWinnings(int[] wheelNums)
	{
		int subTotal;
		
		if (wheelNums[1] == wheelNums[0] || wheelNums[2] == wheelNums[0] || wheelNums[0] == wheelNums[1] || wheelNums[2] == wheelNums[1] || wheelNums[0] == wheelNums[2] || wheelNums[1] == wheelNums[2])
		{
			subTotal = 1;
		}
		else if (wheelNums[1] == wheelNums[0] + 1 && wheelNums[2] == wheelNums[1] + 1)
		{
			subTotal = 2;
		}
		else if (wheelNums[0] != 7 && wheelNums[0] == wheelNums[1] && wheelNums[1] == wheelNums[2])
		{
			subTotal = wheelNums[0] * 3;
		}
		else if (wheelNums[0] == 7 && wheelNums[0] == wheelNums[1] && wheelNums[1] == wheelNums[2])
		{
			subTotal = 50;
		}
		else
		{
			subTotal = 0;
		}
	
		return subTotal;	
	}	
}
