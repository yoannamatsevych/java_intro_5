package practice.ifElseStatements;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 101);

        if (num1 <= 50){
            System.out.println(num1 + " is in the 1st half");
            if (num1 <= 25){
                System.out.println(num1 + " is in the 1st quarter");
            }
            else{
                System.out.println(num1 + " is in the 2nd quarter");
            }
        }
        else{System.out.println(num1 + " is in the 2nd half");
            if (num1 <= 75){
                System.out.println(num1 + " is in the 3rd quarter");
            }
            else {
                System.out.println(num1 + " is in the 4th quarter");
            }
        }

        Scanner input = new Scanner (System.in);

        System.out.println("Is ir raining? ");
        boolean isRaining = input.nextBoolean();

        System.out.println("Do you have umbrella?");
        boolean isHaveUmbrella = input.nextBoolean();

        System.out.println("Are you hungry?");
        boolean isHungry = input.nextBoolean();

        if (isRaining){
            System.out.println("It is raining outside.");
            if(isHaveUmbrella){
                System.out.println("You can go outside.");
            }
            else{
                System.out.println("You stay home.");
            }
        }
        else{
            System.out.println("It is not raining outside.");
            if (isHungry){
                System.out.println("You go to chick-fil-a.");
            }
            else {
                System.out.println("You are riding a bike.");
            }
        }
    }
}
