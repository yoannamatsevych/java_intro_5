package characterClass;

import java.nio.charset.CharacterCodingException;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "2860 south river road  Des Plains IL";
        String s2 = "12334 @!#$!@ TechGlobal";
        System.out.println("String \"" + s1 + "\" has " + accountLetters(s1)+ " letters");
        System.out.println("String \"" + s2 + "\" has " + accountLetters(s2)+ " letters");

        String s3 = "TeChGloBal";
        String s4 = "12334 @!#$!@ TechGlobal";
        String s5 = "123123 TeChGloBal #$%#$%";

        System.out.println("String \"" + s3 + "\" has " + countUpperCases(s3) + " upper letters");
        System.out.println("String \"" + s4 + "\" has " + countUpperCases(s4) + " upper letters");
        System.out.println("String \"" + s5 + "\" has " + countUpperCases(s5) + " upper letters");

        printStringAttributes("12334 @!#$!@ TechGlobal");
    }

    /*
    Create a public static method which will take a string and return numbers of letters
     */

    //2860 south river road  Des Plains IL -> 26
    //12334 @!#$!@ TechGlobal -> 10

    public static int accountLetters(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    /*
    Create public static method named as countUpperCases() which wil take aString and
    count the upper case letters and returns it
     */

    //"12334 @!#$!@ TechGlobal" -> 2
//"TeChGloBal" -> 4
//"123123 TeChGloBal #$%#$%" -> 4

    public static int countUpperCases(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    /*
    Create public static method named as printStringAttributes() takes a String as parameter
    and prints the message dynamically for the string

    "Given "(string)" has:
    x amount of upper cases
    x amount of lower cases
    x amount of letters
    x amount of digits
    x amount of spaces
    x amount of specials"

    Given "12334 @!#$!@ TechGlobal" has:
         2 amount of upper cases
         8 amount of lower cases
         10 amount of letters
         5 amount of digits
         2 amount of spaces
         6 amount of specials

     */

    public static void printStringAttributes(String s){
        int counterU = 0;
        int counterL = 0;
        int counterLetters = 0;
        int counterDigits = 0;
        int counterSpaces = 0;
        int counterSpacials = 0;


        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                counterLetters++;
                if (Character.isUpperCase(c)) counterU++;
                else counterL++;
            }
            else if (Character.isDigit(s.charAt(i))) counterDigits++;
            else if (Character.isSpaceChar(s.charAt(i))) counterSpaces++;
            else counterSpacials++;
        }
        System.out.println("Given " + s + " has:\n" +
                counterU + " amount of upper cases \n" +
                counterL + " amount of lower cases \n" +
                counterLetters + " amount of letters \n" +
                counterDigits + " amount of digits \n" +
                counterSpaces + " amount of spaces \n" +
                counterSpacials + " amount of specials.");

    }

}
