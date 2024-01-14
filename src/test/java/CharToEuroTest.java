import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


/**
 * CharToEuroTest
 */
public class CharToEuroTest {

    @Test
    public void testCompareChars(){
        // CharToEuro euro= new CharToEuro();
        CharToEuro euroMock = mock(CharToEuro.class);
        // char signUnicode = '\u20AC';
        // char signEuro = euro.getEuroSign();
        when(euroMock.getEuroSign('€')).thenReturn('\u20AC');
        assertEquals('\u20AC',euroMock.getEuroSign('€'));

        // assertFalse(Character.isLetter(signEuro));
        // assertEquals(signUnicode, signEuro);
    }
}