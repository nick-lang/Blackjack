package blackjack;

import java.util.Scanner;

public class BlackjackTable {
	public void playGame() {
		Scanner keyboard = new Scanner(System.in);
		
		boolean gameOver = false;
		Deck d = new Deck();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		
		playerHand.getCard(d.giveCard());
		System.out.print("Player hand: ");
		playerHand.displayHand();
		System.out.println();
		
		dealerHand.getCard(d.giveCard());
		System.out.print("Dealer hand: ");
		dealerHand.displayHand();
		System.out.println("\n");
		
		playerHand.getCard(d.giveCard());
		System.out.print("Player hand: ");
		playerHand.displayHand();
		System.out.println();
		
		System.out.print("Dealer hand: ");
		dealerHand.displayHand();
		System.out.println("X \n");
		
		while (gameOver == false) {
			int choice = 1;
			System.out.print("Enter 1 to hit or 2 to stay: ");
			choice = keyboard.nextInt();
			
			switch (choice) {
			case 1:
				playerHand.getCard(d.giveCard());
				System.out.print("Player hand: ");
				playerHand.displayHand();
				System.out.println(playerHand.getHandValue());
				System.out.println();
				
				System.out.print("Dealer hand: ");
				dealerHand.displayHand();
				System.out.println("X \n");
				break;
				
			case 2:
				
				break;

			default:
				System.out.println("Invalid entry.");
				break;
			}
			
			gameOver = true;
		}
	}
}
