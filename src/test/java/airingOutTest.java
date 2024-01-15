
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

// Class Testing Mockitocase of th door
public class airingOutTest {

    @Test
public void testCheckWindowsAndDoor() {
    // Create a mocked Door object
    Door mockDoor = mock(Door.class);

    // Configure the mocked Door object to return true when isOpen is called
    when(mockDoor.isOpen()).thenReturn(true);

    // Create an airingOut object with the mocked Door object
    airingOut air = new airingOut(mockDoor);

    // Call the checkWindowsAndDoor method and check the result
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        air.checkWindowsAndDoor(false, false);
    });

    String expectedMessage = "Both windows cannot be closed";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
    }
}
