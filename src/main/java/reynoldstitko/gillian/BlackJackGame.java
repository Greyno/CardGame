package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class BlackJackGame extends Game {
    Scanner scanner = new Scanner(System.in);
    Hand playerOneHand = new Hand();
    Hand playerTwoHand = new Hand();
    int playerOneTotal = 0;
    int playerTwoTotal = 0;

    Deck cardDeck = new Deck();

    public void start() {

        //Shuffle the deck
        cardDeck.shuffle();

        dealTheCards();

        //Show player1 their cards
        System.out.println("Player 1, you have the following cards:");
        for (int i = 0; i < playerOneHand.getTheHand().size(); i++) {
            System.out.print(playerOneHand.getTheHand().get(i) + " \n");
        }

        System.out.println("Player 1, do you want to Hit or Stay?");

        boolean playerOnePlaying = true;
        boolean playerTwoPlaying = false;
        String response = scanner.next();

        if (response.equalsIgnoreCase("Hit") && playerOnePlaying == true) {
            playerOneHand.addCardsToHand(cardDeck.deal(1));
            System.out.println("Player 1, you have the following cards:");
            for (int i = 0; i < playerOneHand.getTheHand().size(); i++) {
                System.out.print(playerOneHand.getTheHand().get(i) + " \n");
            }
            System.out.println("Player 1, do you want to Hit or Stay?");
            response = scanner.next();

            if (response.equalsIgnoreCase("Stay")) {
                playerOnePlaying = false;
                playerTwoPlaying = true;
                playerOneTotal = playerOneHand.sumRankValues(playerOneHand.getTheHand());
                //break;
            }
            //Account for player staying in the first move
        } if(response.equalsIgnoreCase("Stay") && playerOnePlaying == true){
            playerOnePlaying = false;
            playerTwoPlaying = true;
            playerOneTotal = playerOneHand.sumRankValues(playerOneHand.getTheHand());
        }

        System.out.println("Player 2, you have the following cards:");
        for (int i = 0; i < playerTwoHand.getTheHand().size(); i++) {
            System.out.print(playerTwoHand.getTheHand().get(i) + " \n");
        }

        System.out.println("Player 2, do you want to Hit or Stay?");
        response = scanner.next();

        if (response.equalsIgnoreCase("Hit") && playerTwoPlaying == true) {
            //Show player2 their cards
            playerTwoHand.addCardsToHand(cardDeck.deal(1));
            System.out.println("Player 2, you have the following cards:");
            for (int i = 0; i < playerTwoHand.getTheHand().size(); i++) {
                System.out.print(playerTwoHand.getTheHand().get(i) + " \n");
            }
            System.out.println("Player 2, do you want to Hit or Stay?");
            response = scanner.next();

            if (response.equalsIgnoreCase("Stay")) {
                playerTwoPlaying = false;
                playerOnePlaying = false;
                playerTwoTotal = playerTwoHand.sumRankValues(playerTwoHand.getTheHand());
                //break;
            }
        } if(response.equalsIgnoreCase("Stay") && playerTwoPlaying == true){
            playerTwoPlaying = false;
            playerOnePlaying = false;
            playerTwoTotal = playerTwoHand.sumRankValues(playerTwoHand.getTheHand());
        }

        endTheGame(false, false);

    }

    public void dealTheCards(){
        //Deal 2 cards to each player, including the dealer
        playerOneHand.addCardsToHand(cardDeck.deal(2));
        playerTwoHand.addCardsToHand(cardDeck.deal(2));
    }

    public void endTheGame(boolean playerOnePlaying, boolean playerTwoPlaying){
        if (playerOnePlaying == false && playerTwoPlaying == false) {
            //Show game results here
            System.out.print("Player 1 you got " + playerOneTotal + " points\n");
            System.out.print("Player 2 you got " + playerTwoTotal + " points\n");
            System.out.println("Game over!");
        }
    }

}