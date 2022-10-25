package conditional_statements.ternary_operator;

import java.util.Random;


public class Exercise2_FindMin {
    public static void main(String[] args) {

        Random random = new Random();
        int random1 = random.nextInt(10) + 1;
        int random2 = random.nextInt(10) + 1;


        System.out.println("The first number is = " + random1);
        System.out.println("The second number is = " + random2);

        int min = random1 < random2 ? random1 : random2;

        System.out.println("The smallest number is = " + min);

        int num1 = (int)((Math.random() * 10) + 1);
        int num2 = (int)((Math.random() * 10) + 1);

        System.out.println("The first number is = " + num1);
        System.out.println("The second number is = " + num2);

        int min1 = num1 < num2 ? num1 : num2;

        System.out.println("Tha smallest number = " + min1);


    }
}
