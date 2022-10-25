package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("=======TASK 1========");

        String name = ScannerHelper.getAName();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length() - 3));
        if (name.toLowerCase().startsWith("a")) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");

        System.out.println("=======TASK 2========");

        String address = ScannerHelper.getAnAddress();
        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines"))System.out.println("You are welcome to join to \n" +
                "the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("========TASK 3=========");

        String favColor = ScannerHelper.getAFavColor();

        if (favColor.toLowerCase().contains("green") && favColor.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if (favColor.toLowerCase().contains("green"))
            System.out.println("Green is in the list");
        else if (favColor.toLowerCase().contains("red"))
            System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("========TASK 4========");

        String str = "    Java is FUN    ";
        str = str.trim().toLowerCase();

        System.out.println("The first word in the str is = " + str.substring(0, str.indexOf(" ")));
        System.out.println("The second word in the str is = " + str.substring(str.indexOf(" ") + 1,
                str.lastIndexOf(" ")));
        System.out.println("The thord word in the str is = " + str.substring(str.lastIndexOf(" ") + 1));



    }
}
