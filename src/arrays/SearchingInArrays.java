package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers ={3, 5, 8, 10};

        // Search for 7 and return true if it exists in this array, return false otherwise
        boolean has7 = false;

        for (int number : numbers){
            if (number == 7){
                has7 = true;
                break;
            }
        }

        System.out.println(has7); // false

        //Search for 5 and return true if it exists in this array, return false otherwise -> true

        boolean has5 = false;

        for(int number : numbers){
            if(number == 5){
                has5 = true;
                break;
            }
        }
        System.out.println(has5);

        System.out.println("\n============Binary search in arrays========\n");

        //NOTE: Binary search can be used if the array is sorted ONLY, otherwise you will get wrong result
        //Returns index of the element if found

        Arrays.sort(numbers);
        // 3, 5, 8, 10
        // if the index returns is 0 or positive it is means  the element exists
        // but if index is negative - element is not exists
        // if two elements exist than the method returns the last index
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 7)); //-something
    }
}
