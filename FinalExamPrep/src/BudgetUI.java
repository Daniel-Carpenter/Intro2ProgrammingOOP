import java.util.Scanner;

public class BudgetUI 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please create ID: (ex. '1234')");
		Budget.addID(userInput.nextInt());
		
		System.out.println("Please Add Initial Balance: ");
		Budget.addBalance(userInput.nextDouble());
		
		System.out.println("Current Balance: " + Budget.getBalance());
				
		System.out.println("Would you like to add or withdraw funds? (1/0)");
			if (userInput.nextInt() == 1)
			{				
				System.out.println();
				System.out.println("-------------------------------------");
				System.out.println("Please enter funds amount: (indicate withdrawal with a negative (-) sign)");
				Budget.updateBalance(userInput.nextDouble());
				
				System.out.println();
				System.out.println("New Balance: " + Budget.getBalance());
			}
			else
			{
				System.out.println();
				System.out.println("-------------------------------------");
				System.out.println("Make sure to give your money again soon, ya hear?");				
			}

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("History of Transactions for user: "  + Budget.getID() + ": "+ Budget.getTransactionHistory());
	}
}
