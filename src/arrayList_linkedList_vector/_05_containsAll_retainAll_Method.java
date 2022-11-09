package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Collections;

public class _05_containsAll_retainAll_Method {
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

         /*
        Check if the countries Array list contains Sweden and Denmark
            */

        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));

        boolean hasSwedan = false, hasDenmark = false;
        for(String country : countries){
            if(country.equals("Sweden")) hasSwedan = true;
            else if (country.equals("Denmark")) hasDenmark = true;

            if (hasSwedan && hasDenmark) break;

        }

        /*
        Check if the countries Array list contains Sweden and Spain, Germany, Portugal
            */
        ArrayList<String> europeCountries = new ArrayList<>();
        europeCountries.add("Sweden");
        europeCountries.add("Portugal");
        europeCountries.add("Spain");

        europeCountries.add("Germany");
        europeCountries.add("Italy");

        System.out.println(countries.contains(europeCountries));

        Collections.sort(countries);
        System.out.println(countries);

        countries.retainAll(europeCountries);
        System.out.println(countries);


    }
}
