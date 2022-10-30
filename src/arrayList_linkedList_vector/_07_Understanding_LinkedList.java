package arrayList_linkedList_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class _07_Understanding_LinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(10.5));
        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.get(1));

        System.out.println(numbers.getFirst());//10,5
        System.out.println(numbers.getLast());//20,0
        System.out.println(numbers.offer(4.5));
        System.out.println(numbers);
        System.out.println(numbers.peekFirst()); // 4.5 - gets the first element
        System.out.println(numbers);

        System.out.println(numbers.pop()); // 4.5 - retrieves and removes the first element
        System.out.println(numbers); //[5.5, 20.0, 4.5]

        System.out.println(numbers.pollFirst()); // 5.5
        System.out.println(numbers);// [20.0, 4.5]

//        System.out.println(numbers.pollLast()); // 4.5
//        System.out.println(numbers);// [20.0]

        numbers.push(2.0);
        System.out.println(numbers); // [2.0, 20.0, 4.5]



    }
}
