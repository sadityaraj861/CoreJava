package Interface;

abstract class phone{
   public void call(){
       System.out.println("Phone is calling");
   }

   abstract public void sms();

}

interface camera{
    public void snap();
    public void record();
}
interface musicPlayer{
    public void play();
    public void pause();
    public void stop();
}

class SmartPhone extends phone implements camera,musicPlayer {
    public void call() {
        System.out.println("CALLING FROM SMARTPHONE");
    }

    public void sms() {
        System.out.println("SMS from SMARTPHONE");
    }

    public void snap() {
        System.out.println(" snap mode on IN CAMERA");
    }

    public void record() {
        System.out.println("RECORDING IS ON IN CAMERA");
    }

    public void play() {
        System.out.println("MUSIC ON IN MUSIC PLAYER");
    }

    public void pause() {
        System.out.println("music pause IN MUSIC PLAYER");
    }

    public void stop() {
        System.out.println("music stop IN MUSIC PLAYER");
    }
}

public class InterfaceMainExample {
    public static void main(String[] args) {
        phone p = new SmartPhone();  // REFERENCING PHONE SO ONLY METHOD AVAILABLE IN CLASS (phone) can only accessible through (p).
        camera c = new SmartPhone();// REFERENCING camera  SO ONLY METHOD AVAILABLE IN INTERFACE (camera) can only accessible through (c).
        musicPlayer mp = new SmartPhone();// REFERENCING PHONE SO ONLY METHOD AVAILABLE IN INTERFACE (musicPlayer) can only accessible through (mp).
        SmartPhone sp = new SmartPhone();

        p.call();
        p.sms();
        System.out.println(" ");
        c.record();
        c.snap();
        System.out.println(" ");
        mp.play();
        mp.pause();
        mp.stop();


    }
}
