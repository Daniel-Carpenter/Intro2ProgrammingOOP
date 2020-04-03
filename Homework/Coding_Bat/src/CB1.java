import java.util.Scanner;

public class CB1 
{

	public static void main(String[] args) 
	{
	   // Do not edit the main program
	  Scanner keyboard = new Scanner(System.in);
	  int day = keyboard.nextInt();
      boolean snooze = keyboard.nextBoolean();
      
      System.out.print (alarm(day, snooze));
	}

	public static String alarm(int day, boolean snooze) 
	{
		String time = "";
			
			if (day >= 1 && day < 6 && snooze == false)
			{
				time = "8:00";
			}
			else if (day >= 1 && day < 6 && snooze == true)
			{
				time = "8:05";
			}
			else if (day == 0 || day == 6 && snooze == false)
			{
				time = "10:30";
			}
			else if (day == 0 || day == 6 && snooze == true)
			{
				time = "10:45";
			}
			else
			{
				System.out.println("invalid day");
			}
			
		return time;
	}

}
