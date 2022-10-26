package arrays;

public class _08_FindFirstEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        printFirstEvenAndOdd(numbers);

        String[] elements = {"b", "abcd", "123", "!@#"};



    }

    /*
    Create a public static method which will take an int array and then it will
    print out out the first even and first odd number

    Example:

    - array = {0, 5, 3, 2, 4, 7, 10}

    First odd = 5
    First even = 0
     */

    public static void printFirstEvenAndOdd(int[] args) {

        int fEven = 0, fOdd = 0;
        boolean isEvenFound = false, isOddFound = false;

        for (int n : args) {
            if (!isEvenFound && n % 2 == 0) { // if first even not found and the number is even
                fEven = n;
                isEvenFound = true; // marking flag as true so next time you will even has found
            } else if (!isOddFound && n % 2 == 1) { // if first odd not found and the number is odd
                fOdd = n;
                isOddFound = true; // marking flag as true so next time you will know odd has found
            }
        }
        System.out.println((isEvenFound) ? "First even = " + fEven : "There is no even in this array");
        System.out.println((isOddFound) ? "First odd = " + fOdd : "There is no odd in this array");
    }
                /*
        Create a public static method which will take a String array then it will
        print out the first String starting with "a", NOT CASE SENSITIVE
        If there is not a String which is starting with "a" print -> 'No String starting with "a"'

        Example1:
        - array =  {"ABCD", "abcd", "123", "!@#"}

        Output1:
            First string with "a" = "ABCD"

        Example2:
        - array =  {"abcd", "123", "!@#"}

        Output2:
            First string with "a" = "abcd"

        Example3:
        - array =  {"123", "!@#"}

        Output3:
            No String starting with "a"
         */


    // With flag
             public static void findAnA1 (String[] strings){
            boolean isAFound = false;
            for(String s : strings) {
                if (s.toLowerCase().startsWith("a") && !isAFound)
                    System.out.println(s);
                isAFound = true;

            }
            if (!isAFound) System.out.println("No String starting with \"a\"");


    }

}



