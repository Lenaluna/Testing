
// Class that configures the front and back windows and a door in between
// to open and close. If everything is open the door variable will be "closeDoor"
public class airingOut {
    String closeDoor = "Slam the door";
    String openDoor = "Doesn't slam the door";
    Door door;

    public airingOut(Door door) {
        this.door = door;
    }

    public String checkWindowsAndDoor(boolean frontWindowOpen, boolean backWindowOpen) {
        if (frontWindowOpen && backWindowOpen && door.isOpen()) {
            return closeDoor;
        } else {
            return openDoor;
        }
    }
}
