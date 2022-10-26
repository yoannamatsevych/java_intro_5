package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {
        //
        String[] fruits = new String[4];

        System.out.println(Arrays.toString(fruits));

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";
        System.out.println(Arrays.toString(fruits));
        fruits[1] = "Grapes";
        fruits[2] = "Orange";
        System.out.println(Arrays.toString(fruits));

        System.out.println("\nReassigning values:");

        fruits[2] = fruits[0];
        fruits[3] = fruits[0];
        System.out.println(Arrays.toString(fruits));
        String str = Arrays.toString(fruits);
        System.out.println(str.substring(1, str.length() - 1));

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
