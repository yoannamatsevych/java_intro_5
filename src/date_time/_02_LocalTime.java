package date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _02_LocalTime {

    public static void main(String[] args) {

        //Creating a LocalTime instance with now() method
        LocalTime localTime1 = LocalTime.now();

        System.out.println(localTime1); // current time

        //Creating a LocalTime instance with of() method
        LocalTime localTime2 = LocalTime.of(13, 45);

        System.out.println(localTime2); // 13:45

        //Adding n minutes to the current time
        LocalTime localTime3 = LocalTime.now().plusMinutes(25);

        System.out.println(localTime3); // current time + 25 minutes

        //Subtracting n hours from the current time using minus() method and ChronoUnit enumeration
        LocalTime localTime4 = LocalTime.now().minus(3, ChronoUnit.HOURS);

        System.out.println(localTime4); // current time - 3 hours

        //Get hour, minute, second of the LocalTime
        LocalTime localTime5 = LocalTime.parse("09:35:23");
        System.out.println(localTime5.getHour()); // 9
        System.out.println(localTime5.getMinute()); // 35
        System.out.println(localTime5.getSecond()); // 23

        System.out.println(localTime5.isAfter(LocalTime.now()));
        System.out.println(localTime5.isBefore(LocalTime.now()));

        //LocalTime final static instance variables
        System.out.println(LocalTime.MAX); // 23:59:59.999999999
        System.out.println(LocalTime.MIN); // 00:00
        System.out.println(LocalTime.MIDNIGHT); // 00:00
        System.out.println(LocalTime.NOON); // 12:00
    }

}
