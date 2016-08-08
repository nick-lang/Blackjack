package blackjack;

import java.util.Scanner;

public class BlackjackTable {

	private void addToPlayer(Hand playerHand, Deck d) {
		playerHand.getCard(d.giveCard());
		System.out.print("Player hand: ");
		playerHand.displayHand();
	}

	private void addToDealer(Hand dealerHand, Deck d) {
		dealerHand.getCard(d.giveCard());
		System.out.print("Dealer hand: ");
		dealerHand.displayHand();
	}

	public void playGame() {
		Scanner keyboard = new Scanner(System.in);

		boolean gameOver = false;
		Deck d = new Deck();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();

		addToPlayer(playerHand, d);
		System.out.println();

		addToDealer(dealerHand, d);
		System.out.println("\n");

		addToPlayer(playerHand, d);
		System.out.println();

		addToDealer(dealerHand, d);
		System.out.println();

		while (gameOver == false) {
			int choice = 1;
			System.out.print("Enter 1 to hit or 2 to stay: ");
			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				addToPlayer(playerHand, d);
				System.out.println(playerHand.getHandValue());
				if (playerHand.getHandValue() == 21) {
					System.out.println("You win!");
					gameOver = true;
					break;
				} else if (playerHand.getHandValue() > 21) {
					System.out.println("You lose.");
					gameOver = true;
					break;
				}

				System.out.print("Dealer hand: ");
				dealerHand.displayHand();
				System.out.println("X \n");
				break;

			case 2:
				while (dealerHand.getHandValue() < 17 && gameOver == false) {
					addToDealer(dealerHand, d);
					System.out.println();
					if (dealerHand.getHandValue() > 21) {
						System.out.println("You win!");
						gameOver = true;
					} else if (dealerHand.getHandValue() > playerHand.getHandValue()
							&& dealerHand.getHandValue() <= 21) {
						gameOver = true;
					}
				}
				if (dealerHand.getHandValue() <= playerHand.getHandValue()) {
					System.out.println("You win!");
					gameOver = true;
				} else if (dealerHand.getHandValue() > playerHand.getHandValue() && dealerHand.getHandValue() <= 21) {
					System.out.println("You lose.");
					gameOver = true;
				}
				break;

			default:
				System.out.println("Invalid entry.");
				break;
			}

		}
		keyboard.close();
	}
}
