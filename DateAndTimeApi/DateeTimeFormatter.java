package DateAndTimeApi;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.*;
import java.time.temporal.ChronoField;

public class DateeTimeFormatter {
    public static void main(String[] args) {

        ZonedDateTime ldt = ZonedDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy ; hh:mm:ss  ; z ; Z");

        System.err.println(df.format(ldt)); // Correctly passing `ldt` to the formatter


        //CHRONO FIELD STARTS
        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt.getDayOfMonth());
    }
}
