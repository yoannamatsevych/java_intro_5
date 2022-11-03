package practice.arrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("banana", "orange", "apple"));
        ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("banana", "orange", "Apple"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("banana", "orange", "grape"));
        System.out.println(containsApple(fruits));

    }

    /*
    Create a public static method which will tae an array list the it will check it is containing "apple"

    NOTE IGNORE CASES

    Example:

    ArrayList -> {"banana", "orange", "Apple"} ==> true
    ArrayList -> {"banana", "orange", "apple"} ==> true
    ArrayList -> {"pineapple", "banana", "orange", "grapes} ==> false
     */

    public static boolean containsApple(ArrayList<String> fruits){

//        for (String element : fruits){
//            if (element.equalsIgnoreCase("Apple")) return true;
//        }
//        return false;


//        return fruits.contains("apple") || fruits.contains("Apple");

        for (int i = 0; i < fruits.size(); i++){
            if(fruits.get(i).equalsIgnoreCase("apple")) return true;
        }
        return false;
    }
}
