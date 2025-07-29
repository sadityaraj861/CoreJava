package Thread;
class mydata{
    synchronized public void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}

class Thread1 extends Thread{
    mydata d;
    public Thread1(mydata d){
        this.d = d;
    }
    public void run(){
        d.display("HELLO WORLD"+" ");
    }
}

class Thread2 extends Thread{
    mydata d;
    public Thread2(mydata d){
        this.d = d;
    }
    public void run(){
        d.display("WELCOME ALL");
    }
}
public class SynchronisedThread {
    public static void main(String[] args) {
        mydata data = new mydata();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);

        t1.start();
        t2.start();
    }
}

