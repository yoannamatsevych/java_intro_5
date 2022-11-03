package practice.arrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arrayListPractice {
    public static void main(String[] args) {
        /*
        1. Create an arrayList and assign 5 numbers
        [1, 2, 3, 4, 5]
        2. Create a loop which will replace every "2" with 7
            [1, 7, 3, 4, 5]
        3. Remove if the number is divisible by 2
        Use iterator

         */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == 2) numbers.set(i, 7);
        }
        System.out.println(numbers);
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()){
            Integer c = numbersIterator.next();
            if(c % 2 == 0) numbersIterator.remove();
        }
        System.out.println(numbers);
        for(int i = 0; i < 3; i++) {
            numbers.add(10);
        }
        System.out.println(numbers);
    }
}
