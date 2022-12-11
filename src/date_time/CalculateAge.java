package date_time;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {

        /*
        Ask user to enter their age find their  year of birth
         */

        int age = ScannerHelper.getAnAge();

        System.out.println((LocalDate.now().getYear() - age));
        System.out.println(LocalDate.now().minusYears(age).getYear());
        System.out.println(LocalDate.now().minus(age, ChronoUnit.YEARS).getYear());

        System.out.println("Year of birth " + (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - age));

        // Ask user to ask year of birth
        // calculate age

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter date of the year:");
        int dateOfYear = scanner.nextInt();
        System.out.println(LocalDate.now().getYear() - dateOfYear);

    }
}
