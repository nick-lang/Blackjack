package blackjack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card {
	private List<String> rank = new ArrayList<>();
	private List<String> suit = new ArrayList<>();
	private Map<String, Integer> cards = new HashMap<>();

	public Card() {
		addRanks();
		addSuits();
		
		for (String s : suit) {
			for (String r : rank) {
				int cardValue = 1;
				cards.put(r + "" + s, cardValue);
				cardValue++;
			}
		}
	}
	
	public Map<String, Integer> getCards(){
		return cards;
	}
	
	private void addRanks() {
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
	}

	private void addSuits() {
		suit.add("C");
		suit.add("D");
		suit.add("H");
		suit.add("S");
	}

}
