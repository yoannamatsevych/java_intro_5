package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice07_ProductPractices {
    public static void main(String[] args) {

        /*
        iPhone      -> 1000
        MacBook Pro -> 1300
        iMac        -> 1500
        Airpods     -> 200
        iPad        -> 700

        Task 1 - Find most expensive product a print as below
        iMac is the most expensive with the price of $1500

        1. Store the item in a hashMap
        2. Find the max price value from HashMap values
        3, Loop and find the item which has the value equals max price value
         */

        HashMap<String, Double> map = new HashMap<>();
        map.put("iPhone", 1000.0);
        map.put("MacBook Pro", 1300.0);
        map.put("iMac", 1500.0);
        map.put("Airpods", 200.0);
        map.put("iPad", 700.0);

        double maxPrice = new TreeSet<>(map.values()).last();

        for(Map.Entry<String, Double> entry : map.entrySet()){
            if (entry.getValue() == maxPrice) {
                System.out.println(entry.getKey() + " is the most expensive with the price of $" + entry.getValue());
            }

        }


    }
}
