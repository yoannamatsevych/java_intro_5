package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;


public class Homework05 {
    public static void main(String[] args) {

        System.out.println("=========Task - 1=========");

        String str = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) str += (i + " - ");
        }
        System.out.println(str.substring(0, str.length() - 3));

        System.out.println("==========Task - 2===========");

        String str1 = "";

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                str1 += i + " - ";
        }
        System.out.println(str1.substring(0, str1.length() - 3));

        System.out.println("==========Task - 3=============");

        String str2 = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0)
                str2 += i + " - ";
        }

        System.out.println(str2.substring(0, str2.length() - 3));

        System.out.println("============Task - 4=============");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }

        System.out.println("============Task - 5===============");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("=============Task - 6==============");

        int num = ScannerHelper.getAnNumber();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("===========Task - 7==============");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        int counter = 0;
        fullName = fullName.toLowerCase();
        for (int i = 0; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == 'a' || fullName.charAt(i) == 'e' || fullName.charAt(i) == 'i' ||
                    fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u') {
                counter++;
            }
        }
        System.out.println("There are " + counter + " vowel letter in this full name");

        System.out.println("===========Task - 8===========");

        int number = ScannerHelper.getAnNumber();
        if (number >= 100) System.out.println("This number is already more than 100");
        else {
            int sumOfTheGivenNumber = number;
            do {
                int number1 = ScannerHelper.getAnNumber();
                sumOfTheGivenNumber += number1;
            }
            while (sumOfTheGivenNumber < 100);
            System.out.println("Sum of the entered numbers is at least 100");
        }

            System.out.println("============Task - 9============");

            int givenNumber = ScannerHelper.getAnNumber();
            int firstNum = 0;
            int secondNum = 1;

            String containerStr = "";

            for (int i = 1; i < givenNumber; i++) {
                containerStr += firstNum + " - ";
                int summa = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = summa;
            }


            System.out.println(containerStr.substring(0, containerStr.length() - 3));

            System.out.println("==============Task - 10==============");

            String name;
            do {
                System.out.println("Please enter a name:");
                name = input.nextLine();
            }
            while (!name.toLowerCase().startsWith("j"));
            System.out.println("End of the program");


        }
    }


