package practice.ifElseStatements;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter 5 numbers between 1 and 10 (1 and 10 included)");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10 && num3 >= 1 && num3 <= 10 && num4 >= 1 && num4 <= 10
        && num5 >= 1 && num5 <= 10) {
            System.out.println(num1 * 5 + num2 * 4 + num3 * 3 + num4 * 2 + num5 * 1);
        }
        else {
            System.out.println("no points");
        }

    }
}
