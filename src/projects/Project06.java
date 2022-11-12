package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("==========TASK-1=========");

        String[] arr = {"foo  ", "", "  ", "foo   bar", "java is     fun", " ruby "};
        System.out.println("1 solution \n" + countMultipleWords(arr));
        System.out.println("2 solution \n" + countMultipleWords2(arr));

        System.out.println("\n============TASK-2===========");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));
        numbers = new ArrayList<>(Arrays.asList(7, -4, 6, 7, -10, -78, 0, 65));
        System.out.println(removeNegatives(numbers));

        System.out.println("\n===========TASK-3===========");
        System.out.println("=======1 solution=======\n");
        System.out.println(validatePassword("abcd"));
        System.out.println(validatePassword("abcd1234"));
        System.out.println(validatePassword("Abcd1234"));
        System.out.println(validatePassword("Abcd1234!"));

        System.out.println("\n=========2 solution========");
        System.out.println(validatePassword1("abcd"));
        System.out.println(validatePassword1("abcd1234"));
        System.out.println(validatePassword1("Abcd1234"));
        System.out.println(validatePassword1("Abcd1234!"));

        System.out.println("\n============TASK-4==========");
        System.out.println("============Solution1========");
        System.out.println(validateEmailAddress("a@gmail.com"));
        System.out.println(validateEmailAddress("abc@g.com"));
        System.out.println(validateEmailAddress("abc@gmail.c"));
        System.out.println(validateEmailAddress("abc@@gmail.com"));
        System.out.println(validateEmailAddress("abcd@gmail.com"));

        System.out.println("\n=============Solution2===========");
        System.out.println(validateEmailAddress1("a@gmail.com"));
        System.out.println(validateEmailAddress1("abc@g.com"));
        System.out.println(validateEmailAddress1("abc@gmail.c"));
        System.out.println(validateEmailAddress1("abc@@gmail.com"));
        System.out.println(validateEmailAddress1("abcd@gmail.com"));

    }
    /*
    TASK-1 - countMultipleWords() method
    •Write a method that takes a String[] array as an argument and counts
    how many strings in the array has multiple words
    •This method will return an int which is the count of multiple words
    •NOTE: be careful about these as they are not multiple words ->“”,    “   “,
    “    abc”,  “abc   “

    Test data:
    [“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]
    Expected output:
    2
     */

   // 1 solution
    public static  int countMultipleWords(String[] arr){
        int count = 0;

        for (String element : arr){
            element = element.trim();
            if (Pattern.matches("[\\w]+ [\\w ]+", element)) count++;
        }
        return count;
    }

    //2 solution
    public static  int countMultipleWords2(String[] arr){

        int count = 0;

        for (String element : arr){
            String str = element.trim().replace("[ ]+", " ");
            if (str.contains(" ")) count++;
        }
        return count;
    }

    /*
    TASK-2 - removeNegatives() method
    •Write a method that takes an “ArrayList<Integer> numbers” as an
    argument and removes all negative numbers from the given list if there
    are any
    •This method will return an ArrayList with removed negatives

    Test data 1:
    [2, -5, 6, 7, -10, -78, 0, 15]
    Expected output 1:
    [2, 6, 7, 0, 15]
    Test data 2:
    [2, -5, 6, 7, -10, -78, 0, 15]
    Expected output 2:
    [2, 6, 7, 0, 15]
     */

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        Iterator<Integer> numbersIterator = numbers.iterator();

        while(numbersIterator.hasNext()){
            Integer n = numbersIterator.next();
            if (n < 0) numbersIterator.remove();;
        }

        return numbers;


    }


    /*
    TASK-3 - validatePassword() method
    •Write a method that takes a “String password” as an argument and
    checks if the given password is valid or not
    •This method will return true if given password is valid, or false if given
    password is not valid
    •A VALID PASSWORD:
    -should have length of 8 to 16 (length of 7 or 17 should return false)
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
    char
    -should NOT have any space
    Test data 1:
    Expected output 1:
    false
    Test data 2:
    abcd
    Expected output 2:
    false
    Test data 3:
    abcd1234
    Expected output 3:
    false
    Test data 4:
    Abcd1234
    Expected output 4:
    false
    Test data 5:
    Abcd123!
    Expected output 5:
    true
     */

    public static boolean validatePassword(String password){

        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,16}",
                password);
    }

    public static boolean validatePassword1(String password){
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int whiteSpase = 0;
        int spacialChar=0;

        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))) upperCase++;
            if (Character.isLowerCase(password.charAt(i))) lowerCase++;
            if (Character.isDigit(password.charAt(i))) digit++;
            if (Character.isWhitespace(password.charAt(i))) whiteSpase++;
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))
            && !Character.isWhitespace(password.charAt(i))) spacialChar++;

        }


        return (upperCase > 0 && lowerCase > 0 && digit > 0 && spacialChar > 0 && whiteSpase == 0
                && (password.length() >= 8 && password.length() <= 16));

    }


    /*
    TASK-4 - validateEmailAddress() method
    •Write a method that takes a “String email” as an argument and checks if
    the given email is valid or not
    •This method will return true if given email is true, or false if given email is
    not valid
    •A VALID EMAIL:
    -should NOT have any space
    -should not have more than one “@” character
    -should be in the given format <2+chars>@<2+chars>.<2+chars>
    Test data 1:
    a@gmail.com
    Expected output 1:
    false
    Test data 2:
    abc@g.com
    Expected output 2:
    false
    Test data 3:
    abc@gmail.c
    Expected output 3:
    false
    Test data 4:
    abc@@gmail.com
    Expected output 4:
    false
    Test data 5:
    abcd@gmail.com
    Expected output 5:
    true
     */

    public static boolean validateEmailAddress(String email){
        return Pattern.matches("[\\w.]{2,}@[A-Za-z0-9.]{2,}\\.[A-Za-z]{2,}",
                email);
    }

    public static boolean validateEmailAddress1(String email){
        int count = 0;
        if(email.contains("@") && email.contains(".") && email.indexOf("@") < email.lastIndexOf(".")){
            if (email.substring(0, email.indexOf("@")).length() > 2 &&
                    !email.substring(0, email.indexOf("@")).contains(" ") &&
                    !email.substring(0, email.indexOf("@")).contains("@")) count++;
            if (email.substring(email.indexOf("@"), email.lastIndexOf(".")).length() > 2 &&
                    !email.substring(email.indexOf("@")+1, email.lastIndexOf(".")).contains(" ") &&
                    !email.substring(email.indexOf("@")+1, email.lastIndexOf(".")).contains("@")) count++;
            if (email.substring(email.lastIndexOf(".")).length() > 2 &&
                    !email.substring(email.lastIndexOf(".")).contains(" ") &&
            !email.substring(email.lastIndexOf(".")).contains("@")) count ++;
        }

        return count == 3;
    }


}
