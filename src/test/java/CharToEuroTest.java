import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.CharToEuro;

/**
 * CharToEuroTest
 */
public class CharToEuroTest {

    @Test
    public void compare(){
        CharToEuro euro= new CharToEuro();
        char signUnicode = '€';
        char signEuro = euro.getEuroSign();
        // assertTrue(Character.isLetter(signUnicode));
        assertEquals(signEuro, signUnicode);
        // assertNotNull(euro);
    }
}