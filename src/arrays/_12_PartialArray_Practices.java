package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {
        int[] numbers = {10, -3, 7, 1, 22};
        System.out.println(returnSumOfFirstThree(numbers));
        System.out.println(findSumOfLastFive(numbers));
    }

    /*
    Create public static method which will take int take int[]
    he it will get the sum of first 3 elements and return ut
     */

    public static  int returnSumOfFirstThree(int[] numbers){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += numbers[i];
        }

        return sum;

    }

        /*
    Create public static method which will take int take int[]
    he it will get the sum of last 5 elements and return ut
     */



    public static  int findSumOfLastFive(int[] numbers){
        int sum = 0;
        for (int i = numbers.length - 1; i > numbers.length - 6; i--){
            sum += numbers[i];
        }
        return sum;

    }



    }


