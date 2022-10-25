package arrays;

public class _04_CountElements_inIntArrays {

    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        negatives: 2
        positive: 5
        neutral or zero: 3

        even: 6
        odd: 4

        max: 10
        min: -7
        sum of the number: 28
        average of the numbers: 2
        how any of those numbers are represented in fibonacci sequences: 8
        how many unique numbers you have: 7
        prime number: 2
        how many numbers can be divided by 5: 6
        absolute difference bt max and min: 17
        closes number to 9(take the smallest if there are two): 8
         */

        int negatives = 0;
        for(int number : numbers){
            if (number < 0) negatives++;
        }
        System.out.println("There are " + negatives + " negative numbers in this array");

        int positives = 0;
        for(int number : numbers){
            if (number > 0) positives++;
        }
        System.out.println("There are " + positives + " positive numbers in this array.");
        /*
        Counts how many even numbers you have
        EXPECTED:
        6
        */


        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) counter++;
        }
        System.out.println(counter);

        int counter1 = 0;
        for(int number : numbers){
            if (number % 2 == 0) counter1++;
        }
        System.out.println(counter1);


    }

}
