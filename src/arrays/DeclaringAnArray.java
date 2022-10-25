package arrays;

public class DeclaringAnArray {
    public static void main(String[] args) {

        //Declare an array
        String countries[];//its work
        int[] numbers;
        char[] characters;
        double[] doubles;
        boolean[] booleans;

        //Initialization or Assignment with size only;

        countries = new String [3];
        numbers = new int [5];
        characters = new char [4];
        doubles = new double [4];
        booleans = new boolean[4];

        System.out.println(countries[0]); // null
        System.out.println(numbers[1]); // 0 - default for byte, short, int, long
        System.out.println(characters[2]);// nothing
        System.out.println(doubles[1]); // 0.0
        System.out.println(booleans[1]); // false

    }


}
