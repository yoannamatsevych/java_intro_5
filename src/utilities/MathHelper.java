package utilities;

public class MathHelper {

    /*
   Write a method that returns max from 3 int number
     */

    public static int maxOfTree (int num1, int num2, int num3){

        return Math.max(Math.max(num1, num2), num3);
    }

    /*
    Write a method that return the min number from 3 number
     */

    public static int minOfThree (int num1, int num2, int num3){

        return Math.min(Math.min(num1, num2), num3);
    }

    /*
        Write a method that return the middle number from 3 number
         */
    public static int middleOfThree (int num1, int num2, int num3){
        int max = maxOfTree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);

        if (num1 != min && num1 != max) return num1;
        else if (num2 != min && num2 != max) return  num2;
        else return num3;

    }

    /*
        Write the method that takes the int like argument and returns true if it is even and false if it odd
     */

    public static boolean isEven (int num){

        return (num % 2 == 0);
    }

    /*
        Write the method that takes the int like argument and returns true if it is odd and false if it is even
     */


    public static boolean isOdd (int num){

        return num % 2 == 1;
    }

    /*
    Create the method that takes 2 int arguments and returns their sum
     */

    public static int sum (int num1, int num2){
        return num1 + num2;
    }

    //OVERLOADING A METHOD
    public static int sum (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


    public static double sum (double num1, double num2){
        return num1 + num2;
    }

    public static long sum (byte num1, int num2){
        return num1 + num2;
    }
 


}
