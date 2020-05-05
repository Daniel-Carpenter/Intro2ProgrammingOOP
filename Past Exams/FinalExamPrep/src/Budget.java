/*
 * NOTES
 * 1. Must be STATIC to be accessed
*/
import java.util.ArrayList;

public class Budget 
{	
	
	// PRIVATE CLASS FUNCTIONS ---------------------------------------------------------
	private int ID;
	private double balance = 0;
	private static ArrayList<Double> history = new ArrayList<Double>();

	
	// PUBLIC CLASS FUNCTIONS ---------------------------------------------------------
	public Budget(int ID, double balanceAmt)
	{
		this.ID = ID;
		this.balance = balanceAmt;
		this.history = history;
		this.history.add(balance);
	}
	public int getID()
	{
		return this.ID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double updateBalance(double amtAdded)
	{
		balance += amtAdded;
		Budget.addToHistory(amtAdded);
		return balance;
	}
	
	public ArrayList<Double> getTransactionHistory()
	{
		return history;
	}
	
	private static ArrayList<Double> addToHistory(double amtAdded)
	{
		history.add(amtAdded);
		return history;
	}
}
