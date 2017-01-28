package reynoldstitko.gillian;

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

        boolean isGameOver = false;

        //Game loop - game continues until one player has no cards left or the deck is empty

        while(isGameOver == false){

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
            boolean playerOneStillPlaying = true;


            while (playerOneStillPlaying && (playerOneHand.getTheHand().size() !=0)){
                System.out.println("Player 1, what rank card do you want to check for (Ace, Two, Three, etc to King)?");

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
                        Card temp = playerTwoHand.removeCardFromHand(rank);
                        if(temp == null){

                        }else playerOneHand.addCardToHand(temp);
                        playerTwoHand.getTheHand().trimToSize();
                    }

                } else {
                    //If no, then respond "Go fish" and deal one card to player from the deck
                    System.out.print("Go Fish!\n");
                    playerOneHand.addCardsToHand(cardDeck.deal(1));
                    playerOneStillPlaying = false;
                }
                //Show the player1 list of cards
                System.out.println("Player 1, you have the following cards:");
                for(int i = 0; i < playerOneHand.getTheHand().size(); i++){
                    System.out.print(playerOneHand.getTheHand().get(i)+ " \n");
                }

                System.out.println("Player 2, you have the following cards:");
                for(int i = 0; i < playerTwoHand.getTheHand().size(); i++){
                    System.out.print(playerTwoHand.getTheHand().get(i)+ " \n");
                }

                if(playerTwoHand.getTheHand().size() == 0) {
                    isGameOver = true;
                    break;
                }
            }

            boolean playerTwoStillPlaying = true;
            while (playerTwoStillPlaying && (playerTwoHand.getTheHand().size() !=0)){
                System.out.println("Player 2, what rank card do you want to check for (Ace, Two, Three, etc to King)?");


                //Get the player response for the rank
                String rank = scanner.next();
                //String suit = scanner.next();

                //Check the rank to see if it's in player2's hand
                if(playerOneHand.checkHandForCard(rank)) {
                    //If yes, then move all the cards with that rank from player1 to player2,
                    // reducing player2's cards and increasing player 1's cards


                    //Get the number of cards of the same rank and remove that number
                    int removedCards = playerOneHand.countCardsInHandOfRank(playerOneHand.getTheHand(), rank);
                    for(int i = 1; i <= removedCards; i++){
                        Card temp = playerOneHand.removeCardFromHand(rank);
                        if (temp == null) {
                        } else playerTwoHand.addCardToHand(temp);
                        playerOneHand.getTheHand().trimToSize();

                    }

                    //Show the player1 list of cards
                    System.out.println("Player 1, you have the following cards:");
                    for(int i = 0; i < playerOneHand.getTheHand().size(); i++){
                        System.out.print(playerOneHand.getTheHand().get(i)+ " \n");
                    }

                    System.out.println("Player 2, you have the following cards:");
                    for(int i = 0; i < playerTwoHand.getTheHand().size(); i++){
                        System.out.print(playerTwoHand.getTheHand().get(i)+ " \n");
                    }

                } else {
                    //If no, then respond "Go fish" and deal one card to player from the deck
                    System.out.print("Go Fish!\n");
                    playerTwoHand.addCardsToHand(cardDeck.deal(1));
                    playerTwoStillPlaying = false;
                }

                if(playerOneHand.getTheHand().size() == 0) {
                    isGameOver = true;
                    break;
                }
            }
            //Player1 can go again - ask player1 which rank they want to get
            //Player2 gets to play once player1 has to go fish
        }
        System.out.print("Player 1, you had "+ playerOneHand.getTheHand().size()+" cards left\n");
        System.out.print("Player 2, you had "+ playerTwoHand.getTheHand().size()+" cards left\n");
        System.out.print("Game over!");
    }
}
