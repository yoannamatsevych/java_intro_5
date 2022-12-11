package date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class _05_Period {

    public static void main(String[] args) {
        //Creating 2 LocalDate instances with of() method
        LocalDate localDate1 = LocalDate.of(2020, Month.DECEMBER, 4);
        LocalDate localDate2 = LocalDate.of(2022, Month.DECEMBER, 9);

        System.out.println(localDate1); // 2020-12-04
        System.out.println(localDate2); // 2022-12-09

        //Find the year difference between above dates
        System.out.println(Period.between(localDate1, localDate2).getYears()); // 2


        //Find the day-week-month-year difference between above dates using ChronoUnit class
        System.out.println(ChronoUnit.DAYS.between(localDate1, localDate2)); // 735
        System.out.println(ChronoUnit.WEEKS.between(localDate1, localDate2)); // 105
        System.out.println(ChronoUnit.MONTHS.between(localDate1, localDate2)); // 24
        System.out.println(ChronoUnit.YEARS.between(localDate1, localDate2)); // 2
    }

}
