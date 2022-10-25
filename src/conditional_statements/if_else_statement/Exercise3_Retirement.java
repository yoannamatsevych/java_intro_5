package conditional_statements.if_else_statement;

import java.util.Scanner;

public class Exercise3_Retirement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int age = input.nextInt();
        if(age >= 55){
            System.out.println("It is your time to get retired!");
        }
        else{
            int difference = (55 - age);
            if(difference == 1) {
                System.out.println("You have 1 year to be retired");
            }
           else{
               System.out.println("You have " + difference + " years to be retired");
            }
        }
    }
}
