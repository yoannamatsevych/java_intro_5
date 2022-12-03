package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("========TASK-1=========");
        String str = "     Java     is      fun       ";
        System.out.println(countWords(str));
        str = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str));
        str = "";
        System.out.println(countWords(str));

        System.out.println("\n==========TASK-2========");
        str = "TechGlobal is a QA bootcamp";
        System.out.println(countA(str));
        str = "";
        System.out.println(countA(str));
        str = "QA stands for Quality Assurance";
        System.out.println(countA(str));

        System.out.println("\n===========TASK-3==========");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));
        numbers = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(numbers));
        numbers = new ArrayList<>();
        System.out.println(countPos(numbers));

        System.out.println("\n===========TASK-4===========");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(nums));
        nums = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(nums));
        ArrayList<Integer> num = new ArrayList<>(nums);

        System.out.println("\n===========TASK-5==========");
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(words));
        words = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println(removeDuplicateElements(words));

        System.out.println("\n===========TASK-6=============");
        String s = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(s));
        s = "Java  is fun    ";
        System.out.println(removeExtraSpaces(s));

        System.out.println("\n=============TASK-7=============");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));
        int[] arr3 =  {10, 3, 6, 3, 2};
        int[] arr4 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(add(arr3, arr4)));

        System.out.println("\n============TASK-8===========");
        int[] numbers8 = {10, -13, 15, 70, 5, 57};
        System.out.println(findClosestTo10(numbers8));
        int[] nums8 = {10, -13, 12, 8, 15, -20};
        System.out.println(findClosestTo10(nums8));



    }


    /*
    Task1
    Requirement:
    Write a method countWords() that takes a String as an
    argument, and returns how many words there are in the
    given String
    Test data 1:
    String str = “      Java is fun       ”;
    Expected output 1:
    3
    Test data 2:
    String str = “Selenium is the most common UI
    automation tool.   ”;
    Expected output 2:
    8
    NOTE: Make your code dynamic that works for any given
    String
    NOTE: Be careful about empty String
    NOTE: Be careful about before and after white spaces
     */
    public static int countWords(String str) {
        int counter1 = 0;
        if (str.isEmpty()) return 0;
        else {
            str = str.trim().replaceAll("[ ]+", " ");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') counter1++;
            }
        }
        return counter1 + 1;
    }
    /*
    Task2
    Requirement:
    Write a method countA() that takes a String as an argument,
    and returns how many A or a there are in the the given String
    Test data 1:
    String str = “TechGlobal is a QA bootcamp”;
    Expected output 1:
    4
    Test data 2:
    String str = “QA stands for Quality Assurance”;
    Expected output 2:
    5
    NOTE: Make your code dynamic that works for any given
    String
    NOTE: Be careful about empty String
    NOTE: Be careful about uppercase and lowercase
     */

    public static int countA(String str) {
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }
    /*
    Requirement:
    Write a method countPos() that takes an ArrayList of
    Integer as an argument, and returns how many elements
    are positive
    Test data 1:
    [-45, 0, 0, 34, 5, 67]
    Expected output 1:
    3
    Test data 2:
    [-23, -4, 0, 2, 5, 90, 123]
    Expected output 2:
    4
    NOTE: Make your code dynamic that works for any given
    ArrayList of Integer
     */

    public static int countPos(ArrayList<Integer> numbers) {
        int countPositive = 0;
        for (Integer number : numbers) {
            if (number > 0) countPositive++;
        }
        return countPositive;
    }

    /*
    TASK4
    Requirement:
    Write a method removeDuplicateNumbers() that takes an
    ArrayList of Integer as an argument, and returns it back
    with removed duplicates
    Test data 1:
    [10, 20, 35, 20, 35, 60, 70, 60]
    Expected output 1:
    [10, 20, 35, 60, 70]
    Test data 2:
    [1, 2, 5, 2, 3]
    Expected output 2:
    [1, 2, 5, 3]
    NOTE: Make your code dynamic that works for any given
    ArrayList of Integer
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    nums.remove(j);
                    j--;
                }
            }
        }
        return nums;
    }

    /*
    Task-5
    Requirement:
    Write a method removeDuplicateElements() that takes an
    ArrayList of String as an argument, and returns it back with
    removed duplicates
    Test data 1:
    [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
    Expected output 1:
    [“java”, “C#”, “ruby”, “JAVA”,  “C++”]
    Test data 2:
    [“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]
    Expected output 2:
    [“abc”, “xyz”, “123”, “ab”, “ABC”]
    NOTE: Make your code dynamic that works for any given
    ArrayList of String
    NOTE: Be careful about lowercase and uppercases, this method
    is case sensitive
     */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    words.remove(j);
                    j--;
                }
            }
        }
        return words;
    }

    /*
    Task6
    Requirement:
    Write a method removeExtraSpaces() that takes a String as an
    argument, and returns a String with removed extra spaces
    Test data 1:
    String str = “   I   am      learning     Java      ”;
    Expected output 1:
    I am learning Java
    Test data 2:
    String str = “Java  is fun    ”;
    Expected output 2:
    Java is fun
    NOTE: Make your code dynamic that works for any given
    String
    NOTE: Be careful about empty String
    NOTE: Be careful about before and after white
     */

    public static String removeExtraSpaces(String str){
        return str.trim().replaceAll("[ ]+", " ");
    }

    /*
    Task7
    Requirement:
    Write a method add() that takes 2 int[] arrays as arguments and
    returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};
    Expected output 1:
    [9, 3, 2, 7, 5, 10]
    Test data 1:
    int[] arr1 =  {10, 3, 6, 3, 2};
    int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
    Expected output 1:
    [16, 11, 9,  3, 2, 7, 5, 10, 34]
    NOTE: Make your code dynamic that works for any given arrays
    NOTE: You will assume that length of arrays are always more than zero
    NOTE: Be careful about arrays length, if they were equal, it would be
    an easy task, but they can be different as given in the example above.
     */

    public static int[] add(int[] arr1, int[] arr2){
        int biggerLength = Math.max(arr1.length, arr2.length);
        int smallerLength = Math.min(arr1.length, arr2.length);
        int[] arr = new int[biggerLength];

        for (int i = 0; i < smallerLength; i++){
            arr[i] = arr1[i] + arr2[i];
        }
        for (int i = smallerLength; i < biggerLength; i++){
            if(arr1.length > arr2.length) arr[i] = arr1[i];
            else arr[i] = arr2[i];
        }
        return arr;
    }

    /*
    Task-8
    Requirement:
    Write a method findClosestTo10() that takes an int[] array as an
    argument, and returns the closest element to 10 from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
    8
    NOTE: You will assume that length of array is always more than
    zero
    NOTE: Make your code dynamic that works for any given int[]
    array
    NOTE: Be careful about element to be 10 (ignore it)
    NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in
    this case return smallest which is 8
     */

    public static int findClosestTo10(int[] nums){
        int absDifference = Integer.MAX_VALUE;

        for (int num : nums) {
            if (Math.abs(10 - num) <= Math.abs(absDifference - 10) && num != 10) {
                if (Math.abs(10 - num) == Math.abs(absDifference - 10)) absDifference = Math.min(num, absDifference);
                else absDifference = num;
            }
        }
        return absDifference;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end-start];
        for (int i = start; i < end; i++){
            if (i % 3 == 0 && i % 5 == 0) arr[i] = "FizzBuzz";
            else if (i % 3 == 0) arr[i] = "Fizz";
            else if (i % 5 == 0) arr[i] = "Buzz";
            else arr[i] = i + "";
        }
        return arr;
    }

}