package arrays;

import java.util.Arrays;

public class _14_CountDuplicate {
    public static void main(String[] args) {
 /*
        1. create the container -> one int for counting the duplicates
        2. fori loop for getting the number you have
         */
        int[] numbers = {2, 3, 7, 1, 1, 7, 1};

        String dup = "";
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
            System.out.println("i = " + i);

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[j] + ", ");
                //if we alrady contain it
                if (dup.contains(numbers[i] + "")) break;
                if (numbers[i] == numbers[j]) {
                    dup += numbers[j] + ",";
                }

            }
            System.out.println();
            System.out.println();
        }

        System.out.println(dup.split(",").length);

    }

    /*
    Create a public static method which will take a int array then it
    will count the duplicate and return it
     */

    public static String reverse3(int[] nums) {
        String str = Arrays.toString(nums);
        String str1 = "";
        for (int i = str.length() - 1; i > 0; i--) {
            str1 += str.charAt(i);
        }
        return str1;
    }

    public int[] maxEnd3(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            int[] numbers = {max, max, max};
        }
        int[] numbers = {max, max, max};
        return numbers;
    }
}
