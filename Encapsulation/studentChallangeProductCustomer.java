package Encapsulation;
import java.lang.*;
import java.util.*;

class customer{
    private  int custid ;
    private String name;
    private String address;
    private String phoneNo;



    public int getCustId(){
        return custid;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNo(){
        return phoneNo;
    }



    public void setCustid(int a){
        if(a>0)
            custid = a;
        else
            custid = -1;
    }
    public void setName(String b){
        name = b;
    }
    public void setAddress(String c){
        address = c;
    }
    public void setPhoneNo(String d){
            phoneNo = d;
    }


    public customer(){
        custid = -1;
        name = null;
        address = null;
        phoneNo = null;
    }
    public customer(int a,String b,String c,String d){
        setCustid(a);
        setName(b);
        setAddress(c);
        setPhoneNo(d);
    }

}
class product{
    private int itemNo;
    private String name;
    private  double price;
    private int quantity;



    public int getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int  getQuantity(){
        return quantity;
    }


    public void setName(String a){
        name = a;
    }
    public void setItemNo(int b){
       if(b>0)
             itemNo = b;
       else itemNo = -1;
    }
    public void setPrice(double c){
       if(c>0)
           price = c;
       else
           price = -1;
    }
    public void setQuantity(int d){
       if(d>0)
           quantity = d;
       else
           quantity = -1;
    }

    public product(int a,String b,double c, int d){
        setItemNo(a);
        setName(b);
        setPrice(c);
        setQuantity(d);
    }


}
public class studentChallangeProductCustomer {
    public static void main(String[] args) {

     //   product pr = new product();
        product pr = new product(108,"tshirt",169.5,2);

    //    customer c = new customer();
        customer c = new customer(1282,"ADITYA","BIHAR","9771379532");

        System.out.println("NAME: "+c.getName());
        System.out.println("ADDRESS: "+c.getAddress());
        System.out.println("PHONE NO : "+c.getPhoneNo());
        System.out.println("CUSTOMER ID : "+c.getCustId());

        System.out.println(" ");

        System.out.println("ITEM Name: "+pr.getName());
        System.out.println("ITEM NO: "+pr.getItemNo());
        System.out.println("PRICE: "+pr.getPrice());
        System.out.println("QUANTITY: "+pr.getQuantity());

    }
}
