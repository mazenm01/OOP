

public class Remote {
    private DogDoor door;
    private long Duration;

    public Remote(DogDoor door ) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }


    public void setDuration(long time){
        this.Duration=time;
    }

    public long getDuration() {
        return Duration;
    }



}

