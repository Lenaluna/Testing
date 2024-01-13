import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/**
 * CharToEuroTest
 */
public class CharToEuroTest {

    @Test
    public void testCompareChars(){
        CharToEuro euro= new CharToEuro();
        char signUnicode = '€';
        char signEuro = euro.getEuroSign();
        // assertTrue(Character.isLetter(signUnicode));
        assertEquals(signEuro, signUnicode);
        // assertNotNull(euro);
    }
}