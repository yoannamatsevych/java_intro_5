package arrays;

import java.util.Arrays;

public class _09_Find_Max_Min {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 7, -5};
        findMaxAndMin(numbers);
        findMaxAndMinWithSort(numbers);
        findMaxAndMin(numbers);
    }

    /*
    create public static method which will take an int array then it will find the
    max and min numbers from there and print it

    Examples:
    Array -> int[] numbers = {5, 3, 2, 4, 7, -5}
     */
    public static void findMaxAndMin(int[] elements){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : elements){
            if (max < n) max = n;
            if (min > n) min = n;

        }

        System.out.println("Max = " + max);
        System.out.println("Max = " + min);
        }

    public static void findMaxAndMinWithSort(int[] elements){
            Arrays.sort(elements);

            if(elements.length < 0) System.out.println("Array is empty");
            else {
                System.out.println(elements[0]);
                System.out.println(elements[elements.length - 1]);
            }
    }
    }


