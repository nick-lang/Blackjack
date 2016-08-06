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
			int cardValue = 1;
			for (String r : rank) {
				if(r.equals("J") || r.equals("Q")  || r.equals("K")  ){
					cardValue = 10;
				}
				if(r.equals("A")){
					cardValue = 11;
				}
				cards.put(r + "" + s, cardValue);
				cardValue++;
			}
		}
	}

	public Map<String, Integer> getCards() {
		return cards;
	}
	
	public int giveValue(String key){
		return cards.get(key);
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
		suit.add("\u2663");
		suit.add("\u2662");
		suit.add("\u2661");
		suit.add("\u2660");
	}

}
