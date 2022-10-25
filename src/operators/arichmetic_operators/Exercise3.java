package operators.arichmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

       System.out.println("Hey user, hiw much you make yearly?");

       double yearlySalary = scanner.nextDouble();

       System.out.println("Your monthly payment is $" + yearlySalary / 12 + " then!" );

//        System.out.println("Hey user, hiw much you make yearly?");
//
//        System.out.println("Your monthly payment is $" + scanner.nextDouble() / 12 + " then!" );
    }
}
