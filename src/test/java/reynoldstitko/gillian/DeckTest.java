package reynoldstitko.gillian;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class DeckTest {

    Deck theDeck;

    @Before
    public void setUp(){
        theDeck = new Deck();
    }

    @Test
    public void dealTest(){
        int expected = 3;
        ArrayList<Card> testHand = theDeck.deal(3);
        int actual = testHand.size();
        assertEquals("I expect the dealth hand to be 3", expected, actual);
    }

}
