
public class ForLoops {
	public static void main(String[] args)
	{
		int total = 0;
		int count = 0;
		while (count <= 2)
		{
		    total = total + 3 * count;
		    count = count + 1;
		}
		System.out.println(total);
		System.out.println(count);
		
		
		System.out.println("");
		System.out.println("Q1b");
		System.out.println("----------");
		int total1 = 0;
		int count1 = 7;
		int count2 = 0;
		while (count1 > count2)
		{
		    total1 = count1 + count2;
		    count1 = count1 - 2;
		    count2 = count2 + 1;
		}
		System.out.println(total1);
		System.out.println(count1);
		System.out.println(count2);
		
		
		System.out.println("");
		System.out.println("Q1c");
		System.out.println("----------");
		
		int totalc = 0;
		for (int x = 0; x != 10; x = x + 5)
		{
		    totalc = totalc - x;
		}
		System.out.println(totalc);
	
		System.out.println("");
		System.out.println("Q1d");
		System.out.println("----------");
		
		
		int cycle = 0;
		int idx = 6;
		for (idx = 6; idx > 0; --idx)
		{
		    cycle = (cycle + 1) % 4;
		}
		System.out.println(cycle);
		System.out.println(idx);
		
		
		System.out.println("");
		System.out.println("Q1e");
		System.out.println("----------");
		
		int huge = 92486;
		int countE = 0;
		while (countE < 0)
		{
		    huge = huge * 2;
		}
		System.out.println(huge);
		System.out.println(countE);

		
	}

}
