package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_ConvertingAnArrayListToAnArray {
    public static void main(String[] args) {

        ArrayList<String> lan = new ArrayList<>();
        lan.add("Java");
        lan.add("C#");
        lan.add("Ruby");

        Object[] arr = lan.toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length); //3

    }

}
