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
}
