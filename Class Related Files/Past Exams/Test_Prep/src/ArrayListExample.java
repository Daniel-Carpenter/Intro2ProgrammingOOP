import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();

		list.add("LOL!");
		list.add(list.get(0));
		list.add(0, "LMAO");
		list.remove(list.get(0));
		
		
		System.out.println(list);
	}
}

