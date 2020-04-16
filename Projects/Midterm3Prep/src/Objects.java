import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays; 


public class Objects 
{
	public static void main(String[] args)
	{
////		Bidi letters = new Bidi("abcde", Bidi.DIRECTION_RIGHT_TO_LEFT);
////		System.out.println(letters.toString());
////		
////		
////		// PRINT DIRECTION
////		int direction = Bidi.DIRECTION_LEFT_TO_RIGHT;
////		
////		if (letters.baseIsLeftToRight())
////		{
////			System.out.println("left to right");
////		}
////		if(letters.isRightToLeft())
////		{
////			System.out.println("right to left");
////		}
////		if (letters.isMixed())
////		{
////			System.out.println("mixed");
////		}
////				
////		// BIDI ANALYSIS?
////		if (Bidi.requiresBidi(letters, 0,letters.getLength()))
////		{
////			System.out.println("Requires Bidi");
////		}
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//			list.add(120);
//			list.add(-1);
//			list.add(15);
//			System.out.println("Unsorted: " + list);
//		
//		
//		// INSERTION SORT	
//		for (int start = 1; start < list.size(); ++start)
//		{
//			int temp = list.get(start);
//			int index = start;
//			
//			while (index > 0 && temp < list.get(index - 1))
//			{
//				list.set(index, list.get(index - 1));
//				--index;
//			}
//			
//			list.set(index, temp);
//		}
//
//		System.out.println("Sorted:   " + list);
//		
//		
//		ArrayList<String> haiku = new ArrayList<String>(12);
//		haiku.add("Serious");
//		haiku.add("problem.");
//		haiku.add("All");
//		haiku.add(3, "shortcuts");
//		haiku.add(1, "error.");
//		haiku.add("have");
//		haiku.add("have");
//		haiku.add("disappeared.");
//		haiku.add("Screen.");
//		haiku.set(6, "computer");
//		haiku.add(haiku.get(0));
//		haiku.remove(2);
//		haiku.add("page");
//		haiku.remove("computer");     
//		
//		if (!haiku.contains("are")) 
//		{    
//			haiku.add("blank");
//			int ind = haiku.indexOf("page");
//			haiku.set(ind, "Mind.");
//		}		
//		System.out.println(haiku);
//
//		
////		StringBuilder source = new StringBuilder("rail");
////		StringBuilder result = new StringBuilder(" x ");
////		System.out.println(source);
////		System.out.println(result);
////		
////		
////		source.deleteCharAt(0); 		System.out.println("source = " + source);
////		char c = 'z';					System.out.println("c = " + c);
////
////		if (source.length() > 0)
////			{
////				c = source.charAt(0);	System.out.println("c = " + c);
////			}
////		result.insert(0, c);			System.out.println("result = " + result);
////		result.append(c);				System.out.println("result = " + result);
////		
////		System.out.println();
////		System.out.println("ITER 2 -----------------------------------------");
////		
////		source.deleteCharAt(0); 		System.out.println("source = " + source);
////		c = 'z';						System.out.println("c = " + c);
////
////		if (source.length() > 0)
////			{
////				c = source.charAt(0);	System.out.println("c = " + c);
////			}
////		result.insert(0, c);			System.out.println("result = " + result);
////		result.append(c);				System.out.println("result = " + result);
////
////		
////		System.out.println();
////		System.out.println("ITER 3 -----------------------------------------");
////		
////		source.deleteCharAt(0); 		System.out.println("source = " + source);
////		c = 'z';						System.out.println("c = " + c);
////
////		if (source.length() > 0)
////			{
////				c = source.charAt(0);	System.out.println("c = " + c);
////			}
////		result.insert(0, c);			System.out.println("result = " + result);
////		result.append(c);				System.out.println("result = " + result);
////
////		
////		System.out.println();
////		System.out.println("ITER 4 -----------------------------------------");
////		
////		source.deleteCharAt(0); 		System.out.println("source = " + source);
////		c = 'z';						System.out.println("c = " + c);
////
////		if (source.length() > 0)
////			{
////				c = source.charAt(0);	System.out.println("c = " + c);
////			}
////		result.insert(0, c);			System.out.println("result = " + result);
////		result.append(c);				System.out.println("result = " + result);
////
////		
////		System.out.println();
////		System.out.println("ITER 5 -----------------------------------------");
////		
////		source.deleteCharAt(0); 		System.out.println("source = " + source);
////		c = 'z';						System.out.println("c = " + c);
////
////		if (source.length() > 0)
////			{
////				c = source.charAt(0);	System.out.println("c = " + c);
////			}
////		result.insert(0, c);			System.out.println("result = " + result);
////		result.append(c);				System.out.println("result = " + result);
//		
//		
//		StringBuilder source = new StringBuilder("rail");
//		StringBuilder result = new StringBuilder(" x ");
//
//		while (source.length() > 0)
//		{
//		source.deleteCharAt(0);
//		char c = 'z';
//		if (source.length() > 0)
//			{
//				c = source.charAt(0);
//			}
//		
//		result.insert(0, c);
//		result.append(c);
//		}
//		
//		System.out.println("source = " + source);
//		System.out.println("result = " + result);
//		System.out.println("c = ");
//		
//		
//		System.out.println();
//		System.out.println("2b ----------------------------------------");
//		String word = new String("abcde");
//		String expanded = new String("");
//		char letter = word.charAt(0);
//		expanded = expanded + letter;
//		
//		int index = 1;
//		int dup = 0;
//		
//		for (index = 1; index < word.length(); ++index)
//		{
//			dup = index + 1;
//			while (dup > 0)
//			{
//				expanded += "*";
//				dup -= 1;
//			}
//			letter = word.charAt(index);
//			expanded = expanded + letter;
//		}
//		
//		System.out.println("word = " + word);
//		System.out.println("index = " + index);
//		System.out.println("dup = " + dup);
//		System.out.println("expanded = " + expanded);
//  		System.out.println("letter = " + letter);
//
//  		System.out.println();
//  		System.out.println();
//  		System.out.println();
//  		System.out.println();
//  		System.out.println();
//  		System.out.println();
//  		System.out.println();
//		System.out.println("2a ----------------------------------------");
//  		
//		int n = 0;
//		int count = 0;
//		double fraction = 0;
//		double factor = 0;
//		
//		System.out.println();
//		System.out.println("INITITAL ----------------------------------------");
//		System.out.println();
//		
//		System.out.println("n = "+ n);
//		System.out.println("count = "+ count);
//		System.out.println("fraction = "+ fraction);
//		System.out.println("factor = "+ factor);
//		System.out.println();
//		System.out.println();
//		System.out.println();		
//		
//		
//		for (n = 0; n < 5; ++n)
//		{
//			 fraction = 1/2.0;
//			count = 0;
//		for ( factor = fraction/2.0; count <= n && factor >= 0.05; 
//						factor= factor/2.0, ++count)
//			{
//					fraction = fraction + factor;
//			}
//			System.out.println();
//			System.out.println(n + " " + count + " ----------------------------------------------");
//			System.out.println();
//		
//		
//			System.out.println("n = "+ n);
//			System.out.println("count = "+ count);
//			System.out.println("fraction = "+ fraction);
//			System.out.println("factor = "+ factor);
//		}		
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("FINAL -------------------------");
//		System.out.println("n = "+ n);
//		System.out.println("count = "+ count);
//		System.out.println("fraction = "+ fraction);
//		System.out.println("factor = "+ factor);
//		
//		
		int[] result = new int[] {0,0,0,0,0,0,0,0,0,0};
		int[] first = new int[] {1, 4, 1, 6, 8};
		int firstSize = 5; 
		int[] second = {2, 1, 4, 1, 6, 3};
		int secondSize = 2;
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		for (int i = 0; i < second.length; ++i)
		{
			for (int j = 0; j < first.length; ++j)
			{
				if (Arrays.binarySearch(first,second[j]) != -1 && !(Arrays.binarySearch(result,second[j]) > -1))
				{
					result[j] = second[j];
					
				}
				else if (Arrays.binarySearch(second,first[j]) != -1 && !(Arrays.binarySearch(result,first[j]) > -1))
				{
					result[j] = first[j];
					
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
}
