package arrays;

public class _08_FindFirstEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        printFirstEvenAndOdd(numbers);
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

        for (int n : args){
            if (!isEvenFound && n % 2 == 0) { // if first even not found and the number is even
                fEven = n;
                isEvenFound = true; // marking flag as true so next time you will even has found
            } else if (!isOddFound && n % 2 == 1) { // if first odd not found and the number is odd
                fOdd = n;
                isOddFound = true; // maring flag as true so next time you will know odd has found
            }
            }
        System.out.println((isEvenFound) ? "First even = " + fEven : "There is no even in this array");
        System.out.println((isOddFound) ? "First odd = " + fOdd : "There is no odd in this array");

            }
    }


