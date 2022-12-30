package collections;

import java.util.*;

public class _06_Maps_Methods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("France", "Paris");

        System.out.println(capitals);

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");
        System.out.println(capitals);//{Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid}

        System.out.println("=====Retrieve values with their keys=======");
        System.out.println(capitals.get("Spain")); //Madrid

        System.out.println(capitals.get("Belgium")); // null

        System.out.println(capitals.getOrDefault("Belgium", "Does not exist"));

        System.out.println("=======Check if map contains given key or value=====");
        System.out.println(capitals.containsKey("Germany")); //true
        System.out.println(capitals.containsKey("Portugal"));//false

        System.out.println(capitals.containsValue("Ankara")); // false
        System.out.println(capitals.containsValue("Berlin"));//true

        System.out.println("=======Update the value for the specified key=====");

        System.out.println(capitals.replace("Ukraine", "Kyiv")); // null
        System.out.println(capitals.replace("Germany", "berlin", "Munich")); // false
        System.out.println(capitals.replace("Germany", "Berlin", "Munich")); // true

        capitals.put("Turkey", "Ankara");
        System.out.println(capitals);

        capitals.put("Turkey", "Istanbul");
        System.out.println(capitals);

        System.out.println("=======remove some entries=====");
        capitals.remove("France");
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}
        System.out.println(capitals.remove("US")); // null
        capitals.remove("Germany", "Stuttgart"); // false
        System.out.println(capitals);

        System.out.println(capitals.remove("Germany", "Munich")); //true
        System.out.println(capitals);//{Turkey=Istanbul, Italy=Rome, Spain=Madrid}

        System.out.println("===========Advanced Map methods========");
        //Keys: Turkey, Italy, Spain
        //Values: Istanbul, Rome, Madrid

        TreeSet<String> treeSet = new TreeSet<>(capitals.keySet());
        Set<String> set = capitals.keySet();
        System.out.println(set); // [Turkey, Italy, Spain]
        System.out.println(treeSet);

        Collection<String> collection = capitals.values();
        TreeSet<String> set1 = new TreeSet<>(collection);
        System.out.println(collection); // [Istanbul, Rome, Madrid]

        ArrayList<String> list = new ArrayList<>(capitals.values());
        System.out.println(list);

        System.out.println("======Iterating key and values");
        for (String s : capitals.keySet()) {
            System.out.println(s);
        }

        for (String value : capitals.values()) {
            System.out.println(value);
        }

        System.out.println("=======Getting all the entries=====");
        Set<Map.Entry<String, String>> entries = capitals.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }

        LinkedHashMap<String, Integer> groceryList = new LinkedHashMap<>();
        groceryList.put("Orange", 2);
        groceryList.put("Apple", 3);
        groceryList.put("Kiwi", 5);
        System.out.println(total(groceryList));

    }

            /*
      Orange - $2
      Apple - $3
      Kiwi - $5


      get 1 Orange -> $2
      get 2 Apples -> $6
      get 3 Kiwi -> $15
      TOTAL: $23
    */

    public static String total(LinkedHashMap<String, Integer> groceryList){
        int total = 0;
        int index = 1;
        for (Map.Entry<String, Integer> item : groceryList.entrySet()){ // Orange = 2, Apple = 3, Kiwi = 5
            total += item.getValue() * index++;
        }
        return "$" + total;
    }



}
