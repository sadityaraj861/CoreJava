package DateAndTimeApi;
import java.util.*;
public class CalanderClasss {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();///inbuild class

        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID()); //Asia/calcutta
        System.out.println(tz.getRawOffset());
    }
}
