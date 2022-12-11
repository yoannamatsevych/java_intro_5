package recursion;

public class Practice01_SumOfNumbers {

    /*
    Create a public static method called as sum
    It takes an int which is a positive number
    It returns tthe sum of numbers starting from 1 to given int
     */

    // Iterative way

    public static int sum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    // recursion way
    public static int sumRecursion1(int num){
        if (num != 0) return num + sumRecursion1(num -1);
        return 0;
    }

    public static int productRecursively(int num){
        if (num != 1) return num * productRecursively(num - 1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(sum(6));

        System.out.println(sum(6));

        System.out.println(sumRecursion1(5));
        System.out.println(sumRecursion1(5));

        System.out.println(productRecursively(5));
        System.out.println(productRecursively(6));
    }

}


