package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

//        System.out.println("Hey user give me a number");
//        int num1 = inputReader.nextInt();
//        System.out.println("Hey user five me another number");
//        int num2 = inputReader.nextInt();;
//
//        System.out.println("Max of your numbers is " + Math.max(num1, num2));
//        System.out.println("Min of your numbers is " + Math.min(num1, num2));

        System.out.println("Hey user give me a number");
        int number1 = inputReader.nextInt();
        System.out.println("Hey user give me another a number");
        int number2 = inputReader.nextInt();
        System.out.println("Hey user give me the last number");
        int number3 = inputReader.nextInt();

        System.out.println("Max of your numbers is " + Math.max(Math.max(number1, number2), number3));
        System.out.println("Min of your numbers is " + Math.min(Math.min(number1, number2), number3));


    }
}
