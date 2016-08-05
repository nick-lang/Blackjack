package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	private List<String> remainingCards = new ArrayList<>();
	
	public Deck() {
		Card c = new Card();

		for (String key : c.getCards().keySet()) {
			remainingCards.add(key);
		}
	}
	
	public String getCard(){
		Collections.shuffle(remainingCards);
		System.out.println(remainingCards);
		return remainingCards.remove(0);
	}
	

		
}
