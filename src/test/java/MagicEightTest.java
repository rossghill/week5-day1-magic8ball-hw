import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicEightTest {

    MagicEight magicEight;

    @Before
    public void before(){
        magicEight = new MagicEight();
    }

    @Test
    public void hasPhrase() {
        assertEquals("REPLY HAZY, TRY AGAIN", MagicEight.shakeBall() );
    }

    @Test
    public void addPhrase() {
        magicEight.addPhrase("CONCENTRATE AND ASK AGAIN");
        assertEquals(1, magicEight.getPhraseCount());
    }

    @Test
    public void hasLengthOfThree() {
        magicEight.addPhrase("REPLY HAZY, TRY AGAIN");
        magicEight.addPhrase("DON'T COUNT ON IT");
        magicEight.addPhrase("SIGNS POINT TO YES");
        assertEquals(3, magicEight.getPhraseCount());
    }

    @Test
    public void givesRandomPhrase() {
        assertEquals(1, magicEight.getRandomPhrase());
    }
}
