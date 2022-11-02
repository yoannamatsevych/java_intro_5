package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        moreThen100();
    }

    public static void moreThen100(){
        Scanner input = new Scanner(System.in);

        int sum = 0;

        do{
            System.out.println("Please enter a number");
            int num = input.nextInt();
            if(num >= 100) System.out.println("This numbers is already more then 100");
            else {sum+=num;}
        }while (sum < 100);

        if (sum >= 100) System.out.println("The sum of the number is at list 100");
    }
}
