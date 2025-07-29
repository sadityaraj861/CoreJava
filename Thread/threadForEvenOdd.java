package Thread;

import java.util.*;
import java.lang.*;


class thread1 extends Thread{  // FOR EVEN
    public void run (){
        for(int i = 1; i <21;i++){
            if(i%2==0) {
                System.out.println("EVEN NUMBER : "+i);
            }
        }
    }
}
class thread2 extends Thread{  // FOR ODD
    public void run(){
      for(int i = 1; i<21;i++) {
          if (i % 2 != 0) {
              System.out.println("ODD NUMBER "+i);
          }
      }
    }
}

public class threadForEvenOdd {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}



