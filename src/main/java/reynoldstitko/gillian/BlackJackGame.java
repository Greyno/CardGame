package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class BlackJackGame extends Game {

    Deck cardDeck = new Deck();
    Scanner scanner = new Scanner(System.in);
    Hand playerOneHand = new Hand();
    Hand playerTwoHand = new Hand();
    int playerOneTotal = 0;
    int playerTwoTotal = 0;
    boolean playerOnePlaying = true;
    boolean playerTwoPlaying = true;

    public void start() {

        dealAGoFishHand();

        showPlayerOneTheirCards();

        System.out.println("Player 1, do you want to Hit or Stay?");
        String response = scanner.next();

        //Play a round with player One

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
            }
        } else { //Account for a playing "staying" on the first turn
            playerOnePlaying = false;
            playerTwoPlaying = true;
            playerOneTotal = playerOneHand.sumRankValues(playerOneHand.getTheHand());
        }

        showPlayerTwoTheirCards();

        System.out.println("Player 2, do you want to Hit or Stay?");
        response = scanner.next();

        //Play a round with player Two
        if (response.equalsIgnoreCase("Hit") && playerTwoPlaying == true) {
            //Show player2 their cards
            System.out.println(playerOnePlaying + "in player2 loop");
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
            }
        } else { //Account for a player "staying" on the first turn
            playerTwoPlaying = false;
            playerOnePlaying = false;
            playerTwoTotal = playerTwoHand.sumRankValues(playerTwoHand.getTheHand());
        }

        //Show game results
        showGameResults(playerOnePlaying, playerTwoPlaying);

    }

    //--Refactor to provide some helper methods
    public void showGameResults(boolean playerOneStatus, boolean playerTwoStatus){
        if (playerOneStatus == false && playerTwoStatus == false) {
            //Show game results here
            System.out.print("Player 1 you got " + playerOneTotal + " points\n");
            System.out.print("Player 2 you got " + playerTwoTotal + " points\n");
            System.out.println("Game over!");
        } else System.out.println("Test");
    }

    public void dealAGoFishHand(){
        //Shuffle the deck
        cardDeck.shuffle();

        //Deal 2 cards to each player, including the dealer
        playerOneHand.addCardsToHand(cardDeck.deal(2));
        playerTwoHand.addCardsToHand(cardDeck.deal(2));
    }

    public void showPlayerOneTheirCards(){
        System.out.println("Player 1, you have the following cards:");
        for (int i = 0; i < playerOneHand.getTheHand().size(); i++) {
            System.out.print(playerOneHand.getTheHand().get(i) + " \n");
        }
    }

    public void showPlayerTwoTheirCards(){
        System.out.println("Player 2, you have the following cards:");
        for (int i = 0; i < playerTwoHand.getTheHand().size(); i++) {
            System.out.print(playerTwoHand.getTheHand().get(i) + " \n");
        }
    }
}


