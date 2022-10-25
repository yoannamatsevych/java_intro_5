package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("\n========TASK1==========");
        Scanner inputReader = new Scanner(System.in);

        int num1, num2;

        System.out.println("Please enter first number: ");

        num1 = inputReader.nextInt();

        System.out.println("Please enter second number: ");

        num2 = inputReader.nextInt();

        System.out.println("The number1 entered by user is = " + num1);
        System.out.println("The number2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));

        System.out.println("\n============TASK2=========");

        System.out.println("Please enter first number: ");
        num1 = inputReader.nextInt();

        System.out.println("Please enter second number: ");
        num2 = inputReader.nextInt();

        System.out.println("The product of given 2 numbers is: " + (num1 * num2));

        System.out.println("\n===========TASK3==========");

        double floatingNumber1, floatingNumber2;

        System.out.println("Please enter first number: ");
        floatingNumber1 = inputReader.nextDouble();

        System.out.println("Please enter second number: ");
        floatingNumber2 = inputReader.nextDouble();

        System.out.println("The sum of the given numbers is = " + (floatingNumber1 + floatingNumber2));
        System.out.println("The product of the given numbers is = " + floatingNumber1 * floatingNumber2);
        System.out.println("The subtraction of the given numbers is = " + (floatingNumber1 - floatingNumber2));
        System.out.println("The division of the given numbers is = " + floatingNumber1 / floatingNumber2);
        System.out.println("The remainder of the given numbers is = " + floatingNumber1 % floatingNumber2);

        System.out.println("\n============TASK4===========");

        System.out.println("1.\t" + (-10 + 7 * 5));
        System.out.println("2.\t" + (72+24) % 24);
        System.out.println("3.\t" + (10 + -3*9 / 9));
        System.out.println("4.\t" + (5 + 18 / 3 * 3 - 6 % 3));

        System.out.println("\n==============TASK5============");

        System.out.println("Please enter first number: ");
        num1 = inputReader.nextInt();

        System.out.println("Please enter second number: ");
        num2 = inputReader.nextInt();

        System.out.println("The average of the given numbers is: " + (num1 + num2) / 2);

        System.out.println("=================TASK6=============");

        int number1, number2, number3, number4, number5;

        System.out.println("Please enter first number: ");
        number1 = inputReader.nextInt();

        System.out.println("Please enter second number: ");
        number2 = inputReader.nextInt();

        System.out.println("Please enter third number: ");
        number3 = inputReader.nextInt();

        System.out.println("Please enter fourth number: ");
        number4 = inputReader.nextInt();

        System.out.println("Please enter fifth number: ");
        number5 = inputReader.nextInt();

        System.out.println("The average of the given numbers is: " + (number1 + number2 +
                number3 + number4 + number5) / 5);

        System.out.println("\n=============TASK7==========");

        System.out.println("Please enter first number: ");
        number1 = inputReader.nextInt();

        System.out.println("Please enter second number: ");
        number2 = inputReader.nextInt();

        System.out.println("Please enter third number: ");
        number3 = inputReader.nextInt();

        System.out.println("The " + number1 + " multiplied by " + number1 + " is: " +
                number1 * number1);

        System.out.println("The " + number2 + " multiplied by " + number2 + " is: " +
                number2 * number2);

        System.out.println("The " + number3 + " multiplied by " + number3 + " is: " +
                number3 * number3);

        System.out.println("\n==========TASK8=========");

        int sideOfSquare;

        System.out.println("Please enter the side of the square: ");
        sideOfSquare = inputReader.nextInt();

        System.out.println("Perimeter of the square = " + 4 * sideOfSquare);

        System.out.println("Area of square = " + sideOfSquare * sideOfSquare);

        System.out.println("\n===========TASK9============");

        double salary = 90_000;

        System.out.println("A Software Engineer in Test can earn $" + 3 * salary +
                " in 3 \n" + "years.");

        System.out.println("\n===========TASK10==========");

        inputReader.nextLine();

        System.out.println("Please enter your favorite book: ");
        String favBook = inputReader.nextLine();

        System.out.println("Please enter your favorite color: ");
        String favColor = inputReader.nextLine();

        System.out.println("Please enter your favorite number: ");
        int favNum = inputReader.nextInt();

        System.out.println("User’s favorite book is: " + favBook +
                "\nUser’s favorite color is: " + favColor +
                "\nUser’s favorite number is: " + favNum);

        System.out.println("\n============TASK11============");

        inputReader.nextLine();

        System.out.println("Please enter your first name: ");
        String firstName = inputReader.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = inputReader.nextLine();

        System.out.println("Please enter your age: ");
        int age = inputReader.nextInt();

        inputReader.nextLine();

        System.out.println("Please enter your email address: ");
        String emailAddress = inputReader.nextLine();

        System.out.println("Please enter your phone number: ");
        String phoneNum = inputReader.nextLine();

        System.out.println("Please enter your address: ");
        String address = inputReader.nextLine();

        System.out.println("User who joined this program is " + firstName + " "
                + lastName + ". " + firstName +"’s age is \n"
                + age + ". " + firstName + "’s email address is " + emailAddress +
                ", phone number \nis " + phoneNum + ", and address is " + address + ".");

    }
}
