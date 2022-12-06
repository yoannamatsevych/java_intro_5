package projects;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class Project08 {

    public static void main(String[] args) {

        System.out.println("===========TASK-1============");
        int[] arr1_1 = {4, 8, 7, 15};
        System.out.println(findClosestDistance(arr1_1));
        int[] arr1_2 = {4};
        System.out.println(findClosestDistance(arr1_2));
        int[] arr1_3 = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(arr1_3));
        int[] arr1_4 = {4, 8, 7, 15};
        System.out.println(findClosestDistance1(arr1_4));

        System.out.println("=============TASK-2============");
        int[] arr2_1 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(arr2_1));
        int[] arr2_2 = {5, 3, -1, 3, 5, 7, 7};
        System.out.println(findSingleNumber(arr2_2));
        int[] arr2_3 = {5, 3, -1, 3, 5, 4, -1};
        System.out.println(findSingleNumber(arr2_3));
        int[] arr2_4 = {2};
        System.out.println(findSingleNumber(arr2_4));
        int[] arr2_5 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber1(arr2_5));

        System.out.println("=============TASK-3===============");
        String str3 = "Hello";
        System.out.println(findFirstUniqueCharacter(str3));
        str3 = "abc abc d";
        System.out.println(findFirstUniqueCharacter(str3));
        str3 = "abab";
        System.out.println(findFirstUniqueCharacter(str3));

        System.out.println("=============TASK-4=============");
        int[] arr4_1 = {2, 4};
        System.out.println(findMissingNumber(arr4_1));
        int[] arr4_2 = {2, 3, 1, 5};
        System.out.println(findMissingNumber(arr4_2));
        int[] arr4_3 = {4, 7, 8, 6};
        System.out.println(findMissingNumber(arr4_3));

    }

    /*
    TASK-1 - findClosestDistance() method
    •Write a method that takes a int[] array as an argument and returns the
    closest difference between the numbers
    •This method will return an int which is the closest difference between 2
    elements in the array
    •NOTE: if array does not have at least 2 elements, then return -1.
    Test data1:
    [4]
    Expected output:
    -1
    -The reason the result is -1 for above example is because the array length is
    less than 2 and we return -1 in this case.
    Test data2:
    [4, 8, 7, 15]
    Expected output:
    1
    -The reason the result is 1 for above example is because 8 and 7 are closest
    elements in the array and the difference between them is 1.
    Test data2:
    [10, -5, 20, 50, 100]
    Expected output:
    10
    The reason the result is 1 for above example is because 10 and 20 are
    closest elements in the array and the difference between them is 10.
     */
    public static int findClosestDistance(int[] arr){
        if (arr.length < 2) return -1;
        int difference = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(Math.abs(arr[i] - arr[i+1]) < difference) difference = Math.abs(arr[i] - arr[i+1]);
        }
        return difference;
    }

    public static int findClosestDistance1(int[] arr) {
        // look att current number, compare with all the number and find the smallest abs diff
        // store that value and reassign it if needed
        int len = arr.length, ans = MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < ans) ans = diff;
            }
        }
        return ans;
    }


    /*
    TASK-2 – findSingleNumber() method
    Write a method that takes a int[] array as an argument and returns the
    element occurs only once.
    You will be given a non-empty array in which all the elements appears
    twice except for one.
    Test data 1:
    [2]
    Expected output 1:
    2
    Test data 2:
    [5, 3, -1, 3, 5, 7, -1]
    Expected output 2:
    7
     */
    public static int findSingleNumber(int[] arr){
        Arrays.sort(arr);
        if (arr.length == 1) return arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) return arr[i];
            else i++;
        }
        return arr[arr.length-1];
    }

    public static int findSingleNumber1(int[] arr){
        if (arr.length == 1) return arr[0];
        int singleNumber = 0;
        ArrayList<Integer> hasDuplicate = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hasDuplicate.contains(arr[i])) {
                hasDuplicate.add(arr[i]);
                singleNumber += arr[i];
            } else singleNumber -= arr[i];
        }
        return singleNumber;
    }

    /*
    TASK-3 - findFirstUniqueCharacter() method
    Write a method that takes a non-empty String as an argument and
    returns the first unique character in the String.
    This method returns a char.
    If there is no unique character in the String, then return space by default.
    This task is case-sensitive.
    Test data 1:
    Hello
    Expected output 1:
    H
    Test data 2:
    abc abc d
    Expected output 2:
    d
    Test data 3:
    abab
    Expected output 3:
    Space
     */
    public static char findFirstUniqueCharacter(String str) {
        while(str.length() > 0){
            //if the character we are looking at, exist in the rest of the string
            //remove all instances of that character, else return character
            if(str.length() == 1) return str.charAt(0);
            if(!str.substring(1).contains(str.charAt(0) + "")) return str.charAt(0);
            else str = str.replaceAll("" + str.charAt(0), "");
        }
        return ' ';
    }

    /*
    TASK-4 – findMissingNumber() method
    Write a method that takes a int[] array as an argument and returns the
    missing element.
    You will be given an array length of 2 at least.
    Array elements will be representing a sequence of numbers that increases
    by 1.
    Test data 1:
    [2, 4]
    Expected output 1:
    3
    Test data 2:
    [2, 3, 1, 5]
    Expected output 2:
    4
    Test data 3:
    [4, 7, 8, 6]
    Expected output 2:
    5
     */

    public static int findMissingNumber(int[] arr){
        Arrays.sort(arr);
        int missingNumber = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] != 1) missingNumber = arr[i] + 1;
        }
        return missingNumber;
    }

    public static int findMissingNumber1(int[] arr) {
    // we eant to find min and max, and the range between those values is what to compare
        int len = arr.length - 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0, j = len; i <= len/2 ; i++, j--) {
            if(arr[i] < min) min = arr[i];
            if(arr[j] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
            if(arr[j] > min) max = arr[j];
        }

        //min = 1 and max = 5
        //now that we have our range, we increment min++ and check if array contains that number
        //to use contain method, we must make the array into a string

        String s = Arrays.toString(arr).replace("]", ",");//[2, 3, 5, 6,
        for (int i = min + 1; i < max; i++) {
            if(!s.contains(i + ",")) return i;
        }
        return 0;
    }
}
