package Thread;
class myThread extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println("hello");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        myThread MT = new myThread(); //object of interface created.
        Thread t = new Thread(MT);   //THREAD created and attached with object of  interface created.
        t.start();  // calls and runs run().

        for(int i=1;i<6;i++){
            System.out.println("world");
        }
    }
}
