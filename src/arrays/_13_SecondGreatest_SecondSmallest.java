package arrays;

public class _13_SecondGreatest_SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 1, 1, 7};
        secondGreatestSecondSmallest(numbers);

    }

    /*
    Create a public static method which will take an int array,
    and finr the second max and second min from that array and print it out
     */

    public static void secondGreatestSecondSmallest(int[] numbers){
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxNumber) maxNumber = numbers[i];
            if (numbers[i] < minNumber) minNumber = numbers[i];
        }

        System.out.println(maxNumber);
        System.out.println(minNumber);
        int secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > secondMax && numbers[i] != maxNumber) secondMax = numbers[i];
            if(numbers[i] < secondMin && numbers[i] != minNumber)  secondMin = numbers[i];
        }

        System.out.println("Second max = " + secondMax);
        System.out.println("Second min = " + secondMin);
    }


}
