import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class airingOutTest {

    // Tetsing the conditions of the airingOut object and the mockAir object.
@Test
public void testCheckWindowsAndDoor(){
airingOut mockAir = mock(airingOut.class);
when(mockAir.checkWindowsAndDoor(true, false, true)).thenReturn(mockAir.doorNotLoud);
assertEquals(mockAir.checkWindowsAndDoor(true,false,true), mockAir.doorNotLoud);
}
}