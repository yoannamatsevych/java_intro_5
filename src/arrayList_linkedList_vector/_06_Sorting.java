package arrayList_linkedList_vector;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _06_Sorting {
    public static void main(String[] args) {


    /*
    Create below LinkedList to store data

    1 -> 10, -3, 5, 15
    2 -> Remove, Phone, Laptop

    Print the LinkedList
    Sort the LinkedList and print them again

     */

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> strings = new LinkedList<>(Arrays.asList("Remove", "Phone", "Laptop"));

        System.out.println("\n=======Before sort========");
        System.out.println(numbers);
        System.out.println(strings);

        Collections.sort(numbers);
        Collections.sort(strings);

        System.out.println("\n=======After sort========");
        System.out.println(numbers);
        System.out.println(strings);

        System.out.println(numbers.indexOf(15));


    }

}
