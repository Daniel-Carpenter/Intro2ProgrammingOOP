import java.util.Scanner;

/** Play the card game called War. War is played using a standard deck of cards. The
 * cards are shuffled and dealt evenly to both players. Both players put the card on top
 * of their deck face up.  The card with the higher rank wins. If there is a tie in rank
 * then there is a war.  Each player plays two cards face down and a third card face up.
 * The player with the higher rank card wins all of the cards played during the war.
 * It is possible, although unlikely, to have a war result in another war, which could
 * result in another war, and so on.  If a player runs out of cards during a war, they lose.
 * Or at least that's the way my family played it.
 *
 * @author Deborah A. Trytten
 * @version 1.0
 *
 */
public class War
{
	/** Run the program that plays war.
	 *
	 * @param args There are no command line arguments
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = keyboard.nextLine();
		Player human = new Player(name);
		Player computer = new Player("Darth Vader");

		String answer = "yes";
		while (answer.equalsIgnoreCase("yes"))
		{
			dealHands(human, computer);

			if (playWar(human, computer, keyboard))
			{
				System.out.println(human.getName() + " won!");
			}
			else
			{
				System.out.println(computer.getName()+ " won!");
			}

			System.out.println("Play again? Yes or No");
			answer = keyboard.nextLine();
		};

		keyboard.close();

	}

	/** Play one game of war between a human and computer player.
	 *
	 * @param human The human player.
	 * @param computer The automated player.
	 * @param keyboard A Scanner to allow data entry at console.
	 * @return True if the player wins and false if the computer wins.
	 */
	private static boolean playWar(Player human, Player computer, Scanner keyboard)
	{
		while (human.getHandSize() > 0 && computer.getHandSize()>0)
		{
			System.out.println(human.getName() + " has " + human.getHandSize() + " cards.");
			System.out.println(computer.getName() + " has " + computer.getHandSize()
				+ " cards.");

			// Each player lays down a card
			Card hCard = human.playCard();
			Card cCard = computer.playCard();

			System.out.println(); // leave a blank line to make things legible
			System.out.println(human.getName() + "'s card is: " + hCard);
			System.out.println(computer.getName()+ "'s card is: " + cCard);

			// The player with the bigger rank wins and gets both cards
			if (hCard.compareTo(cCard )> 0)
			{
				human.takeCard(hCard);
				human.takeCard(cCard);
				System.out.println(human.getName() +  " gets both cards.");

			}
			else if (hCard.compareTo(cCard) < 0)
			{
				computer.takeCard(hCard);
				computer.takeCard(cCard);
				System.out.println(computer.getName() + " gets both cards.");
			}
			// If the ranks are the same there is a war!
			else
			{
				handleTie(human, computer, hCard, cCard);
			}

			System.out.println("Hit enter to continue");
			keyboard.nextLine();
		}

		if (human.getHandSize() == 0) // The human lost
			return false;
		else // The human won
			return true;
	}

	/** This method handles what happens when there is a war--i.e. when the computer
	 * and the player both played cards of the same rank.  hCard and cCard should be
	 * of the same rank.
	 * @param human The human Player.
	 * @param computer The automated Player.
	 * @param hCard The last card played by the human.
	 * @param cCard The last card played by the computer.
	 */
	private static void handleTie(Player human, Player computer, Card hCard, Card cCard)
	{
		Deck table = new Deck(true); // Create a place to store all the cards

		table.addCard(hCard);
		table.addCard(cCard);

		while (hCard.compareTo(cCard) == 0)
		{
			System.out.println("There is a war!");

			// Each player adds in two cards
			// If either player runs out of cards, the game is over
			System.out.println("Play two cards each face down");
			table.addCard(human.playCard());
			if (human.getHandSize() == 0) return;
			table.addCard(human.playCard());
			if (human.getHandSize() == 0) return;
			table.addCard(computer.playCard());
			if (computer.getHandSize()==0) return;
			table.addCard(computer.playCard());
			if (computer.getHandSize()==0) return;

			hCard = human.playCard();
			System.out.println(human.getName() + " plays: " + hCard);
			table.addCard(hCard);

			cCard = computer.playCard();
			System.out.println(computer.getName() + " plays: " + cCard);
			table.addCard(cCard);
		}

		// Winner, winner chicken dinner
		Player winner;
		if (hCard.compareTo(cCard) > 0)
		{
			winner = human;
		}
		else
		{
			winner = computer;
		}

		// To the winner go the spoils
		System.out.println(winner.getName() + " won the war!");
		System.out.println(winner.getName() + " receives " + table.size() + " cards!");
		moveAllCards(winner, table);

	}

	/** Move all of the cards in the given deck into Player one's hand.
	 *
	 * @param one The player to receive the cards.
	 * @param deck  The cards to be received.
	 */
	public static void moveAllCards(Player one, Deck deck)
	{
		// Write this method
	}

	/** Deal each player half of a standard deck of cards.
	 *
	 * @param one The first player.
	 * @param two The second player.
	 */
	public static void dealHands(Player one, Player two)
	{
		// Write this method
	}

}
