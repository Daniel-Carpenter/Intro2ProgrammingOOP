import java.util.Scanner;
public class Homework_2 {
	public static void main(String[] args)
	{
// 1
	// example
		int variable = 1;
		if (variable > 0)
		{
			variable = 2;
		}
	
	// a
		int windSpeed = 60;
		int category = 1;
		
		if (windSpeed >75)
		{
			category = 4;
		}
		System.out.println(category);
		System.out.println(windSpeed);
	
	// b
		int firstDrone = 18;
		int secondDrone = 33;
		System.out.println(firstDrone);
		System.out.println(secondDrone);
		
		if (firstDrone > secondDrone)
		{
			firstDrone = firstDrone * 5;
		}
		
		if (firstDrone < secondDrone)
		{
			secondDrone = firstDrone - 5;
			firstDrone = secondDrone - 5;
		}
		
		else
		{
			secondDrone = firstDrone + 8;
		}
		System.out.println(firstDrone);
		System.out.println(secondDrone);	
	
	// c
		int cr = 42;
		double p = 76.50;
		
		if (p > 175)
		{
			cr = (int) p * 2;
		}
		else if (p > 125)
		{
			cr = (int) p;
		}
		else if (p > 75)
		{
			cr = (int) p / 2;
		}
		else
		{
			cr = 0;
		}
		System.out.println("cr = " + cr);
		System.out.println("p = " + p);
	// d
		double distance = 130.75;
		int speed = 62;
		boolean slowAndShort = false;
		boolean slowOrShort = false;
		boolean fastAndLong = false;
		if (speed < 60)
		{
		if (distance > 120)
		{
		slowOrShort = true;
		}
		else
		{
		slowAndShort = true;
		}
		}
		else
		{
		if (distance > 120)
		{
		fastAndLong = true;
		}
		else
		{
		slowOrShort = true;
		}
		}
		
		System.out.println("sAs :" + slowAndShort);
		System.out.println("sOs :" + slowOrShort);
		System.out.println("fAl :" + fastAndLong);
		System.out.println();
		
// 2
	//a
		int leftArrow = 	9;
		int rightArrow = 	28;
		int pageUp = 		73;
		int pageDown =		27;
		
		//! leftArrow =< rightArrow;		
		//leftArrow >= rightArrow > pageDown;
		
// 3
	// a
		String titleOfBook = new String("A Study in Scarlet by A. C. Doyle");
		String lowerCaseTitle = new String("a study in scarlet by a. c. doyle");
		String upperCaseTitle = new String("A STUDY IN SCARLET BY A. C. DOYLE");
		String emoTitle = new String("A STUDY IN SCARLET!!!!! By A. C. Doyle");
		String oddTitle = new String("a sTuDY iN SCaRLeT bY A. c. dOyLe");
		
		System.out.println("a: " + titleOfBook.equals(oddTitle));
		System.out.println("b: " + titleOfBook.equalsIgnoreCase(emoTitle));
		System.out.println("c: " + (upperCaseTitle == titleOfBook));
		System.out.println("d: " + upperCaseTitle.equalsIgnoreCase(oddTitle));
		System.out.println("e: " + upperCaseTitle.equalsIgnoreCase(titleOfBook));
	
// 4
		Scanner keyboard = new Scanner(System.in);
		double totalCost = 0;
		int totalNumber = 0;
		
		System.out.println("totalCost = " + keyboard.nextDouble() + " + " + keyboard.nextDouble());
		System.out.println("totalBooks = " + keyboard.nextInt() + " + " + keyboard.nextInt());
	
	}
}
