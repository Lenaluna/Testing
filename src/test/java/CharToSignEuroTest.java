import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;


/**
 * CharToEuroTest
 */
public class CharToSignEuroTest {

    @Test
    public void testCompareChars(){
        CharToSignEuro euro= new CharToSignEuro();
        char signEuro = '€';
        char unicodeEuro = euro.getUnicodeEuro();
        assertFalse(Character.isLetter(signEuro));
        assertEquals(signEuro, unicodeEuro);
    }
}