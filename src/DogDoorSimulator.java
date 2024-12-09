public class DogDoorSimulator {
    public static void main(String[] args) {


        DogDoor door=new DogDoor();
        door.setTimeOut(8000);
        Remote remote=new Remote(door);
        BarkRecognizer Recognizer = new BarkRecognizer(door);

        System.out.println(remote.getDuration());
        System.out.println("\n Fido barks to go outside");
        Recognizer.recognize("Woof" );
        System.out.println("\n Fido has gone outside");
        System.out.println("\n Fido's all done");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){ }
            System.out.println("...but he's stuck outside!");

            System.out.println("\nFido starts barking...");
            Recognizer.recognize("Woof");

            System.out.println("\nFido's back inside...");

    }
}
