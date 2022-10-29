package arrayList_linkedList_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below cities in it
        Chicago
        Berlin
        Miami

            Print the size
            Print the arrayList

         */



        System.out.println("\n--------TASK-1--------\n");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");
        System.out.println("The size of the ArrayList = " + cities.size());
        System.out.println("ArrayList = " + cities);

        System.out.println("\n==========TASK-2=======");
        cities.set(2, "Evanston");
        System.out.println("ArrayList = " + cities);

        /*
        remove Berlin
        print the ArrayList
         */
        System.out.println("\n==========TASK-3=======");
        cities.remove("Berlin"); // cities.remove(1)
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.remove(0));
        System.out.println(cities.remove("evanston"));
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n---------TASK-4----------");
        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println("ArrayList = " + cities);
        System.out.println("The size of ArrayList = " + cities.size());

        System.out.println("\n=========TASK-5============");
        //cities.clear();

        cities.removeAll(cities);

        System.out.println(cities);
        System.out.println(cities.size());


    }
}
