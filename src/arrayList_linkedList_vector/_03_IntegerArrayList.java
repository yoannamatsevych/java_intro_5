package arrayList_linkedList_vector;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {

        /*
        Create an arrayLIst to store below numbers
        10
        15
        20
        10
        20
        30

        Print the ArrayList
        print the size
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList = " + numbers);
        System.out.println("The size of ArrayList = " + numbers.size());

      //  numbers.remove(10);//
        numbers.remove((Integer) 10);
        numbers.remove((Integer) 10);
        System.out.println(numbers);

        while(numbers.contains(10)){
            numbers.remove((Integer) 10);
        }
        System.out.println(numbers);

        System.out.println("\n=======contains method=========");
        System.out.println(numbers.contains(10));
        System.out.println(numbers.contains(12));
        System.out.println(numbers.contains(20));
        System.out.println(numbers.contains(22));

        System.out.println(numbers.get(0) == numbers.get(3));

        System.out.println("\n=======indexOf() method=========");
        System.out.println(numbers.indexOf(15)); //1
        System.out.println(numbers.indexOf(25)); //-1
        System.out.println(numbers.indexOf(20)); // 2

        System.out.println("\n=======indexOf() method=========");

        System.out.println(numbers.lastIndexOf(30)); //3
        System.out.println(numbers.lastIndexOf(35)); //-1
        System.out.println(numbers.lastIndexOf(20)); // 2

        System.out.println("\n========Retrieving each element with fori loop ");

        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n========Retrieving each element with for each loop ");
        for (Integer number : numbers){
            System.out.println(number);
        }



    }
}
