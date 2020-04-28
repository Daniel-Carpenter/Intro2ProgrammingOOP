// Daniel Carpenter
import java.util.Objects;

public class Card 
{
	// MAIN -------------------------------------------------------------------
	public static void main(String[] args)
	{
		Card card;
		
		// GET CARD OUTPUT
		card = new Card(10, Suit.Diamonds);
		System.out.println(card.getRank() + " of " + card.getSuit().toString());		 
	}
	
	// SETUP
	public enum Suit 
	{
		Diamonds, Hearts, Clubs, Spades;
	}
	
	private static final int MIN_RANK = 1;
	private static final int MAX_RANK = 13;
	
	private int rank;
	private Suit suit;
	
	// CALL METHODS - SET RANK AND SUIT ---------------------------------------
	public Card(int rank, Suit suit)
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
	public String toString()
	{
		return String.format("%s[rank=%d, suit=%s]",
                getClass().getSimpleName(),
                getRank(),
                getSuit().name());	
	}
	
	public boolean compareTo(Object otherCard)
	{
		if (!(otherCard instanceof Card))
		{
			return false;
		}
		if (otherCard == this)
		{
			return true;
		}  
		Card that = (Card)otherCard;
		
		return that.getRank() == getRank() && that.getSuit() == getSuit();
	}
	
	public static int getMinRank()
	{
		return MIN_RANK;
	}

	public static int getMaxRank()
	{
		return MAX_RANK;
	}

	public static Suit[] getSuits()
	{
		return Suit.values();
	}
}
