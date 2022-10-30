package arrayList_linkedList_vector;

import java.util.*;

public class _08_convertingAnArrayToAnArrayLIs {
    public static void main(String[] args) {

        /*
        Create an ArrayList of cities -> Tokyo, Berlin, moscow, Denver
        Create a LinkedList of characters -> A, #, 5, +
        Create a Vector of numbers -> 1, 2, 2, 7, 10
         */
        System.out.println("\n=======WAY-1 with Arrays.asList() method=========");

        String[] arr1 = {"Tokyo", "Berlin", "moscow", "Denver"};

        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities);

        System.out.println("\n=======WAY-2 with loop - Manual WAY=========");

        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>();

        for (char c : arr2){
            characters.add(c);
        }
        System.out.println(characters);

        System.out.println("\n=======WAY-2 with Collections.addAll() method=========");
        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3);

        System.out.println(numbers);

    }
}
