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

        cardDeck.shuffle();
        playerOneHand.addCardsToHand(cardDeck.deal(7));
        playerTwoHand.addCardsToHand(cardDeck.deal(7));

        boolean isPlayerOneEmpty = false;
        boolean isPlayerTwoEmpty = false;

        while(isPlayerOneEmpty == false && isPlayerTwoEmpty == false){
            System.out.print("What card do you want to check for?\n");
            String rank = scanner.next();
            String suit = scanner.next();

        }

    }
}
