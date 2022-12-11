package date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class _01_LocalDate {
    public static void main(String[] args) {

        //Creating a LocalDate instance with now() method
        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1); // current date in the format of yyyy-MM-dd

        //Creating a LocalDate instance with of() method
        LocalDate localDate2 = LocalDate.of(2020, Month.APRIL, 4);

        System.out.println(localDate2); // 2020-04-04

        //Adding n days to the current date
        LocalDate localDate3 = LocalDate.now().plusDays(5);

        System.out.println(localDate3); // current date + 5 days

        //Subtracting n years from the current date using minus() method and ChronoUnit enumeration
        LocalDate localDate4 = LocalDate.now().minus(2, ChronoUnit.YEARS);

        System.out.println(localDate4); // current date - 2 years

        //Get day, month and year of the LocalDate
        LocalDate localDate5 = LocalDate.parse("2000-03-15");
        System.out.println(localDate5.getDayOfWeek()); // WEDNESDAY
        System.out.println(localDate5.getDayOfMonth()); // 15
        System.out.println(localDate5.getDayOfYear()); // 75

        System.out.println(localDate5.getMonth()); // MARCH
        System.out.println(localDate5.getMonthValue()); // 3

        System.out.println(localDate5.getYear()); // 2000
        System.out.println(localDate5.isLeapYear()); // true
        System.out.println(localDate5.isBefore(LocalDate.now())); // true
        System.out.println(localDate5.isAfter(LocalDate.now())); // false
        System.out.println(localDate5.isEqual(LocalDate.now())); // false
    }
}


