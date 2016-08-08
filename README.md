# Blackjack
This program was written as a project for week 3 of Skill Distillery. This program is a simple blackjack simulator.

## To run this program: 
Compile and run Game.java in the src folder. The program will deal two cards each to the player, and to the dealer. The player will be prompted to hit or stay by pressing 1 or 2. When the player chooses to stay, the dealer will get cards until the game is over.

##Class structure:
Blackjack consists of a Card class that generates all possible cards, and holds their values in a HashMap. The Deck class gets a list of all possible cards and adds them to a deck. The Deck class keeps track of which cards have been used, and is shuffled every time a card is used. The Hand class is able to hold cards, display the cards it holds, and make a decision about the value of aces. The BlackjackTable class acts as the dealer, and provides the game logic. Finally, the Game class is where main is located.
