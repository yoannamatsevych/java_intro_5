package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _09_DateTimeFormatter {

    public static void main(String[] args) {
        //Creating a LocalDateTime instance with now() method
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime); // 2022-12-09T17:15:40.519

        //Format examples
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); // 2022-12-09
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); // 12/09/2022
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss"))); // 12/09/2022 05:15:40
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("E hh:mm a"))); // Fri 05:16 PM
    }

}
