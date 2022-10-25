package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {

        System.out.println(ReturnMethodPractices.findDifference(6, 9));
        System.out.println(ReturnMethodPractices.findDifference(4, 1));
        System.out.println(ReturnMethodPractices.findDifference(99, 23));

        System.out.println(findDifference(99.9, 66.9));

        System.out.println(ReturnMethodPractices.isIncluded("John", "John Doe"));
        System.out.println(ReturnMethodPractices.isIncluded("John Doe", "John"));
        System.out.println(ReturnMethodPractices.isIncluded("John", "Doe"));

    }
    /*
Create public static method named as "findDifference", it will take two values and returns the difference

Example:
6, 9 -> 3;
4, 1 -> 3;
99, 23 -> 76;
     */

    public static int findDifference (int a, int b){
       return Math.abs(a - b);
    }

       /*
Create public static method named as "findDifference", it will take two decimal and returns the difference

Example:
6, 9 -> 3;
4, 1 -> 3;
99, 23 -> 76;
     */

    public static double findDifference (double a, double b){
        return Math.abs(a - b);

    }

    /*
    Create public static method as "isIncluded" which tales two String values, and returns true
    if the small string inside the other one

    Example:
    "John", "John Doe" -> true
    "green, blue, red", "blue" -> true
    "John", "blue" -> false
     */

    public static boolean isIncluded (String str1, String str2) {
        return str1.contains(str2) || str2.contains(str1);
//        if (str1.length() > str2.length()) return str1.contains(str2);
//        return str2.contains(str1);


    }
    }


