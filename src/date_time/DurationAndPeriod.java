package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {

    public static void main(String[] args) {
        /*
        How many days past since you were born
        currentDate - dateOfBirth

        How many years past
        How many month past
        How many week past

         */

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1996, Month.JUNE, 22);

        System.out.println(today);
        System.out.println(dateOfBirth);

        System.out.println(Period.between(dateOfBirth, today).getYears()); //26
        System.out.println(Period.between(dateOfBirth, today).getMonths()); // 5
        System.out.println(Period.between(dateOfBirth, today).getDays()); // 19


        //Using ChronoUnit
        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today));


        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds()/60);

        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));//1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));//61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));//3690

    }

}
