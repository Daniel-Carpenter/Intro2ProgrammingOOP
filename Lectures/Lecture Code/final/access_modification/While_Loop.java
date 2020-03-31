import java.util.Scanner;

public class While_Loop {
	public static void main(String[] Args) {
		
		Scanner stdin = new Scanner(System.in);
		
		final int SENTINAL = -1;
		int sum = 0;
		int grade;
		int count1 = 0;
		
		System.out.println("Enter a grade greater than or equal to 0:");
			grade = stdin.nextInt();
	
			while (grade != SENTINAL)
			{
				sum = sum + grade;
				count1 = count1 + 1;
				System.out.println("Enter a grade greater than or equal to 0:");
				grade = stdin.nextInt();
			}
	}
}
