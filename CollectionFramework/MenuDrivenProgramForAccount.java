package CollectionFramework;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

class Account implements Serializable{
    Long AccountNo;
    String name;
    Long balance;

    public Account(){
        this.AccountNo=null;
        this.name=null;
        this.balance=null;
    }

    public Account(Long Ano,String name,Long balance){
        this.AccountNo=Ano;
        this.name=name;
        this.balance=balance;
    }

    public String toString(){
        return "Account no:"+AccountNo+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}


public class MenuDrivenProgramForAccount {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hm1 = new HashMap<>(); // for printing options.

        Account acc=null;
        HashMap<Long,Account>  hm2= new HashMap<>();

        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\Aditya raj\\Documents\\inputStreamOutputStream files\\MenuDrivenProgram for Account.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int count=ois.readInt();
            for(int i=0;i<count;i++){

                acc=(Account)ois.readObject(); //type casted into object of Account.
                System.out.println(acc);
                hm2.put(acc.AccountNo,acc);
            }
            fis.close();
            ois.close();

        }catch(Exception e){

        }

        FileOutputStream fos=new FileOutputStream("C:\\Users\\Aditya raj\\Documents\\inputStreamOutputStream files\\MenuDrivenProgram for Account.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);





        hm1.put(1,"Create Account");
        hm1.put(2,"Delete Account");
        hm1.put(3,"View Account");
        hm1.put(4,"View all Accounts");
        hm1.put(5,"Save Accounts");
        hm1.put(6,"Exit");

        //we can also do this above part by simple using printfuntion.

        int choice;

      do {
          hm1.forEach((k,v)-> System.out.println(k+". "+v));
          System.out.println("Choose any Option !");
          choice =sc.nextInt();

          sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


          switch (choice) {
              case 1:
                  System.out.println("Enter account number:");
                  Long ac1 = sc.nextLong();
                  sc.nextLine();
                  System.out.println("Enter name:");
                  String name = sc.nextLine();
                  System.out.println("Enter Balance");
                  Long bal = sc.nextLong();

                  Account a1 = new Account(ac1, name, bal);
                  hm2.put(ac1, a1); //account number, object of Account class.
                  System.out.println("Account Added Successfully");

                  break;

              case 2:
                  System.out.println("Enter Account no to delete:");
                  Long ToDeleteAccountNo = sc.nextLong();
                  hm2.remove(ToDeleteAccountNo);
                  break;

              case 3:
                  System.out.println("Enter Account number to view:");
                  Long ToViewAccountNo = sc.nextLong();
                  acc = hm2.get(ToViewAccountNo);
                  System.out.println(acc);
                  break;

              case 4:
                  System.out.println("All Accounts!");
                  for (Account a : hm2.values()) {
                      System.out.println(a);
                  }
                  break;

              case 5:

              case 6:
                  oos.writeInt(hm2.size());
                  for (Account a : hm2.values())
                      oos.writeObject(a);
          }

      }while (choice!=6);

        oos.flush();
        oos.close();
        fos.close();
    }
}
