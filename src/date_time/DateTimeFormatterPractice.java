package date_time;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyy"))); //12/11/2022
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("E HH:mm"))); //Sun 01:27 PM // HH - 24 hours day

    }
}
