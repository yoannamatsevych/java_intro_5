package homeworks;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {

        System.out.println("==========TASK-1==========");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(number1 - number2));

        System.out.println("\n============TASK-2===========");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5));

        System.out.println("\n============TASK-3===========");

        int random1 = (int) (Math.random() * 51) + 50;
        int random2 = (int) (Math.random() * 51) + 50;
        int random3 = (int) (Math.random() * 51) + 50;

        System.out.println("\nNumber 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of number is " + (random1 + random2 + random3));

        System.out.println("\n==========TASK-4===========");

        double moneyAlex = 125;
        double moneyMike = 220;
        double transaction = 25.5;
        moneyAlex -= transaction;
        moneyMike += transaction;


        System.out.println("\nAlex's money: " + moneyAlex);
        System.out.println("Mike's money: " + moneyMike);


        System.out.println("\n==========TASK-5==========");

        double bicyclePrice = 390.0;
        double savingsPerDay = 15.60;

        System.out.println("\n" + (int)(bicyclePrice / savingsPerDay));

        System.out.println("\n==========TASK-6===========");


        String s1 = "5", s2 = "10";

        int c1 = Integer.parseInt(s1);
        int c2 = Integer.parseInt(s2);

        System.out.println("\n-Sum of " + c1 + " and " + c2 + " is = " + (c1 + c2));
        System.out.println("-Product of " + c1 + " and " + c2 + " is = " + (c1 * c2));
        System.out.println("-Division of " + c1 + " and " + c2 + " is = " + (c1 / c2));
        System.out.println("-Subtraction of " + c1 + " and " + c2 + " is = " + (c1 - c2));
        System.out.println("-Remainder of " + c1 + " and " + c2 + " is = " + (c1 % c2));

        System.out.println("\n============TASK-7==============");

        s1 = "200";
        s2 = "-50";

        c1 = Integer.parseInt(s1);
        c2 = Integer.parseInt(s2);

        System.out.println("\nThe greatest value is = " + Math.max(c1, c2));
        System.out.println("The smallest value is = " + Math.min(c1, c2));
        System.out.println("The average is = " + (c1 + c2) / 2);
        System.out.println("The absolute difference in = " + Math.abs(c1 - c2));

        System.out.println("\n============TASK-8===========");

        double quarter = 3 * 0.25;
        double dime = 1 * 0.1;
        double nickel = 2 * 0.05;
        double penny = 1 * 0.01;
        double coins = quarter + dime + nickel + penny;

        System.out.println("\n" + (int) (24 / coins) + " days");
        System.out.println((int) (168 / coins) + " days");
        System.out.println("$" + (5 * 30 * coins));

        System.out.println("\n==============TASK-9==========");

        double computerPrice = 1250;
        double savingMoneyPerDay = 62.5;
        System.out.println("\n" + (int) (computerPrice / savingMoneyPerDay));

        System.out.println("\n=============TASK-10===========");

        double carPrice = 14_265;
        double monthlyPayment1 = 475.50;
        double monthlyPayment2 = 951;

        System.out.println("\nOption 1 will take " + (int) (carPrice / monthlyPayment1) + " months");
        System.out.println("Option 2 will take " + (int) (carPrice / monthlyPayment2) + " months");

        System.out.println("\n===============TASK-11============");

        System.out.println("\nPlease enter 2 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println((double) n1 / (double) n2);//(double)n1 / n2; -NEVER

        System.out.println("\n===============TASK-12============");

        int randomNumber1 = (int) (Math.random() * 101);
        int randomNumber2 = (int) (Math.random() * 101);
        int randomNumber3 = (int) (Math.random() * 101);

        System.out.println("\nRandom number 1 = " + randomNumber1);
        System.out.println("Random number 2 = " + randomNumber2);
        System.out.println("Random number 3 = " + randomNumber3);

        if (randomNumber1 > 25 && randomNumber2 > 25 && randomNumber3 > 25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // boolean allNumsOver25 = (random > 25) && (random > 25)  && (random > 25);
        // System.out.println (boolean allNumsOver25);

        System.out.println("\n============TASK-13==========");

        System.out.println("\nPlease enter the number between 1 and 7 (1 and 7 included)");

        int givenNumber = input.nextInt();

        if (givenNumber == 1) {
            System.out.println("The number entered returns MONDAY");
        } else if (givenNumber == 2) {
            System.out.println("The number entered returns TUESDAY");
        } else if (givenNumber == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        } else if (givenNumber == 4) {
            System.out.println("The number entered returns THURSDAY");
        } else if (givenNumber == 5) {
            System.out.println("The number entered returns FRIDAY");
        } else if (givenNumber == 6) {
            System.out.println("The number entered returns SATURDAY");
        } else if (givenNumber == 7){
            System.out.println("The number entered returns SUNDAY");
        }
        else System.out.println("Number is not within 1 and 7");


        System.out.println("Please enter number from 1 to 7");
        int dayOfTheWeek = input.nextInt();;

        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number is not within 1 to 7");
        }
        System.out.println("\n===========TASK-14============");

        System.out.println("\nTell me your exam results? ");
        int resultExam1 = input.nextInt();
        int resultExam2 = input.nextInt();
        int resultExam3 = input.nextInt();

        if (((resultExam1 + resultExam2 + resultExam3) / 3) >= 70)
            System.out.println("YOU PASSED!");
        else
            System.out.println("YOU FAILED!");

        String condition = ((resultExam1 + resultExam2 + resultExam3) / 3 >= 70) ? "YOU PASSED!" : "YOU FAILED!";
        System.out.println(condition);

        System.out.println("\n========TASK_15========");

        int inputNumber2 = input.nextInt();
        int inputNumber3 = input.nextInt();
        int inputNumber1 = input.nextInt();

        if ((inputNumber1 != inputNumber2) && (inputNumber1 != inputNumber3) && (inputNumber2 != inputNumber3)) {
            System.out.println("NO MATCH");
        } else if ((inputNumber1 == inputNumber2) && (inputNumber2 == inputNumber3)) {
            System.out.println("TRIPLE MATCH");
        } else {
            System.out.println("DOUBLE MATCH");
        }

        if(inputNumber1 == inputNumber2 && inputNumber2 == inputNumber3)
        System.out.println("TRIPLE MATCH");
        else if (inputNumber1 == inputNumber2 || inputNumber2 == inputNumber3 || inputNumber1 == inputNumber3)
            System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

    }

}
