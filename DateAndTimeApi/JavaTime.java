package DateAndTimeApi;

import java.time.*;

public class JavaTime {
    public static void main(String[] args) {

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt); //includes zone "Asia/calcutta"

        OffsetDateTime odt =OffsetDateTime.now();
        System.out.println(odt); // offset i.e +5:30 and date and time

        //Shows IMMUtability.
        OffsetDateTime odt2 = odt.withHour(5); //returns  in offsetDateTime , so need to initialize in other object
        System.out.println(odt2);
    }
}
