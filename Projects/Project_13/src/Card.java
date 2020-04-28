// Daniel Carpenter
import java.util.Objects;

public class Card 
{
	// MAIN -------------------------------------------------------------------
	public static void main(String[] args)
	{
		Card myCard;
		Card otherCard;
		
		// GET CARD OUTPUT
		myCard = new Card(10, Suit.Diamonds);
		System.out.println(myCard.getRank() + " of " + myCard.getSuit().toString());
		
		otherCard = new Card(10, Suit.Diamonds);

		//COMPARE CARDS

		if (myCard.compareTo(myCard, otherCard) > 0)
		{
			System.out.println("My card won");
		}
		else if (myCard.compareTo(myCard, otherCard) == 0)
		{
			System.out.println("Start War");
		}
		else
		{			
			System.out.println("Your card won");
		}
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
	
	public int compareTo(Card card, Card otherCard)
	{
		if (card.getRank() - otherCard.getRank() > 0)
		{
			return 1;
		}
		else if (card.getRank() - otherCard.getRank() == 0)
		{
			return 0;
		}  
		else
		{
			return -1;
		}
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
