import java.util.Scanner;

public class BudgetUI 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		int begBalance = 0;
		
		System.out.println("BANK ACCOUNT SIMULATION");
		System.out.println("-------------------------------------");
		System.out.println();
		

			
		System.out.println("Please Enter your Starting balance");
		begBalance = userInput.nextInt();
						
		Budget daniel = new Budget(9743, begBalance);
		
		System.out.println("Type '-01' to stop simulation, or type anything else to add or withdraw funds.");

		while (userInput.nextInt() != -1)
		{
			System.out.println("Current Balance: " + daniel.getBalance());
					
			System.out.println("Would you like to add or withdraw funds? (1/0)");
				if (userInput.nextInt() == 1)
				{				
					System.out.println();
					System.out.println("-------------------------------------");
					System.out.println("Please enter funds amount: (indicate withdrawal with a negative (-) sign)");
					daniel.updateBalance(userInput.nextDouble());
					
					System.out.println();
					System.out.println("New Balance: " + daniel.getBalance());
				}
	
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println("History of Transactions for user "  + daniel.getID() + ": "+ daniel.getTransactionHistory());

			System.out.println();
			System.out.println("-------------------------------------");
			
			System.out.println("Type '-01' to stop, or type anything else to add or withdraw more funds.");
		}

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Make sure to give us your money again soon, ya hear? Sure hope we donn't invest it in the wrong things...");				
	}
}
