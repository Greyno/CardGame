package reynoldstitko.gillian;

import java.util.ArrayList;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class Hand {

    private ArrayList<Card> theHand = new ArrayList<Card>();
    int cardCount = 0;

//    public boolean checkHandForCard(String rank, String suit) {
//        for (int i = 0; i < theHand.size(); i++) {
//            if (theHand.get(i).getRank().equalsIgnoreCase(rank) &&
//                    theHand.get(i).getSuit().equalsIgnoreCase(suit)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean checkHandForCard(String rank) {
        for (int i = 0; i < theHand.size(); i++) {
            if (theHand.get(i).getRank().equalsIgnoreCase(rank)) {
                return true;
            }
        }
        return false;
    }

    public Card removeCardFromHand(String rank){
        for(int i = 0; i < theHand.size(); i++){
            if(theHand.get(i).getRank().equalsIgnoreCase(rank)){
                Card temp = theHand.get(i);
                theHand.remove(i);
                return temp;
            }
        }
        return null;
    }

    public void addCardsToHand(ArrayList<Card> cardsToAdd){

        theHand.addAll(cardsToAdd);
        return;
    }

    public void addCardToHand(Card cardToAdd){
        theHand.add(cardToAdd);
        return;
    }


    public ArrayList<Card> getTheHand() {

        return theHand;
    }

    public int countCardsInHandOfRank(ArrayList<Card> cards, String rank){
        for(int i = 0; i <cards.size(); i++){

            if(cards.get(i).getRank().equalsIgnoreCase(rank)){
             cardCount = cardCount + 1;
            }
        }
        return cardCount;
    }
}
