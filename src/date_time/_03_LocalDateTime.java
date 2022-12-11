package date_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class _03_LocalDateTime {

    public static void main(String[] args) {

        //Creating a LocalDateTime instance with now() method
        LocalDateTime localDateTime1 = LocalDateTime.now();

        System.out.println(localDateTime1); // current date and time

        //Creating a LocalDateTime instance with of() method
        LocalDateTime localDateTime2 = LocalDateTime.of(2000, Month.APRIL, 4, 15, 45, 23);

        System.out.println(localDateTime2); // 2000-04-04T15:45:23

        //Adding n hours to the current date-time
        LocalDateTime localDateTime3 = LocalDateTime.now().plusHours(6);

        System.out.println(localDateTime3); // current date and time + 6 hours

        //Subtracting n months from the current date-time using minus() method and ChronoUnit enumeration
        LocalDateTime localDateTime4 = LocalDateTime.now().minus(5, ChronoUnit.MONTHS);

        System.out.println(localDateTime4); // current date and time - 5 months

        //Get year, month, day, hour, minute, second of the LocalDateTime
        LocalDateTime localDateTime5 = LocalDateTime.parse("2000-04-04T06:30:45.001");
        System.out.println(localDateTime5.getYear()); // 2000
        System.out.println(localDateTime5.getMonth()); // APRIL
        System.out.println(localDateTime5.getMonthValue()); // 4
        System.out.println(localDateTime5.getDayOfWeek()); // TUESDAY
        System.out.println(localDateTime5.getDayOfMonth()); // 4
        System.out.println(localDateTime5.getDayOfYear()); // 95
        System.out.println(localDateTime5.getHour()); // 6
        System.out.println(localDateTime5.getMinute()); // 30
        System.out.println(localDateTime5.getSecond()); // 45
    }

}
