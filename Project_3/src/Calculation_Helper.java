
public class Calculation_Helper {
	public static void main(String[] args)
	{
		String yarnType1 = "Chunky Alpaca";
		String yarnType2 = "Big and Fluffy";
		
		
		
	// Determine Substitute Ball Amount
		int numBalls1 = 2;
		int yardPerBall1 	= 50;
				
		int yardPerBall2	= 40;
		
		int totalYdsReq = numBalls1 * yardPerBall1;
		
		double numBalls2 = (double) totalYdsReq / yardPerBall2;
	
	// Output Amount
		System.out.println("You should purchase " + ((int) Math.ceil(numBalls2)) + " balls of " + yarnType2 + " instead of " + numBalls1 + " balls of " + yarnType1 + " " + ".");
			
	}
}
