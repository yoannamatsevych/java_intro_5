package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[\\w\\- ]{8,15}", "JohnDoe_123"));
        System.out.println(Pattern.matches("[\\d]{8,15}", "12345678"));
        System.out.println(Pattern.matches("[\\D]{8,15}", "asdfghdjs1"));
        System.out.println(Pattern.matches(".+", "fghhg123@$"));


        //NNN-NN-NNNN

        System.out.println(Pattern.matches("[0-9]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000"));

        //(XXX)-XXX-XXXX
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(000)-000-0000"));

        System.out.println("=========TASK-3=========");

        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";

        System.out.println(str.replaceAll("[a-c]", "*"));

            /*
              ate a String as below:
              ing str = “ abc 123 $#^
              ove all special charact
              ected output: abc123
                                  */


        String str1 = " abc 123 $#^ ";

        System.out.println(str1.replaceAll("[\\W_]", ""));
        System.out.println(str1.replaceAll("[^A-Za-z0-9]", ""));


        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{1,} [A-Z]{1}[a-z]{1,}", "John Doe"));

        /*
        String str3 = "%ABC123#";

        String strLetters = str3.replaceAll("[^A-Za-z]", "");

        String[] arr1 = strLetters.split("");

        System.out.println(Arrays.toString(arr1));
        String strDigit = str3.replaceAll("[^0-9]", "");

        String[] arr2 = strDigit.split("");
        System.out.println(Arrays.toString(arr2));

         */

        String str3 = "%ABC123#";

        String strLetters = str3.replaceAll("[^A-Za-z]", "");

        String[] arr1 = strLetters.split("");

        System.out.println(Arrays.toString(arr1));
//        String strDigit = str3.replaceAll("[^0-9]", "");
//
//        String[] arr2 = strDigit.split("");
        System.out.println(Arrays.toString(str3.replaceAll("[^0-9]", "").toCharArray()));


    }

    public String notReplace(String str) {
        if (str.substring(0, 2).equals("is"))
            return str.replaceAll("is", "is not");

        else if (str.substring(str.length()-2).equals("is"))
        return str.replaceAll("is", "is not");
  else {
            str.replace("is", "is not");
        }
        return str;





    }
}
