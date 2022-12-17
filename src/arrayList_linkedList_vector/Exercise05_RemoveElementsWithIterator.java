package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));

        /*
        Task
        Remove elements that contains book
        -This is case-insensitive

        Print the list
        [Pen, Pencil]
         */

    //    System.out.println(objects.stream().filter(x -> x.toLowerCase().contains("book")).count());

        Iterator<String> elementsIterator = objects.iterator();

        while(elementsIterator.hasNext()){
            String x = elementsIterator.next();
            if(x.toLowerCase().contains("book")) elementsIterator.remove();
        }
        System.out.println(objects);

        int[] outer = new int[9];
        int[] inner = {2, 4};
        System.out.println(linearIn(outer, inner));

    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int appears = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < inner.length; i++){
            for(int j = 0; j < outer.length; j++){
                if(inner[i] == outer[j] && !nums.contains(inner[i])){
                    appears++;
                    nums.add(inner[i]);
                }
            }
        }
        return appears == inner.length;
    }
}
