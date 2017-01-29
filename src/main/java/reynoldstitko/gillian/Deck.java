package reynoldstitko.gillian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(){
        //-------Diamonds
        Card aceDiamonds = new Card("Ace", "Diamonds");
        Card twoDiamonds = new Card("Two", "Diamonds");
        Card threeDiamonds = new Card("Three", "Diamonds");
        Card fourDiamonds = new Card("Four", "Diamonds");
        Card fiveDiamonds = new Card("Five", "Diamonds");
        Card sixDiamonds = new Card("Six", "Diamonds");
        Card sevenDiamonds = new Card("Seven", "Diamonds");
        Card eightDiamonds = new Card("Eight", "Diamonds");
        Card nineDiamonds = new Card("Nine", "Diamonds");
        Card tenDiamonds = new Card("Ten", "Diamonds");
        Card jackDiamonds = new Card("Jack", "Diamonds");
        Card queenDiamonds = new Card("Queen", "Diamonds");
        Card kingDiamonds = new Card("King", "Diamonds");

        cards.add(aceDiamonds);
        cards.add(twoDiamonds);
        cards.add(threeDiamonds);
        cards.add(fourDiamonds);
        cards.add(fiveDiamonds);
        cards.add(sixDiamonds);
        cards.add(sevenDiamonds);
        cards.add(eightDiamonds);
        cards.add(nineDiamonds);
        cards.add(tenDiamonds);
        cards.add(jackDiamonds);
        cards.add(queenDiamonds);
        cards.add(kingDiamonds);

        //-------Spades
        Card aceSpades = new Card("Ace", "Spades");
        Card twoSpades = new Card("Two", "Spades");
        Card threeSpades = new Card("Three", "Spades");
        Card fourSpades = new Card("Four", "Spades");
        Card fiveSpades = new Card("Five", "Spades");
        Card sixSpades = new Card("Six", "Spades");
        Card sevenSpades = new Card("Seven", "Spades");
        Card eightSpades = new Card("Eight", "Spades");
        Card nineSpades = new Card("Nine", "Spades");
        Card tenSpades = new Card("Ten", "Spades");
        Card jackSpades = new Card("Jack", "Spades");
        Card queenSpades = new Card("Queen", "Spades");
        Card kingSpades = new Card("King", "Spades");

        cards.add(aceSpades);
        cards.add(twoSpades);
        cards.add(threeSpades);
        cards.add(fourSpades);
        cards.add(fiveSpades);
        cards.add(sixSpades);
        cards.add(sevenSpades);
        cards.add(eightSpades);
        cards.add(nineSpades);
        cards.add(tenSpades);
        cards.add(jackSpades);
        cards.add(queenSpades);
        cards.add(kingSpades);

        //-----Clubs
        Card aceClubs = new Card("Ace", "Clubs");
        Card twoClubs = new Card("Two", "Clubs");
        Card threeClubs = new Card("Three", "Clubs");
        Card fourClubs = new Card("Four", "Clubs");
        Card fiveClubs = new Card("Five", "Clubs");
        Card sixClubs = new Card("Six", "Clubs");
        Card sevenClubs = new Card("Seven", "Clubs");
        Card eightClubs = new Card("Eight", "Clubs");
        Card nineClubs = new Card("Nine", "Clubs");
        Card tenClubs = new Card("Ten", "Clubs");
        Card jackClubs = new Card("Jack", "Clubs");
        Card queenClubs = new Card("Queen", "Clubs");
        Card kingClubs = new Card("King", "Clubs");

        cards.add(aceClubs);
        cards.add(twoClubs);
        cards.add(threeClubs);
        cards.add(fourClubs);
        cards.add(fiveClubs);
        cards.add(sixClubs);
        cards.add(sevenClubs);
        cards.add(eightClubs);
        cards.add(nineClubs);
        cards.add(tenClubs);
        cards.add(jackClubs);
        cards.add(queenClubs);
        cards.add(kingClubs);

        //---Hearts
        Card aceHearts = new Card("Ace", "Hearts");
        Card twoHearts = new Card("Two", "Hearts");
        Card threeHearts = new Card("Three", "Hearts");
        Card fourHearts = new Card("Four", "Hearts");
        Card fiveHearts = new Card("Five", "Hearts");
        Card sixHearts = new Card("Six", "Hearts");
        Card sevenHearts = new Card("Seven", "Hearts");
        Card eightHearts = new Card("Eight", "Hearts");
        Card nineHearts = new Card("Nine", "Hearts");
        Card tenHearts = new Card("Ten", "Hearts");
        Card jackHearts = new Card("Jack", "Hearts");
        Card queenHearts = new Card("Queen", "Hearts");
        Card kingHearts = new Card("King", "Hearts");

        cards.add(aceHearts);
        cards.add(twoHearts);
        cards.add(threeHearts);
        cards.add(fourHearts);
        cards.add(fiveHearts);
        cards.add(sixHearts);
        cards.add(sevenHearts);
        cards.add(eightHearts);
        cards.add(nineHearts);
        cards.add(tenHearts);
        cards.add(jackHearts);
        cards.add(queenHearts);
        cards.add(kingHearts);
    }

    public void shuffle(){
        //Look at Collections.shuffle
        Collections.shuffle(cards); //Using the built-in Collections Class .shuffle() method, so no need to unit test
    }

    public ArrayList<Card> deal(int numOfCards){
        ArrayList<Card> temp = new ArrayList<Card>();

        for(int i = 0; i< numOfCards; i++){
            temp.add(cards.get(i));
        }

        for(int i = 0; i < numOfCards; i++){
            cards.remove(0);
        }

        return temp;

    }
}
