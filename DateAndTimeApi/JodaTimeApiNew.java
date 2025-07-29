package DateAndTimeApi;
import java.sql.SQLOutput;
import java.util.*;
import java.time.*;

public class JodaTimeApiNew {
    public static void main(String[] args) {

        //OLD JAVA.UTIL
        Date d = new Date();
        d.setHours(2);
        System.out.println(d);

        //JAVA.Time
        LocalDate dt = LocalDate.now(Clock.systemDefaultZone());//takes time form my pc.
  //    LocalDate dt1 = LocalDate.ofEpochDay(1);//Epochday - 1 jan 1970 Starting date.
        System.out.println(dt); //Only date
        System.out.println(dt.isLeapYear());
    //  System.out.println(dt1); // one day after EPOCH day. 2 jan 1970

        //more methods
        System.out.println(dt.plusMonths(1));
        System.out.println(dt.lengthOfMonth());//length og month
        System.out.println(dt.withMonth(7)); // change month


        LocalTime lt =LocalTime.now();
        System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());
        System.out.println(lt.minusHours(3)); //Seconds.Nanoseconds.
    }
}
