package blackjack;

public class Game {
	public static void main(String[] args) {
		Deck d = new Deck();
		for (int i = 0; i < 56; i++) {
			d.getCard();
		}
	}
}
