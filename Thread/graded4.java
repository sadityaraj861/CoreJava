package Thread;
class MyThread extends Thread {

   public  void run(){

       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}

public class graded4{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        // Show the initial state
        System.out.println("Initial State: " + myThread.getState());

        myThread.start();

        // Show the new state (usually RUNNABLE, but not guaranteed)
        System.out.println("New State: " + myThread.getState());

        // Wait for the thread to complete without try-catch
        while (myThread.isAlive()) {
            // Wait for the thread to terminate
        }

        // Show the terminated state
        System.out.println("Terminated State: " + myThread.getState());
    }
}

