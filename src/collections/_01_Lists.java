package collections;

import java.util.ArrayList;
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

        LinkedList<String> fruits = new LinkedList<>();


        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");
        System.out.println(fruits.element()); // Pineapple
        System.out.println(fruits.getFirst()); // Pineapple
        System.out.println(fruits); // [Apple, Apple, Orange, , , null, null]

        fruits.clear();

        System.out.println(fruits.poll()); // null
        System.out.println(fruits.remove()); // NoSuchElementException

    }
}
