/*
 * NOTES
 * 1. Must be STATIC to be accessed
*/

import java.util.ArrayList;

public class Budget 
{	
	
	// PRIVATE CLASS FUNCTIONS ---------------------------------------------------------
	private static int ID;
	private static double balance = 0;
	private static ArrayList<Double> history = new ArrayList<Double>();

	
	// PUBLIC CLASS FUNCTIONS ---------------------------------------------------------
	public Budget(String name, double balanceAmt, double updateAmt)
	{
		this.ID = getID();
		Budget.addBalance(balanceAmt);
		Budget.updateBalance(updateAmt);
	}
	
	public static void addID(int newID)
	{
		ID = newID;
	}
	
	public static int getID()
	{
		return ID;
	}
	
	public static void addBalance(double initialBalance)
	{
		Budget.addToHistory(balance);

		balance += initialBalance;		
		Budget.addToHistory(initialBalance);
	}
	
	public static double getBalance()
	{
		return balance;
	}
	
	public static double updateBalance(double amtAdded)
	{
		balance += amtAdded;
		Budget.addToHistory(amtAdded);
		return balance;
	}
	
	public static ArrayList<Double> getTransactionHistory()
	{
		return history;
	}
	
	private static ArrayList<Double> addToHistory(double amtAdded)
	{
		history.add(amtAdded);
		return history;
	}
}
