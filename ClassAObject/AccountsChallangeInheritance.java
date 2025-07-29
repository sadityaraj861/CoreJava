package ClassAObject;
import java.util.*;

class account{
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String d_o_b;
    private double balance;

    public String getName(){
        return name;
    }

    public String getAccountNo(){
        return accountNo;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public String getD_o_b(){
        return d_o_b;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double b){
        this.balance = b;
    }

    public void close(){
        System.out.println("YOUR ACCOUNT IS CLOSED SUCCESSFULLY ");
    }
    public account(){
        name=null;
        accountNo=null;
        address=null;
        phoneNo=null;
        d_o_b=null;
        balance=0;
    }

    public account(String nam,String accNo,String addres,String phoneN,String dob,double b){

        name = nam;
        accountNo = accNo;
        address = addres;
        phoneNo = phoneN;
        d_o_b = dob;
        balance=b;

    }
}

class savingsAccount extends account{
    public double deposite(double d){

         return getBalance()+d;
    }
    public double withDraw(double w){
        return getBalance()-w;
    }
    public void fixedDeposite(){
        System.out.println("GIVEN AMOUNT IS  ADDED IN FIXED DEPOSITE.");
    }
    public void  liquidate(){
        System.out.println("GIVEN AMOUNT IS LIQUIDATE.");
    }
}

class loanAccount extends account{
    public double payEmi(double emi){
        return(getBalance()-emi);

    }
    public double topUpLoan(double loan){
        return (getBalance()+loan);
    }
    public void rePayment(double r){
        System.out.println("REPAYMENT OF AMOUNT "+r+"IS DONE SUCCESSFULLY");
    }

}


public class AccountsChallangeInheritance {
    public static void main(String[] args) {
        account a1 = new account("Aditya","56460100004889","patna,bihar","9771379532","30April,2004",9876);
        savingsAccount a2 = new savingsAccount();
        loanAccount a3 = new loanAccount();

        System.out.println("ACCOUNT HOLDER NAME : "+a1.getName());
        System.out.println("ACCOUNT NO : "+a1.getAccountNo());
        System.out.println("ADDRESS : "+a1.getAddress());
        System.out.println("PHONE NO : "+a1.getPhoneNo());
        System.out.println("DATE OF BIRTH : "+a1.getD_o_b());
        System.out.println("ACCOUNT BALANCE : "+a1.getBalance());

        System.out.println("new balance after deposition of 234 : "+(a2.deposite(234)+ a1.getBalance()));
        System.out.println("new balance after withdraw of 234 : "+(a1.getBalance()-(a2.withDraw(234))));  // some error in this line.



    }
}
