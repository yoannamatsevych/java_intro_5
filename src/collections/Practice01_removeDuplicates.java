package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_removeDuplicates {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
//        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, 1, 2, 5})));
//        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{})));

        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(-5, 10, -5, 10, 1, 2, 5))));


    }


    /*
    Create a method that takes an array of numbers below
    -5, 10, -5, 10, 1, 2, 5

    Remove all duplicates and return a new array
    [-5, 10, 1, 2, 5]

     */


//    public static Integer[] removeDuplicates(Integer[] arr){
//      //  LinkedHashSet<Integer> hs = new LinkedHashSet<>(Arrays.asList(arr));
//        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);

//        //Integer array -> Integer list -> LinkedHashSet -> Object array -> Integer array
//    }
//
//}

public static Integer[] removeDuplicates(ArrayList<Integer> arr){
    LinkedHashSet<Integer> hs = new LinkedHashSet<>(arr);

    return hs.toArray(new Integer[0]);

}

}
