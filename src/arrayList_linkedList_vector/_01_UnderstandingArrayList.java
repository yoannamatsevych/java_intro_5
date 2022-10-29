package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        //1.Declaring an array vs an ArrayList

        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); // capacity is equal 10 by default

        // 2. Getting the size of the array vs Arraylist
        System.out.println("\n=========Size of Array vs ArrayList===========");
        System.out.println("the size of the array = " + names1.length);//3
        System.out.println("the size of the arraylist = " + names2.size()); // 0-we don't have any elements inside the list

        //3. Printing an array vs ArrayList
        System.out.println("\n=========Printing of Array vs ArrayList===========");
        System.out.println("The array = " + Arrays.toString(names1)); //[null, null, null]
        System.out.println("The ArrayList = " + names2); //[]

        //4. Adding elements to specific indexes
        names1[0] = "Alex";
        names2.add(0, "John"); // names2.add("John")

        System.out.println("\n=========Printing of Array vs ArrayList===========");
        System.out.println("The array = " + Arrays.toString(names1)); //[Alex, null, null]
        System.out.println("The ArrayList = " + names2); //[John]

        //Task

        names1[1] = "Ali";
        names1[2] = "Andrii";
        names2.add(1, "Joe");
        names2.add("Jane");

        System.out.println("\n=========Printing of Array vs ArrayList===========");
        System.out.println("The array = " + Arrays.toString(names1)); //[Alex, Ali, Andrii]
        System.out.println("The ArrayList = " + names2); //[John, Joe, Jane]

        // Task

        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");

        System.out.println("The ArrayList = " + names2); //[John, Joe, Jane, Abdallah, Vlad, Saeed, Hazal, Yildiz, Samir]
        System.out.println("The size of the array list = " + names2.size());

        // 5. Updating an existing element in a Array vs ArratList

        names1[1] = "Mike";
        names2.set(1, "Olena");
        System.out.println("\n=========Printing of Array vs ArrayList===========");
        System.out.println("The array = " + Arrays.toString(names1)); //[Alex, Ali, Andrii]
        System.out.println("The ArrayList = " + names2); //[John, Olena, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]


      // System.out.println(names2.set(10, "Yoanna"));// IndexOutOfBoundException

        names2.add(10, "");
        System.out.println(names2);

    }

}
