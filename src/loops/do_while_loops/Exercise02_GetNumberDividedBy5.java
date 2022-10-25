package loops.do_while_loops;

import java.util.Scanner;

public class Exercise02_GetNumberDividedBy5 {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        while (num1 % 5 != 0){
            System.out.println("This number is not dividable by 5");
            System.out.println("Please enter a number");
            num1 = input.nextInt();

        }
        System.out.println("This number is dividable by 5");

        int num2;
        do{

            System.out.println("Please enter a number");
           num2 = input.nextInt();
            if (num2 % 5 != 0 )System.out.println("This number is not dividable by 5");
        }
        while (num2 % 5 != 0);
        System.out.println("This number is dividable by 5");


        for(;;) {
            System.out.println("Please enter a number");
            int num3 = input.nextInt();
            if(num3 % 5 != 0) System.out.println("This number is not dividable by 5");
            else break;
        }

        System.out.println("This number is dividable by 5");


    }
}
