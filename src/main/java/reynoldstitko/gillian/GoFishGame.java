package reynoldstitko.gillian;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class GoFishGame extends Game {
    public void start(){

        Scanner scanner = new Scanner(System.in);
        Hand playerOneHand = new Hand();
        Hand playerTwoHand = new Hand();

        Deck cardDeck = new Deck();

        //Shuffle the deck
        cardDeck.shuffle();

        //Deal 5 cards to each player
        playerOneHand.addCardsToHand(cardDeck.deal(5));
        playerTwoHand.addCardsToHand(cardDeck.deal(5));

        boolean isPlayerOneEmpty = false;
        boolean isPlayerTwoEmpty = false;

        //Game loop - game continues until one player has no cards left or ???

        //Each player gets five cards.
        // Moving clockwise, players take turns asking a specific player for a given number(rank) of card. If
        // someone asks you for a number(rank) that you have, the cards are taken from your hand. if you do not have any
        // cards of that number(rank), your opponent must go fish, taking one new card from the pile of cards.
        // When it’s your turn, select a player you think might have a needed card. Pick one card from your hand of
        // the desired number(rank). If the player has the desired card, he or she must pass it over. If not, you must go fish.
        // If you get the card you asked for, you get to go again.
        // If you run out of cards and there are still cards left, you get five free cards. Play continues until all
        // hands are empty and there are no more cards to draw from. The winner is the player with the most points
        // at the end of the game.

        while(isPlayerOneEmpty == false && isPlayerTwoEmpty == false){

            int cardsToRemove = 0;
            //Show the player1 list of cards
            System.out.println("Player 1, you have the following cards:");
            for(int i = 0; i < playerOneHand.getTheHand().size(); i++){
                System.out.print(playerOneHand.getTheHand().get(i)+ " \n");
            }

            System.out.println("Player 2, you have the following cards:");
            for(int i = 0; i < playerTwoHand.getTheHand().size(); i++){
                System.out.print(playerTwoHand.getTheHand().get(i)+ " \n");
            }

            //Ask player1 which number(rank) they want to get from player2
            System.out.println("What rank card do you want to check for (Ace, Two, Three, etc to King)?");

            //Get the player1 response for the rank
            String rank = scanner.next();
            //String suit = scanner.next();

            //Check the rank to see if it's in player2's hand
            if(playerTwoHand.checkHandForCard(rank)) {
                //If yes, then move all the cards with that rank from player1 to player2,
                // reducing player2's cards and increasing player 1's cards

                //Get the number of cards of the same rank and remove that number
                int removedCards = playerTwoHand.countCardsInHandOfRank(playerTwoHand.getTheHand(), rank);
                for(int i = 1; i <= removedCards; i++){
                    playerTwoHand.removeCardFromHand(rank);
                    playerOneHand.addCardToHand(new Card(rank));
                }
                System.out.print("You have removed "+ removedCards + "cards");
            } else {
                //If no, then respond "Go fish" and deal one card to player from the deck
                cardDeck.deal(1);
                System.out.print("Go Fish!\n");
            }

            if(playerOneHand.getTheHand().size() == 0 || playerTwoHand.getTheHand().size() == 0){
                isPlayerOneEmpty = true;
            }

            //Player1 can go again - ask player1 which rank they want to get
            //Player2 gets to play once player1 has to go fish
        }
        System.out.print("Game over!");
    }
}
