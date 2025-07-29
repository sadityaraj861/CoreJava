package Thread;
 import java.lang.Thread;

 class myThreads extends Thread{
     public myThreads(String name){
         super(name);
         setPriority(Thread.MIN_PRIORITY+9);
     }
     public void run(){}
 }

 public class MethodsThread {
     public static void main(String[] args) throws Exception
     {
         myThreads t = new myThreads(" ADITYA'S  THREAD 1");

         System.out.println("NAME: "+t.getName());
         System.out.println("PRIORITY: "+t.getPriority());
         t.start();
         System.out.println("STATE: "+t.getState());
         System.out.println("ALIVE OR NOT : "+t.isAlive());
     }
 }


