package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {

        /*
        -They preserve insertion order
        -They allowed duplicates
        - allowed null elements

        performance
        memory
        initial capacity
        load
        the way they store the data
         */

        ArrayList<String> d = new ArrayList<>(Arrays.asList("a", "b", "c"));
        d.add("a");
        System.out.println(d);
        d.removeIf(x -> x.equals("a"));
        System.out.println(d);


        LinkedList<String> fruits = new LinkedList<>();


        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");
        System.out.println(fruits.element()); // Pineapple
        System.out.println(fruits.getFirst()); // Pineapple
        System.out.println(fruits); // [Apple, Apple, Orange, , , null, null]
        System.out.println(fruits.poll());
        System.out.println(fruits.element());

        System.out.println(fruits);


//        fruits.clear();
//
//        System.out.println(fruits.poll()); // null
//        System.out.println(fruits.remove()); // NoSuchElementException

    }
}
