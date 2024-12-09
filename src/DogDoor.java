import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private long TimeOut;

    public DogDoor(){
        this.open=false;
        this.TimeOut=0;
    }



    public void open( ){
        System.out.println("The dog door opens");
        this.open=true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run () {
                close();
                System.out.println("This is a delay task");
                timer.cancel();
            }
        },this.TimeOut);
    }

    public void close(){
        System.out.println("The dog door closes");
        this.open=false;
    }

    public boolean isOpen(){
        return open;
    }

    public void setTimeOut(long timeOut) {
        TimeOut = timeOut;
    }
}
