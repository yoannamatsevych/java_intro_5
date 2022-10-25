package loops;

import java.util.Scanner;

public class Exercise01_sumOfNumbersByUser {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter how many number you want to enter:");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            System.out.println("Please enter number " + i + ":");
            sum += input.nextInt() ;
        }
        System.out.println(sum);


        System.out.println("======WHILE LOOP======");

        System.out.println("Please enter how many number you want to enter:");
        int count = input.nextInt();

        int sum2 = 0;

        int start = 1;

        while(start <= count){
            System.out.println("Please enter number " + start);
            sum2 += input.nextInt();
        }
        System.out.println(sum2);

    }
}
