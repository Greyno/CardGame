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
        temp.add(new Card("Two", "Diamonds"));
        temp.add(new Card("Three", "Hearts"));
        theHand.addCardsToHand(temp);
        int expected = 2;
        int actual = theHand.getTheHand().size();
        assertEquals("The hand should return two cards", expected, actual);
    }

    @Test
    public void removeCardFromHandTest(){
        ArrayList<Card> temp = new ArrayList<>();
        temp.add(new Card("Two", "Diamonds"));
        theHand.addCardsToHand(temp);
        String expected = new Card("Two", "Diamonds").toString();
        String actual = theHand.removeCardFromHand("Two", "Diamonds").toString();
        assertEquals("Removing two of diamonds", expected, actual);

    }

    @Test
    public void checkCardForHandTest(){
        ArrayList<Card> temp = new ArrayList<>();
        temp.add(new Card("Three", "Clubs"));
        theHand.addCardsToHand(temp);
        assertTrue("Expect a true", theHand.checkHandForCard("Three", "Clubs"));
    }
}
