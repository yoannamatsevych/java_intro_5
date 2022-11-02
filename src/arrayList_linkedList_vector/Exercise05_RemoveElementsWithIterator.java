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
    }
}
