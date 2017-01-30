package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class CardTest {
    Card card;

    @Before
    public void setUp(){
        card = new Card("Four", "Clubs");
    }

    @Test
    public void getRankValueTest(){
        int expected = 4;
        int actual = card.getRankValue();
        assertEquals("I expect to return a 4", expected, actual);
    }

}
