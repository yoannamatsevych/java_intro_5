package conditional_statements.if_elseIf_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number?");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("POSITIVE");
        }
        else if (number < 0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }


    }
}
