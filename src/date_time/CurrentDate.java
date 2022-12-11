package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {


        System.out.println("======DATE CLASS=====");
        Date date = new Date();
        System.out.println(date);

        System.out.println("\n=======LOCAL DATE CLASS======");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2022-12-11 yyyy-MM-dd// MM because mm is used for minutes

        System.out.println(localDate.plusDays(7)); // 2022-12-18
        System.out.println(localDate.getMonth()); // December
        System.out.println(localDate.getMonthValue()); // 12
        System.out.println(localDate.getDayOfWeek()); // Sunday
        System.out.println(localDate.getDayOfMonth()); // 11
        System.out.println(localDate.getDayOfYear()); // 345


        System.out.println("=========LocalTime class========");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:19:32.905 hh:mm:ss:SSS
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));

        System.out.println("\n======LocalDateTime class=========");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
