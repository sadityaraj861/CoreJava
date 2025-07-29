package Thread;
class myThrea extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println("hello");
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        myThrea MT = new myThrea();
        MT.start();  // calls and runs run().

        for(int i=1;i<6;i++){
            System.out.println("world");
        }
    }
}
