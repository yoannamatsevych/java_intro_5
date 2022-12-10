package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestPermission {

    public static void main(String[] args) {
//
//        int age = ScannerHelper.getAnAge();
//
//        try{
//            if (Permission.isAgeValid(age)) System.out.println("You can get DL");
//        }catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("You are " + age + ".");
//        }

        int date = ScannerHelper.getAnNumber();

        try{
            System.out.println(Permission.getCheckInHours(date));
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            Date d = new Date();
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            System.out.println("Current day = " + dayFormat.format(d));
        }


    }
}
