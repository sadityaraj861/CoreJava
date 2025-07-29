package DateAndTimeApi;
//for using date and time using util package is an old method . ; Java seperatly defines DateAdTime API for this.
import java.util.*;
public class Datedemo {
    public static void main(String[] args){

        System.out.println("Time passed in milisecods from 1900 is "+System.currentTimeMillis());  // this gives mili seconds pass from 1 jan 1970.
        System.out.println("Years passed from 1 jan 1970 : "+System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);

       // Date class is totally based upon the CurrentTimeMillis().
        Date d = new Date();//inbuilt class , contais date and time.
        System.out.println(d);
        System.out.println("Time in millisSeconds "+d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay()); //Sunday is termed as 0 then ++
        System.out.println(d.getMonth());//jan is 0
    }
}
