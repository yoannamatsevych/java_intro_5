package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_CountsElements {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below elements
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple
         */
        System.out.println("\n========TASK-1==========");


        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));

        System.out.println(colors);
        System.out.println(colors.size());

        for (String color : colors){
            System.out.println(color);
        }

        System.out.println("\n=========TASK-2 - Elements that has length of 6=========");
        int counter = 0;
         for (int i = 0; i < colors.size(); i++){
             if(colors.get(i).length() == 6) counter++;
         }
        System.out.println(counter);

        counter = 0;
        for (String color : colors){
            if(color.length() == 6) counter++;
        }
        System.out.println(counter);

        /*
        Count the element that has o
         */
        System.out.println("\n========TASK-3 - Element that has 'o'============");
        counter = 0;
        for (String color : colors){
            if(color.contains("o")) counter++;
        }
        System.out.println(counter);

        counter = 0;
        for (int i = 0; i < colors.size(); i++){
            if(colors.get(i).contains("o")) counter++;
        }
        System.out.println(counter);



    }
}
