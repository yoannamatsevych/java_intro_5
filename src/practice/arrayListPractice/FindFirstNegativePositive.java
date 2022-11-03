package practice.arrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        firstNegativePositive(nums);

    }


            /*
        create a public static method which will take an arraylist and it will find the
        first positive and first negative number and print them.

        Example:
            ArrayList -> [0, -4, -7, 0, 5, 10, 45]

        Output:
            First positive number is: 5
            First negative number is: -4
         */

    public static void firstNegativePositive(ArrayList<Integer> nums){
        int negativeNum = 0;
        int positiveNum = 0;
        for (Integer element : nums){
            if (element > 0 && positiveNum == 0) positiveNum = element;

            if (element < 0 && negativeNum == 0) negativeNum = element;

        }
        System.out.println("First positive number is: " + positiveNum);
        System.out.println("First negative number is: " + negativeNum);
    }

}
