package arrayList_linkedList_vector;

import java.util.ArrayList;

public class _05_containsAll_Method {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        /*
        Check if the countries Array list contains Spain
         */

        System.out.println(countries.contains("Spain"));

    }
}
