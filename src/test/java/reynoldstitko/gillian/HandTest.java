package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class HandTest {

    Hand theHand;

    @Before
    public void setUp(){
        theHand = new Hand();
    }

    @Test
    public void addCardsToHandTest(){
        ArrayList<Card> temp = new ArrayList<>();
        temp.add(new Card("Two"));
        temp.add(new Card("Three"));
        theHand.addCardsToHand(temp);
        int expected = 2;
        int actual = theHand.getTheHand().size();
        assertEquals("The hand should return two cards", expected, actual);
    }

    @Test
    public void addCardToHandTest(){
        Card card = new Card("Two");
        theHand.addCardToHand(card);
        assertTrue("Expect a true", theHand.checkHandForCard("Two"));
    }

    @Test
    public void removeCardFromHandTest(){
        ArrayList<Card> temp = new ArrayList<>();
        temp.add(new Card("Two"));
        theHand.addCardsToHand(temp);
        String expected = new Card("Two").toString();
        String actual = theHand.removeCardFromHand("Two").toString();
        assertEquals("Removing two of diamonds", expected, actual);

    }

    @Test
    public void checkCardForHandTest(){
        ArrayList<Card> temp = new ArrayList<>();
        temp.add(new Card("Three"));
        theHand.addCardsToHand(temp);
        assertTrue("Expect a true", theHand.checkHandForCard("Three"));
    }

    @Test
    public void countCardsInHandOfRankTest(){
        ArrayList<Card> temp = new ArrayList<>(); //create a card array
        temp.add(new Card("Three")); //Add cards to the array
        temp.add(new Card("Two"));
        temp.add(new Card("Three"));
        theHand.addCardsToHand(temp); //add cards to a hand
        int expected = 2;
        int actual = theHand.countCardsInHandOfRank(temp, "Three");
        assertEquals("I expect to get 2 cards with a Three rank", expected, actual);
    }

    @Test
    public  void sumRankValuesTest(){
        ArrayList<Card> card = new ArrayList<>();
        card.add(new Card("Two", "Hearts"));
        card.add(new Card("King", "Spaced"));
        theHand.addCardsToHand(card);
        int expected = 15;
        int actual = theHand.sumRankValues(card);
        assertEquals("I expect a sum of 15", expected, actual);
    }


}
