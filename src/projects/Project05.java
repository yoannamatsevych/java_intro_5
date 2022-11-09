package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("=========TASK-1=========");
        int[] numbers1 = {10, 7, 7, 10, -3, 10, -3};

        findGreatestAndSmallestWithSort(numbers1);

        System.out.println("\n=========TASK-2=========");
        int[] numbers2 = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(numbers2);

        System.out.println("\n==========TASK-3=========");
        int[] numbers3 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers3);

        System.out.println("\n==========TASK-4=========");
        int[] numbers4 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(numbers4);

        System.out.println("\n=========TASK-5===========");
        String[] strings5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz", "bar", "Foo"};
        findDuplicatedElementsInAnArray(strings5);

        System.out.println("\n=========TASK-6==========");
        String[] strings6 = {"pen", "eraser", "pencil", "pen", "123", "123", "123", "123", "123", "123", "abc", "pen", "eraser", "eraser", "eraser"};
        findMostRepeatedElementInAnArray(strings6);

    }

       /*
        TASK-1 - findGreatestAndSmallestWithSort() method
        Write a method that takes an int array that has at least one element. Find
        the greatest and smallest elements from the array and print them.
        Complete task using sort() method.
         */

    public static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }

        /*
        TASK-2 findGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find
        the greatest and smallest elements from the array and print them. DO NOT
        sort the array and complete task without sorting.
         */

    public static void findGreatestAndSmallest(int[] numbers) {
        int smallest = numbers[0];
        int greatest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > greatest) greatest = numbers[i];
            if (numbers[i] < smallest) smallest = numbers[i];
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

        /*
        TASK-3 - findSecondGreatestAndSmallestWithSort() method
        Write a method that takes an int array that has at least one element. Find
        the second greatest and second smallest elements from the array and print
        them. Complete task using sort() method.
         */

    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        int secondSmallest = 0;
        int secondGreatest = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > min) {
                secondSmallest = numbers[i];
                break;
            }

        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] < max) {
                secondGreatest = numbers[i];
                break;
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);

//       Arrays.sort(numbers);
//
//       int min = numbers[0];
//       int max = numbers[numbers.length-1];
//
//       for (int i = 1; i < numbers.length; i++) {
//           if (numbers[i] > min ) {
//               min = numbers[i];
//               break;
//           }
//       }
//       for (int i = numbers.length-1; i >= 0 ; i--) {
//           if (numbers[i] < max) {
//               max = numbers[i];
//               break;
//           }
//       }
//       System.out.println(max);
//       System.out.println(min);
    }

    /*
    TASK-4 - findSecondGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. DO NOT sort the array and complete task without sorting.
     */

    public static void findSecondGreatestAndSmallest(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        int secondSmallest = Integer.MAX_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondGreatest && numbers[i] != max) secondGreatest = numbers[i];
            if (numbers[i] < secondSmallest && numbers[i] != min) secondSmallest = numbers[i];

        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

    /*
    TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and
    print them.
    NOTE: It is case-sensitive!
     */

    public static void findDuplicatedElementsInAnArray(String[] strings) {
        String duplicate = "";
        if (strings.length > 1) {
            for (int i = 0; i < strings.length; i++) {
                for (int j = i + 1; j < strings.length; j++) {

                    if (strings[i].equals(strings[j]) && !duplicate.contains(strings[i] + "")) {
                        duplicate += strings[i];
                        System.out.println(strings[i]);
                    }
                }
            }
        }
    }



    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.
     */

    public static void findMostRepeatedElementInAnArray(String[] strings){
            String mostRepeatedElement = "";
            int counterMostRepeated = 0;
            int counterHowManyRepeated = 0;
            for (int i = 0; i < strings.length; i++){
                for (int j = i + 1; j < strings.length; j++){
                    if (strings[i].equals(strings[j])) counterHowManyRepeated++;

                }
                if(counterHowManyRepeated > counterMostRepeated) {
                    counterMostRepeated = counterHowManyRepeated;
                    mostRepeatedElement = strings[i];
                }
                counterHowManyRepeated =  0;

            }
        System.out.println(counterMostRepeated);
        System.out.println(mostRepeatedElement);
        System.out.println(counterHowManyRepeated);
    }
}
