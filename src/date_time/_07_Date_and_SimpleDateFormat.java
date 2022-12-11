package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _07_Date_and_SimpleDateFormat {

    public static void main(String[] args) {

        //Creating a Date instance
        Date date = new Date();

        System.out.println(date); // current date - Fri Dec 09 16:55:35 CST 2022

        //Print the date in the format of MM/dd/yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf.format(date)); // 12/09/2022

        // Print date in the format of E hh:mm a
        sdf = new SimpleDateFormat("E hh:mm a");
        System.out.println(sdf.format(date)); // Fri 04:58 PM

        // More format examples
        System.out.println(new SimpleDateFormat("EEEE").format(date)); // Friday
        System.out.println(new SimpleDateFormat("yyyy").format(date)); // 2022
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(date)); // 04 o'clock PM, Central Standard Time
    }


}
