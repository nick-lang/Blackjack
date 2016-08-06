package blackjack;

import java.util.ArrayList;

public class Hand {
	private ArrayList<String> cardsInHand = new ArrayList<>();
	private Card c = new Card();
	
	public void getCard(String card){
		cardsInHand.add(card);
	}
	
	public void displayHand(){
		for (String card : cardsInHand) {
			System.out.print(card + " ");
		}
		
	}
	
	public int getHandValue(){
		int handValue = 0;
		boolean aceExists = false;
		for (String card : cardsInHand) {
			handValue += c.giveValue(card);
			if(card.startsWith("A")){
				aceExists = true;
			}
		}
		if (aceExists && handValue > 21){
			handValue -= 10;
		}
		return handValue;
	}
}
