package arrayList_linkedList_vector;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountsElements {
    public static void main(String[] args) {

        /*
        1. Count evens = 3
        2. Count odds = 2
        3. more than 15;
         */

        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        System.out.println(numbers);
        System.out.println(numbers.stream().filter(x -> x % 2 == 1).count());
        System.out.println(numbers.stream().filter(x -> x > 15).count());
        System.out.println(numbers.stream().filter(x -> x != 20).count());
       

    }
}
