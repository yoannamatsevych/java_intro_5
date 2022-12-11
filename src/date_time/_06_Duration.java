package date_time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _06_Duration {

    public static void main(String[] args) {

        //Creating 2 LocalTime instances with of() method
        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 30);

        System.out.println(localTime1); // 12:44:15
        System.out.println(localTime2); // 13:45:30

        //Find the second difference between above times
        System.out.println(Duration.between(localTime1, localTime2).getSeconds()); // 3675

        //Find the second-minute-hour difference between above dates using ChronoUnit class
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2)); // 3675
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2)); // 61
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2)); // 1
    }


}
