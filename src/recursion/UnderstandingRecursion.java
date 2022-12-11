package recursion;

public class UnderstandingRecursion {


    public static void print(){
        System.out.println("Hello");
        print();
    }

    //Create a method that print number from 1 to given number - iterative way

    public static void printNumber(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void printNumberRecursively(int num){
        if (num == 0) return;
        printNumberRecursively(num-1);
    }



    public static void main(String[] args) {
      //  print(); // StackOverFlowError

        printNumber(7);
    }
}
