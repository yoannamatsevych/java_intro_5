package casting;

public class PrimitivesToString {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2); // 15 - primitive - number
        System.out.println("" + num1 + num2); //510 - string - text
        System.out.println(' ' + num1 + num2); // 47 - primitive - number
        System.out.println("" + (num1 + num2)); //15 - string text

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); // 510 String - text
        System.out.println(String.valueOf(23) + 5); // 235
    }
}
