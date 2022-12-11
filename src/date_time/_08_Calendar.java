package date_time;

import java.util.Calendar;

public class _08_Calendar {

    public static void main(String[] args) {

        //Creating a Calendar instance
        Calendar calendar = Calendar.getInstance();

        //Getting current date and time with Calendar instance
        System.out.println(calendar.getTime()); // Fri Dec 09 17:03:32 CST 2022
    }

}
