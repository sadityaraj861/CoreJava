package Thread;
import java.lang.Thread;

class myThreads1 extends Thread{
    public myThreads1(String name){
        super(name);
    }

    public void run(){
        int i = 100;
        while (true) {
            System.out.println(--i);
            try {
                sleep(1000);  // THIS THROW THE EXCEPTION SO , HANDLING HERE.  [ 1000milliseconds = 1 sec. ]
            }
            catch(Throwable e){
                System.out.println(e);
            }
        }
    }
}

public class SleepThread {
    public static void main(String[] args)
    {
        myThreads1 t = new myThreads1("ADITYA THREAD");
        t.start();
    }
}


