// Daniel Carpenter
import java.util.Objects;

public class Card 
{
	// SETUP
	public enum Suit 
	{
		DIAMONDS, HEARTS, CLUBS, SPADES;
	}
	
	private static final int MIN_RANK = 1;
	private static final int MAX_RANK = 13;
	
	private int rank;
	private Suit suit;
	
	// CALL METHODS - SET RANK AND SUIT ---------------------------------------
	public Card(int rank, String suit)
	{
		setRank(rank);
		setSuit(suit);
	}
	
	// --GET-- RANK AND SUIT METHODS ------------------------------------------
	public int getRank()
	{
		return rank;
	}
	
	public Suit getSuit()
	{
		return suit;
	}
	
	// --SET-- RANK AND SUIT METHODS ------------------------------------------
	public void setRank(int rank)
	{
		if (!(rank < MIN_RANK || rank > MAX_RANK))
		{
			this.rank = rank;
		}
	}
	
	public void setSuit(Suit suit)
	{
		if (suit != null)
		{
			this.suit = suit;
		}
	}
	
	// toString ---------------------------------------------------------------
}
