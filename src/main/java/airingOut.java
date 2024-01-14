//A class that checks the conditions for ventilation.
// If all windows and one door are open, a draft is created and the door slams shut.
public class airingOut {

    //
    String slamDoor = "Slam the door";
    String doorStaysOpen = "Doesn't slam the door";


public airingOut(){

}

//
public String checkWindowsAndDoor(boolean frontWindowOpen, boolean backWindowOpen, boolean inDoorOpen) {
    if (frontWindowOpen && backWindowOpen && inDoorOpen) {
        return slamDoor;
    }
    else {
        return doorStaysOpen;
    }
}
}
