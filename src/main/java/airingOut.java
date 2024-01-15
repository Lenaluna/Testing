
// Throws Exception when the method checkWindowsAndDoor got wrong boolean.
public class airingOut {
    String closeDoor = "Slam the door";
    String openDoor = "Doesn't slam the door";
    Door door;

    public airingOut(Door door) {
        this.door = door;
    }

    public String checkWindowsAndDoor(boolean frontWindowOpen, boolean backWindowOpen) {
        if (frontWindowOpen == false && backWindowOpen == false) {
            throw new IllegalArgumentException("Both windows cannot be closed");
        }

        if (frontWindowOpen && backWindowOpen && door.isOpen()) {
            return closeDoor;
        } else {
            return openDoor;
        }
    }
}
