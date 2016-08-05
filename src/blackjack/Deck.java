package blackjack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	private Map<String, Integer> cards = new HashMap<>();

	public Deck() {
		Card c = new Card();
		for (String s : c.getSuit()) {	
			for (String r : c.getRank()) {
				int cardValue = 1;
				cards.put(r + "" + s, cardValue);
				cardValue++;
			}
		}
	}


		
}
