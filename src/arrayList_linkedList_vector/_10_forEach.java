package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_forEach {
    public static void main(String[] args) {

        /*
        Create an ArrayList to store below colors

        Blue
        Red
        Brown
        Pink
        Yellow
        Black

        Print the ArrayList

         */

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red", "Brown", "Ping", "Yellow", "Black"));
        System.out.println(colors);

        System.out.println("\n========Iterating with Fori=======");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }


        System.out.println("\n========Iterating with For each loop=======");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\n========Iterating with forEach=======");

        colors.forEach(System.out::println);
    }
}
