package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        System.out.println("=========TASK - 1===========");

        /**Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print the modified String
         */
        String str = ScannerHelper.getAString();
        if (str.length() <= 8) System.out.println("This String does not have 8 characters");
        else {
            System.out.println(str.substring(str.length() - 4) +
                    str.substring(4, (str.length() - 4 )) + str.substring(0, 4));
        }


        System.out.println("\n==========TASK - 2=============");

        /**
         * Write a program that asks user to enter a sentence, and swaps first and last
         * words of this sentence and print the modified sentence
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        str = input.nextLine();
        str = str.trim();
        int counter = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') counter++;
        }
        if (counter < 1) System.out.println("This sentence does not have 2 or " +
                "more words to swap");
        else {
            int indFirstSpace = str.indexOf(" ");
            int indLastSpace = str.lastIndexOf(" ");
            System.out.println(str.substring(indLastSpace + 1) +
                    str.substring(indFirstSpace, indLastSpace + 1) + str.substring(0, indFirstSpace));

        }

        System.out.println("\n============TASK-3============");

        /**
         * Assume that you are given some Strings as below, and you want to replace
         * bad words with good words.
         * String str1 = “These books are so stupid”;
         * String str2 = “I like idiot behaviors”;
         * String str3 = “I had some stupid t-shirts in the past and also some idiot
         * look shoes”;
         * Write a Java program that checks any given String and replace bad words
         * like “stupid” and “idiot” with “nice” keyword
         */
        String givenString1 = "I like idiot behaviors.";
        String givenString2 = "These books are so stupid.";
        String givenString3 = "I had some stupid t-shirts in the past and also some idiot look shoes.";


        System.out.println(givenString1.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(givenString2.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(givenString3.replace("stupid", "nice").replace("idiot", "nice"));


        System.out.println("\n=============TASK-4============");
        /**
         * Write a program that asks user to enter their name.
         * First check if length of name is more than 2 and is even or odd
         * If length of name is less than 2, then print “Invalid input!!!”
         * If length of name is odd, then print middle character from the name
         * If length of name is even, then print middle 2 characters from the name
         */

        String name = ScannerHelper.getAName();

        if (name.length() < 2) System.out.println("Invalid input!!!");
        else if (name.length() % 2 == 0) System.out.println(name.substring(name.length()/2-1, name.length()/2 + 1));
        else System.out.println(name.substring(name.length()/2, name.length()/2 + 1));

        System.out.println("\n==============TASK-5============");
        /**
         Write a program that asks user to enter a country.
         First check if length of country is more than 5. If not, then print “Invalid
         input!!!”
         If length of country is more than 5, then print country name without first 2
         and last 2 characters
        */

        System.out.println("Please enter the name of country:");
        String country = input.nextLine();

        if (country.length() < 5) System.out.println("Invalid input!!!");
        else {
            System.out.println(country.substring(2, country.length() - 2));
        }

        System.out.println("\n==============TASK-6=============");
        /**
         * Write a program that asks user to enter their full address.
         * Replace all letter ‘a’ or ‘A’ with ‘*’
         * Replace all letter ‘e’ or ‘E’ with ‘#’
         * Replace all letter ‘i’ or ‘I’ with ‘+’
         * Replace all letter ‘u’ or ‘U’ with ‘$’
         * Replace all letter ‘o’ or ‘O’ with ‘@’
         * Then, print result after replacements
         */


        String address = ScannerHelper.getAnAddress();
        String containerString = "";
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == 'a' || address.charAt(i) == 'A') containerString += "*";
            else if (address.charAt(i) == 'e' || address.charAt(i) == 'E') containerString += "#";
            else if (address.charAt(i) == 'i' || address.charAt(i) == 'I') containerString += "+";
            else if (address.charAt(i) == 'u' || address.charAt(i) == 'U') containerString += "$";
            else if (address.charAt(i) == 'o' || address.charAt(i) == 'O') containerString += "@";
            else containerString += address.charAt(i);
        }
        System.out.println(containerString);

        System.out.println("\n==============TASK-7============");

        /**
         * Write a program that generates 2 random numbers between 0 and 25 (0 and
         * 25 are included), Then print all numbers between 2 random numbers that
         * cannot be divided by 5 in ascending order.
         */
        String containerString2 = "";
        int num1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getARandomNumber(0, 25);
        System.out.println("First random number is: " + num1);
        System.out.println("Second random number is: " + num2);
            for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
                if (i % 5 != 0) containerString2 += i + " - ";
            }
        System.out.println(containerString2.substring(0, containerString2.length() - 2));


        System.out.println("\n==============TASK-8=============");

        /**
         *
         */

        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();
        sentence = sentence.trim();
        int spacesCounter = 0;

        for(int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' ') spacesCounter++;
        }

        if (spacesCounter < 1) System.out.println("This sentence does not have multiple words.");
        else System.out.println("This sentence has " + (spacesCounter + 1) + " words.");

        System.out.println("\n==================TASK-9=============");

        int num = ScannerHelper.getAnNumber();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n==============TASK-10==============");

        System.out.println("Please enter a word: ");
        String word = input.next();
        String reversWord = "";

        if (word.length() < 1) System.out.println("This word does not have 1 or more characters");
        else {
            for (int i = word.length() - 1; i >= 0; i--){
               reversWord += word.charAt(i);
            }
            if (reversWord.equals(word)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }

        System.out.println("\n================TASK-11===============");

        System.out.println("Please enter the sentence:");
        input.nextLine();
        String givenSentence = input.nextLine();
        int counterForA = 0;

        if (givenSentence.length() < 1) System.out.println("This sentence does not have any characters");
        else {
            for (int i = 0; i < givenSentence.length(); i++){
                if (givenSentence.toLowerCase().charAt(i) == 'a') counterForA++;
            }
            System.out.println("This sentence has " + counterForA + " a or A letters.");
        }

    }
    public String wordEnds(String str,  String word) {
        String str1 = "";
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i+2).equals("word") && i != 0 && i != str.length() - 2)
                str1 += str.substring(i-1, i) + str.substring(i+3, i+4);

        }
        return str1;
    }


    }

