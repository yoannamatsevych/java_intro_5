package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // 1.5, 2.3, -1.3, -3.7

        double[] doubles = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(doubles));
        System.out.println("The length of the array is " + doubles.length);
        // 1.5, 2.3, -1.3, -3.7 -> sort

        Arrays.sort(doubles);
        System.out.println("Array after sorting " + Arrays.toString(doubles));

        /*
        -3.7
        -1.3
        1.5
        2.3
         */
        //When you need indexes or an increment number to use go with for each with arrays
        System.out.println("\nFori loop print below");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

        //When you dont need indexes or an increment number to use go with for each with arrays
        System.out.println("\n For-each loop print below");

        for(double d : doubles){
            System.out.println(d);
        }

        System.out.println("\nFori loop print below");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i] + " - " + chars[i]);
        }

        for(double d : doubles){
            System.out.println(d);
        }

    }
}
