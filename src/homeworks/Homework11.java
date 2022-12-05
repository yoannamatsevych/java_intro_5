package homeworks;

import java.util.Arrays;
import java.util.Calendar;
import java.util.jar.JarOutputStream;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("==========TASK-1==========");
        String str1_1 = "";
        System.out.println(noSpace(str1_1));
        String str1_2 = "Java";
        System.out.println(noSpace(str1_2));
        String str1_3 = "    Hello    ";
        System.out.println(noSpace(str1_3));
        String str1_4 = "Tech Global";
        System.out.println(noSpace(str1_4));
        String str1_5 = " Hello World  ";
        System.out.println(noSpace(str1_5));

        System.out.println("=========TASK-2=========");
        String str2_1 =  "";
        System.out.println(replaceFirstLast(str2_1));
        String str2_2 = "A";
        System.out.println(replaceFirstLast(str2_2));
        String str2_3 = "    A       ";
        System.out.println(replaceFirstLast(str2_3));
        String str2_4 = "Hello";
        System.out.println(replaceFirstLast(str2_4));
        String str2_5 = "Tech Global";
        System.out.println(replaceFirstLast(str2_5));

        System.out.println("=========TASK-3=======");
        String str3_1 = "";
        System.out.println(hasVowel(str3_1));
        String str3_2 = "Java";
        System.out.println(hasVowel(str3_2));
        String str3_3 = "1234";
        System.out.println(hasVowel(str3_3));
        String str3_4 = "ABC";
        System.out.println(hasVowel(str3_4));

        System.out.println("==========TASK-4==========");
        checkAge(2010);
        checkAge(2006);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);

        System.out.println("==========TASK-5=========");
        int n1_1 = 0, n1_2 = 0, n1_3 = 0;
        System.out.println(averageOfEdges(n1_1, n1_2, n1_3));
        int n2_1 = 0, n2_2 = 0, n2_3 = 6;
        System.out.println(averageOfEdges(n2_1, n2_2, n2_3));
        int n3_1 = -2, n3_2 = -2, n3_3 = 10;
        System.out.println(averageOfEdges(n3_1, n3_2, n3_3));
        int n4_1 = -3, n4_2  = 15, n4_3 = -3;
        System.out.println(averageOfEdges(n4_1, n4_2, n4_3));
        int n5_1 = 10, n5_2 = 13, n5_3 = 20;
        System.out.println(averageOfEdges(n5_1, n5_2, n5_3));

        System.out.println("==========TASK-6===========");
        String[] elements1 = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(elements1)));
        String[] elements2 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(elements2)));
        String[] elements3 = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(elements3)));

        System.out.println("============TASK-7===========");
        int[] arr7_1 = {7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(arr7_1)));
        int[] arr7_2 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(arr7_2)));
        int[] arr7_3 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(arr7_3)));

        System.out.println("===========TASK-8===========");
        int[] arr8_1 = {-10, -3, 0, 1};
        System.out.println(countPrimes(arr8_1));
        int[] arr8_2 = {7, 4, 11, 23, 17};
        System.out.println(countPrimes(arr8_2));
        int[] arr8_3 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(arr8_3));

    }


    /*TASK-1
    Requirement:
    -Create a method called noSpace()
    -This method will take one String argument and it will
    return a new String with all spaces removed from the
    original String
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “Java”
    Expected Result 2: “Java”
    Test Data 3: “    Hello    ”
    Expected Result 3: “Hello”
    Test Data 4: “ Hello World   ”
    Expected Result 4: “HelloWorld”
    Test Data 5: “Tech Global”
    Expected Result 5: “TechGlobal”
     */
    public static String noSpace(String str){
        return str.replace(" ", "");
    }

    /*TASK-2
    Requirement:
    -Create a method called replaceFirstLast()
    -This method will take one String argument and it will return a new
    String with first and last characters replaced
    NOTE: if the length is less than 2, then return empty String
    NOTE: Ignore all before and after spaces (get actual String only)
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “A”
    Expected Result 2: “”
    Test Data 3: “    A       ”
    Expected Result 3: “”
    Test Data 4: “Hello”
    Expected Result 4: “oellH”
    Test Data 5: “Tech Global”
    Expected Result 5: “lech GlobaT”
     */

    public static String replaceFirstLast(String str){
        str = str.trim();
        if (str.length() < 2) return "";
        return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0,1);
    }

    /*TASK-3
    Requirement:
    -Create a method called hasVowel()
    -This method will take one String argument and it will return a
    boolean checking if String has any vowel or not
    NOTE: Vowels are = a, e, o, u, I
    NOTE: Ignore cases
    Test Data 1: “”
    Expected Result 1: false
    Test Data 2: “Java”
    Expected Result 2: true
    Test Data 3: “1234”
    Expected Result 3: false
    Test Data 4: “ABC”
    Expected Result 4: true
     */
    public static boolean hasVowel(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'i') return true;
        }
        return false;
    }

    /*TASK-4
    Requirement:
    -Create a method called checkAge()
    -This method will take an int yearOfBirth as  argument and it will print
    message below based on the entry
    If the age is less than 16, then print “AGE IS NOT ALLOWED”
    If the age is 16 or more, then print “AGE IS ALLOWED”
    If the age is more than 100 or a future year entered, print “AGE IS NOT
    VALID”
    NOTE: Calculate the age taking base year as current year in a dynamic
    way. You can use Date class.
    Test Data 1: 2010
    Expected Result 1: AGE IS NOT ALLOWED
    Test Data 2: 2006
    Expected Result 2: AGE IS ALLOWED
    Test Data 3: 2050
    Expected Result 3: AGE IS NOT VALID
    Test Data 4: 1920
    Expected Result 4: AGE IS NOT VALID
    Test Data 5: 1800
    Expected Result 5: AGE IS NOT VALID
     */
    public static void checkAge(int yearOfBirth){
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        if ((currentYear - yearOfBirth) > 100 || (currentYear - yearOfBirth) < 0) System.out.println("AGE IS NOT VALID");
        else if ((currentYear - yearOfBirth) < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");

    }

    /*TASK-5
    Requirement:
    -Create a method called averageOfEdges()
    -This method will take three int arguments and it will return
    average of min and max numbers
    Test Data 1: 0, 0 ,0
    Expected Result 1: 0
    Test Data 2: 0, 0, 6
    Expected Result 2: 3
    Test Data 3: -2, -2, 10
    Expected Result 3: 4
    Test Data 4: -3, 15, -3
    Expected Result 4: 6
    Test Data 4: 10, 13, 20
    Expected Result 4: 15
     */
    public static  int averageOfEdges(int n1, int n2, int n3){
       return (Math.max(Math.max(n1, n2), n3) + Math.min(Math.min(n1, n2), n3)) / 2;
    }
    /*TASK-6
    Requirement:
    -Create a method called noA()
    -This method will take a String array argument and it
    will return a new array with all elements starting with A
    or a replaced with “###”
    NOTE: Assume length will always be more than zero
    NOTE: Ignore cases
    Test Data 1: [“java”, “hello”, “123”, “xyz”]
    Expected Result 1: [“java”, “hello”, “123”, “xyz”]
    Test Data 2: [“appium”, “123”, “ABC”, “java”]
    Expected Result 2: [“###”, “123”, “###”, “java”]
    Test Data 3: [“apple”, “appium”, “ABC”, “Alex”, “A”]
    Expected Result 3: [“###”, “###”, “###”, “###”,
    “###”]
     */

    //WHY IT does not work with for-each loop
    public static String[] noA(String[] elements){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].toLowerCase().startsWith("a")) elements[i] = "###";
        }
        return elements;
    }

    /*TASK-7
    Requirement:
    -Create a method called no3or5()
    -This method will take an int array argument and it will
    return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with
    101
    NOTE: Assume length will always be more than zero
    Test Data 1: [7, 4, 11, 23, 17]
    Expected Result 1: [7, 4, 11, 23, 17]
    Test Data 2: [3, 4, 5, 6]
    Expected Result 2: [100, 4, 99, 100]
    Test Data 3: [10, 11, 12, 13, 14, 15]
    Expected Result 3:  [99, 11, 100, 13, 14, 101]
     */
    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 15 == 0) arr[i] = 101;
            else if(arr[i] % 3 == 0) arr[i] = 100;
            else if(arr[i] % 5 == 0) arr[i] = 99;
        }
        return arr;
    }

    /*TASK-8
    Requirement:
    -Create a method called countPrimes()
    -This method will take an int array argument and it will return
    how many elements in the array are prime numbers
    NOTE: Prime number is a number that can be divided only by 1
    and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2
    Test Data 1: [-10, -3, 0, 1]
    Expected Result 1: 0
    Test Data 2: [7, 4, 11, 23, 17]
    Expected Result 2: 4
    Test Data 3: [41, 53, 19, 47, 67]
    Expected Result 3:  5
     */
    public static int countPrimes(int[] arr){
        int prime = 0;
        boolean isNotPrime = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >=2){
                for (int j = 2; j < arr[i]; j++) {
                    if(arr[i] % j == 0) {
                        isNotPrime = true;
                        break;
                    }
                }
                if(!isNotPrime) prime++;
                isNotPrime = false;
            }
        }
        return prime;
    }

}
