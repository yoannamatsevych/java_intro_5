package regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}"); // that can have what is inside [],
        // and what is inside in {} is length what have to be for String
        // ((pattern.pattern(), "Apple"));
        Pattern pattern1 = Pattern.compile("apple");

        System.out.println(pattern); // returns pattern
        System.out.println(pattern.pattern()); // return pattern as a String
        System.out.println(pattern.toString()); // return pattern as a String

        System.out.println(Pattern.matches(pattern.pattern(), "Apple Hello")); // false
        System.out.println(Pattern.matches(pattern1.pattern(), "Apple".toLowerCase())); // true

        String str = "I go to school at TechGlobal and I love it";

        String[] arr = str.split(" [ a-z0-9]{5,10}");

        System.out.println(Arrays.toString(arr));


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Username:");
        String username = input.next();
        Pattern pattern3 = Pattern.compile( "[a-zA-Z0-9]{5,10}");

        if (Pattern.matches(pattern3.pattern(), username)) System.out.println("Valid username");
        else System.out.println("Error! \n" +
                "Username must be 5 to 10 characters long and can only contain \n" +
                "letters and numbers");

        if (username.matches("[a-zA-Z0-9]{5,10}")) System.out.println("Valid username");
        else System.out.println("Error! \n" +
                "Username must be 5 to 10 characters long and can only contain \n" +
                "letters and numbers");


    }
}
