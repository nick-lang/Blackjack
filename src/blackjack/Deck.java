package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	private List<String> remainingCards = new ArrayList<>();
	private Card c = new Card();
	
	public Deck() {

		for (String key : c.getCards().keySet()) {
			remainingCards.add(key);
		}
	}

	public String giveCard() {
		Collections.shuffle(remainingCards);
		return remainingCards.remove(0);
	}


}
