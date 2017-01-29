package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class BlackJackGame extends Game {
    public void start() {

        Scanner scanner = new Scanner(System.in);
        Hand playerOneHand = new Hand();
        Hand playerTwoHand = new Hand();
        int playerOneTotal = 0;
        int playerTwoTotal = 0;

        Deck cardDeck = new Deck();

        //Shuffle the deck
        cardDeck.shuffle();

        //Deal 2 cards to each player, including the dealer
        playerOneHand.addCardsToHand(cardDeck.deal(2));
        playerTwoHand.addCardsToHand(cardDeck.deal(2));

        //Show player1 their cards
        System.out.println("Player 1, you have the following cards:");
        for (int i = 0; i < playerOneHand.getTheHand().size(); i++) {
            System.out.print(playerOneHand.getTheHand().get(i) + " \n");
        }

        System.out.println("Player 1, do you want to Hit or Stay?");

        boolean playerOnePlaying = true;
        boolean playerTwoPlaying = false;
        String response = scanner.next();

        while (response.equalsIgnoreCase("Hit") && playerOnePlaying == true) {
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
                break;
            }
        }

        System.out.println("Player 2, you have the following cards:");
        for (int i = 0; i < playerTwoHand.getTheHand().size(); i++) {
            System.out.print(playerTwoHand.getTheHand().get(i) + " \n");
        }

        System.out.println("Player 2, do you want to Hit or Stay?");
        response = scanner.next();

        while (response.equalsIgnoreCase("Hit") && playerTwoPlaying == true) {
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
                playerTwoTotal = playerTwoHand.sumRankValues(playerTwoHand.getTheHand());
                break;
            }
        }

        if (playerOnePlaying == false && playerTwoPlaying == false) {
            //Show game results here
            System.out.print("Player 1 you got " + playerOneTotal + " points\n");
            System.out.print("Player 2 you got " + playerTwoTotal + " points\n");
            System.out.println("Game over!");
        }

    }

}


