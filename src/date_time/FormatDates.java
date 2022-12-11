package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {

        System.out.println("=====Formatting date========");
        Date date = new Date();
        System.out.println(date); //Sun Dec 11 11:34:40 CST 2022 - EEE MMM dd hh:mm:ss z yyyy

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date)); // 12/11/2022

        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(new Date())); //11 o'clock AM, Central Standard Time



    }
}
