/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import com.example.blackjack.Hand;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

	private int bank;
	private int bet;
	private String name;
	private Hand hand;

	public Player() {
		bank = 100;
		hand = new Hand();
	}

	public int getBank() {
		return bank;
	}

	public void bust() {
		bank -= bet;
		bet = 0;
	}

	public void win() {
		bank += bet;
		bet = 0;
	}

	public void loss() {
		bank -= bet;
		bet = 0;
	}

	public void removeFromGame() {
		bank = -1;
	}

	public void resetBank() {
		bank = 0;
	}

	public void blackjack() {
		bank += bet * 3 / 2; // Adjusted for blackjack payout
		bet = 0;
	}

	public void push() {
		bet = 0;
	}

	public void setBet(int newBet) {
		bet = newBet;
	}

	public void setName(String name1) {
		name = name1;
	}

	public String getName() {
		return name;
	}

	public int getTotal() {
		return hand.calculateTotal();
	}

	public int getBet() {
		return bet;
	}

	public void addCard(com.example.blackjack.Card card) {
		hand.addCard(card);
	}

	public String getHandString() {
		return "Cards: " + hand.toString();
	}

	public void clearHand() {
		hand.clearHand();
	}
}
