package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1: ");

        number1 = input.nextInt();

        System.out.println("Please enter number 2: ");

        number2 = input.nextInt();

        System.out.println("Please enter number 3: ");

        number3 = input.nextInt();

        int sum = number1 + number2 + number3;

        System.out.println("The sum of the numbers you enter is = " + sum);
    }
}
