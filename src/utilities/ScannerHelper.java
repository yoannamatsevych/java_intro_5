package utilities;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerHelper {

    static Scanner input = new Scanner(System.in);

    /*
    Create a method that asks user to enter a name and RETURN it
     */
    public static String getAName() {

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        return name;
    }
        /*
        Create a method that asks user to enter an age and RETURN it
         */

        public static int getAnAge(){

            System.out.println("Please enter your age:");
            int age = input.nextInt();
            input.nextLine();

            return age;

        }

    /*
    Create a method that asks user to enter an address and RETURN it
     */

    public static String getAnAddress(){

        System.out.println("Please enter your address:");
        String address = input.nextLine();

        return address;
    }
    /**
    Getting String from user
    */
    public static String getAString(){
        System.out.println("Please enter a String");
        return input.nextLine();
    }

    public static String getAFavColor(){
        System.out.println("Please enter your 4 favorite colors:");
        return input.nextLine();
    }

    public static int getAnNumber(){

        System.out.println("Please enter a number");
        int num = input.nextInt();
        input.nextLine();

        return num;

    }

}
