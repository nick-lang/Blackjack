package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Card {
	private List<String> rank = new ArrayList<>();
	private List<String> suit = new ArrayList<>();

	public List<String> getRank() {
		return rank;
	}

	public List<String> getSuit() {
		return suit;
	}

	public Card() {
		rank.add("1");
		rank.add("2");
		rank.add("3");
		rank.add("4");
		rank.add("5");
		rank.add("6");
		rank.add("7");
		rank.add("8");
		rank.add("9");
		rank.add("10");
		rank.add("J");
		rank.add("Q");
		rank.add("K");
		rank.add("A");
		
		suit.add("C");
		suit.add("D");
		suit.add("H");
		suit.add("S");
	}

}
