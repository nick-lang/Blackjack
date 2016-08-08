package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<String> remainingCards = new ArrayList<>();
	private Card c = new Card();

	public Deck() {

		for (String key : c.getCards().keySet()) {
			remainingCards.add(key);
		}
		Collections.shuffle(remainingCards);
	}

	public String giveCard() {
		return remainingCards.remove(0);
	}

}
