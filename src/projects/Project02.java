package projects;

import java.util.Scanner;

public class Project02 {

    public static void main (String[] args){

        Scanner inputReader = new Scanner(System.in);

        System.out.println("\n============TASK-1===========");

        System.out.println("\nPlease enter 3 numbers: ");

        int num1 = inputReader.nextInt();
        int num2 = inputReader.nextInt();
        int num3 = inputReader.nextInt();

        System.out.println("\nThe product of the numbers entered is = " + num1 * num2 * num3);

        System.out.println("\n=============TASK-2=============");
        inputReader.nextLine();
        System.out.println("\nWhat is your first name? ");
        String firstName = inputReader.nextLine();

        System.out.println("What is your last name? ");
        String lastName = inputReader.nextLine();

        System.out.println("What is your of birth? ");
        int yearOfBirth = inputReader.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - yearOfBirth) + ".");

        System.out.println("\n=============TASK-3===========");

        inputReader.nextLine();

        System.out.println("\nWhat is your full name? ");
        String fullName = inputReader.nextLine();

        System.out.println("What is your weight? ");
        int kgWeight = inputReader.nextInt();;

        System.out.println(fullName + "'s weight is = " + kgWeight * 2.205 + " lbs.");

        System.out.println("\n===========TASK-4==========");

        inputReader.nextLine();

        System.out.println("\nWhat is your full name? ");
        String fullNameStudent1 = inputReader.nextLine();

        System.out.println("What is your age? ");
        int ageStudent1 = inputReader.nextInt();;

        inputReader.nextLine();

        System.out.println("What is your full name? ");
        String fullNameStudent2 = inputReader.nextLine();

        System.out.println("What is your age? ");
        int ageStudent2 = inputReader.nextInt();;

        inputReader.nextLine();

        System.out.println("What is your full name? ");
        String fullNameStudent3 = inputReader.nextLine();

        System.out.println("What is your age? ");
        int ageStudent3 = inputReader.nextInt();

        System.out.println(fullNameStudent1 + "'s age is " + ageStudent1 +".");
        System.out.println(fullNameStudent2 + "'s age is " + ageStudent2+ ".");
        System.out.println(fullNameStudent3 + "'s age is " + ageStudent3 + ".");
        System.out.println("Tha average age is " + (ageStudent1 + ageStudent2 + ageStudent3) / 3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(ageStudent1, ageStudent2), ageStudent3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(ageStudent1, ageStudent2), ageStudent3) + ".");


    }
}
