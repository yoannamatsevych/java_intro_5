package conditional_statements.if_else_statement;

import java.util.Scanner;

public class Exercise2_EvenOrAdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number?");
        int number = input.nextInt();

        if (number % 2 == 0){//num % 2 != 1(even), num % 2 ==1 (odd), num % 2 != 0 (odd)
            System.out.println("The number you entered is even!");
        }
        else{
            System.out.println("The number you entered is odd!");
        }
    }

}
