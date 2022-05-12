/** This class represents a Deck of cards.  A deck does not have to be complete,
 * although it may be.  The class could be renamed to GroupOfCards.
 * @author James Dizikes
 *  CS 1324 Fall 2019
 *  Modified by Deborah Trytten:
 *  To make SUITS a String[] instead of a char[].
 *  Added many additional methods to make the class more complete.
 *  Added Javadoc.
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	/** These constants set up the characteristics of the Deck of cards.
	 *
	 */

	/** Construct a new Deck of cards that has the same cards as the argument deck.
	 *
	 * @param deck A legal Deck of cards.
	 */
	public Deck (Deck deck)
	{

	}

	/** Construct a new deck of shuffled cards.
	 *
	 * @param isEmpty If isEmpty is true, the Deck will contain no cards.
	 * If isEmpty is false, the Deck will have all cards, as specified by the class
	 *  constants, and the cards will be shuffled.
	 */
	public Deck(boolean isEmpty)
	{

	}

	/** Shuffle the Deck.
	 *
	 */
	public void shuffle()
	{
	
	}

	/** Return the number of cards in the Deck, unit indexed.
	 *
	 * @return The number of cards in the Deck.
	 */
	public int size()
	{
		return 0; // change this
	}

	/** Draw the Card on top of the Deck. If there are no Cards in the Deck, return
	 * null.
	 * @return The card at the top of the Deck. If there are no Cards, null will be returned.
	 */
	public Card drawCard()
	{
		return null; // change this
	}

	/** Remove a given Card c from the Deck. If the card is not in the Deck, nothing
	 * is done.
	 * @param c The card to be removed from the Deck.
	 */
	public void removeCard(Card c)
	{

	}

	/** Remove the Card at location index in the Deck. Index 0 is the bottom of the
	 * Deck, index size()-1 is the top.
	 *
	 * @param index The index.
	 */
	public void removeCard(int index)
	{

	}

	/** Add the given Card c to the bottom of the Deck.
	 *
	 * @param c The card to be added to the Deck.
	 */
	public void addCard(Card c)
	{

	}

	/** Return the Card at the given index in the Deck.
	 *
	 * @param index The index of the desired Card. This index must be legal.
	 * @return The Card at the given index.
	 */
	public Card getCard(int index)
	{
		return null; // change this
	}

	/** Determine whether or not Card c is in the Deck.
	 *
	 * @param c The Card sought.
	 * @return True if c is in the Deck and false otherwise.
	 */
	// This method wasn't used in this project, but should be here to make
	// this class complete.
	public boolean isInDeck(Card c)
	{
		return false;
	}

	/** Sort the Deck, first by suit, then by rank.
	 *
	 */
	public void sortCards()
	{

	}

	/** Create a String object that contains representations of the Cards in this
	 * Deck.  The cars are separated with commas.
	 */
	public String toString()
	{

		return null; // change this
	}
}
