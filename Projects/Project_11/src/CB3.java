import java.util.Scanner;



public class CB3 
{
	public static void main(String[] args) 
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);
		
		String word = keyboard.nextLine();
		int reps = keyboard.nextInt();
		
		System.out.println(repeatStart(word, reps));
		keyboard.close();
	}

	public static String repeatStart(String word, int n) 
	{ 
        String result = "";
        for (int i = 0; i < n; i++) {
            result = word.substring(0, n);
        }
        return result;
	}

}
