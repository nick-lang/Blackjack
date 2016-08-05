package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	private Map<String, Integer> cards = new HashMap<>();
	private List<String> remainingDeck = new ArrayList<>();
	
	public Deck() {
		Card c = new Card();
		for (String s : c.getSuit()) {	
			for (String r : c.getRank()) {
				int cardValue = 1;
				cards.put(r + "" + s, cardValue);
				cardValue++;
			}
		}
		for (String key : cards.keySet()) {
			remainingDeck.add(key);
		}
	}
	public void getCard(){
		Collections.shuffle(remainingDeck);
		System.out.println(remainingDeck);
	}

		
}
