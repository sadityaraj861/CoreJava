package Thread;
class Atm{

    synchronized public void checkBalance(String name){
        System.out.print(name+" CHECKING HIS CURRENT ");

        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("BALANCE ");
    }
    synchronized public void withdraw(String name,Double amount){
        System.out.println("THE AMOUNT OF "+amount+" IS WITHDRAW BY "+name);
    }
}
class Costomer extends Thread{

    Atm atm;
    String name;
    double amount;
    public Costomer(String name,Atm user,Double amount){
        this.name = name;
        atm = user;
        this.amount = amount;
    }
    synchronized public void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }
    public void run(){
        useAtm();
    }
}
public class SynchronizationstudentChallange {
    public static void main(String[] args) {
        Atm user = new Atm();
        Costomer c1 = new Costomer("Aditya",user,1000.345);
        Costomer c2 = new Costomer("Vikash",user,698.32);
        c1.start();

        c2.start();



    }
}
