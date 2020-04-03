
public class Homework1 
{

	public static void main(String[] args)
	{
// 1
	// a
		String favBand = "Pearl Jam";
		System.out.println(favBand);		
		
	// b	
		boolean favBandIsTouring;
		
	// c
		int numAlbumsSold = 100;
		System.out.println(numAlbumsSold);
		
	// d
		char musicalKey;
		
	// e
		double numMiles;
		
// 2
	// a
		int a;
		a = 1 + 2 * 3;
		System.out.println(a);
		
	// b
		int b;
		b = 42 % 5;
		System.out.println(b);
		
	// d
		int d;
		//d = 41.9;
		//System.out.println(d);
		
	// f
		//double fA;
		//int fB;
		//int fC;
		//int fD;
		//double Ans = fA / fB + fC / fD;
		
// 3 
		System.out.println("- 3 STARTS HERE:");
		int first = 8;
		int second = 9;
		int third = 7;
		
		third = second;
		second = first;
		first = third;
		
		System.out.println(third);
		System.out.println(second);
		System.out.println(first);

// 4
		System.out.println("- 4 STARTS HERE");
		int iSmall = 3;
		int iLarge = 7;
		double dSmall = 2.0;
		double dLarge = 8.5;
		
	// a
		double numA = dSmall / iSmall;
		System.out.println("numA: " + numA);
	// b
		int numB = (int) dSmall / iSmall;
		System.out.println("numB: " + numB);
		
	// c
		int numC = iSmall - (int) dLarge;
		System.out.println("numC: " + numC);
		
	// d
		double numD = iLarge % iSmall;
		System.out.println("numD: " + numD);
		
	// e
		//int numE = (int) iLarge * dSmall;
		//System.out.println("numE: " + numE);
		
	// f
		int numF = (int) (iLarge * dSmall) + iSmall;
		System.out.println("numF: " + numF);
		
	// g
		int numG = iLarge * iSmall % iLarge / iSmall;
		System.out.println("numG: " + numG);
		
	// h
		int numH = iLarge * iSmall % (int) dLarge / iSmall;
		System.out.println("numH: " + numH);
		
	// i
		//double numI = (int) (dLarge * ‐ dSmall + iLarge);
		//System.out.println("numI: " + numI);
		
	// j
		//int number = iLarge + iSmall / dSmall - dLarge;
		//System.out.println("numJ: ");
		
	}
}






