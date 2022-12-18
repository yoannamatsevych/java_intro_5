package collections;

import java.util.*;

public class Practice06_CalculateCharacters {

    public static void main(String[] args) {

        /*
        You are giving a string as "banana"
        Print all duplicated letters

        Expected output:
        a
        b

        key   value
        b     1
        a     3
        n     2
         */

        System.out.println("=========TASK-1=========");
        String str = "banana";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        System.out.println(map);

        // Check a entry
        // If entry value is more than 1, then print the key of value

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1 ) System.out.println(entry.getKey());
        }

        System.out.println("=========TASK-2=======");

        System.out.println(getMostCounted(null));
        System.out.println(getMostCounted(""));
        System.out.println(getMostCounted("a"));
        System.out.println(getMostCounted("banana"));
        System.out.println(getMostCounted("apple"));
        System.out.println(getMostCounted("papa"));
        System.out.println(getMostCounted("abcabcabc"));


    }


    /*
    Create a method that takes a String as args
    and it return the most occurred in the string
    If there are more than one character that is counted the most, than return all
    if String is empty return nothing

    ""      -> []
    null    -> []
    banana  -> [a]
    apple   -> [p]
    "papa"  -> [p, a]
     */

    public static Set<Character> getMostCounted(String str){
        /*
        1. Count all the unique characters
        2. Find the max occurance
        3. Find all the characters that has the the max count, put them in a collection and return it
         */
        Set<Character> set = new LinkedHashSet<>();

        if(str == null || str.isEmpty()) return set;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();


        for (char c : str.toCharArray()) {
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        int maxCount = new TreeSet<>(map.values()).last();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount) set.add(entry.getKey());
        }
        return set;
    }

}
