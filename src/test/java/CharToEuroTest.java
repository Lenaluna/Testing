import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        assertFalse(Character.isLetter(signEuro));
        assertEquals(signEuro, signUnicode);
    }
}