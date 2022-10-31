package homeworks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Homework07 {
    public static void main(String[] args) {


        System.out.println("==========TASK-1==========");
       /*
        Requirement:

        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list
        Expected Result:
        23
        10
        67
        [10, 23, 67, 23, 78]
        */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));

        System.out.println(numbers);

        System.out.println("\n===========TASK-2============");
        /*
        Requirement:
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple
        THEN:
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list
        Expected Result:
        Brown
        White
        Purple
        [Blue, Brown, Red, White, Black, Purple
         */
        String[] colorsInArray = {"Blue", "Brown", "Red", "White", "Black", "Purple"};

        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, colorsInArray);

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n=============TASK-3===========");

        /*
        Requirement:
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire list
        -Print the entire list sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */

       ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(numbers3);

        Collections.sort(numbers3);
        System.out.println(numbers3);

        System.out.println("\n==========TASK-4============");

        /*
        Requirement:
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        Expected Result:
        [Istanbul, Berlin, Madrid, Paris]
        [Berlin, Istanbul, Madrid, Paris]
         */

        String[] citiesInArray = {"Istanbul", "Berlin", "Madrid", "Paris"};
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, citiesInArray);
        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n============TASK-5===========");

        /*
        Requirement:
        -Create an ArrayList and store Marvel characters below
        Spider Man, Iron Man, Black Panter, Deadpool, Captain America
        THEN:
        -Print the entire list
        -Then, check if it contains Wolwerine
        if it contains Wolwerine, then print true
        if it does not contain Wolwerine, print false
        Expected Result:
        [Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
        false
         */

        ArrayList<String> marvelCharacters = new ArrayList<>
                (Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));
        System.out.println(marvelCharacters);

        System.out.println(marvelCharacters.contains("Wolwerine"));

        System.out.println("\n=============TASK-6===========");

        /*
        Requirement:
        -Create an ArrayList and store Avengers characters
        below
        Hulk, Black Widow, Captain America, Iron Man
        THEN:
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Black Widow, Captain America, Hulk, Iron Man]
        true
         */

        ArrayList<String> avengersCharacters = new ArrayList<>
                (Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);

        System.out.println(avengersCharacters.contains("Hulk") && avengersCharacters.contains("Iron Man"));

        System.out.println("\n===========TASK-7============");
        /*
        Requirement:
        -Create an ArrayList and store characters below
        A, x, $, %, 9, *, +, F, G
        THEN:
        -Print the entire list
        -Print each element
        Expected Result:
        [A, x, $, %, 9, *, +, F, G]
        A
        x
        $
        %
        9
        *
        +
        F
        G
         */

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(characters);

        for (char c : characters){
            System.out.println(c);
        }

        System.out.println("\n==========TASK-8==========");

        /*
        Requirement:
        -Create an ArrayList and store below objects
        Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        -Count objects that starts with M or m
        -Count objects that does not have A or a or E or e
        Expected Result:
        [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
        [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
                3
                1

         */

        LinkedList<String> objects = new LinkedList<>
                (Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);

        int counterM = 0;
        int counterAE = 0;

        for (String element : objects){
            if(element.toLowerCase().startsWith("m")) counterM++;
            if(!element.toLowerCase().contains("a") && !element.toLowerCase().contains("e")) counterAE++;
        }
        System.out.println(counterM);
        System.out.println(counterAE);

        System.out.println("============TASK-9==========");

        /*
        Requirement:
        -Create an ArrayList and store below kitchen objects
        Plate, spoon, fork, Knife, cup, Mixer
        THEN:
        -Print the entire list
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
        -Print how many elements starts or ends with P or p
        Expected Result:
        [Plate, spoon, fork, Knife, cup, Mixer]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 3
        Elements having P or p= 3
        Elements starting or ending with P or p = 2
         */

        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(kitchen);
        int counterUpperCase = 0;
        int counterLowerCase = 0;
        int counterHasP = 0;
        int counterStartWithEndsWithP = 0;

        for (String c : kitchen){
            if(Character.isUpperCase(c.charAt(0))) counterUpperCase++;
            if(Character.isLowerCase((c.charAt(0)))) counterLowerCase++;
            if(c.toLowerCase().contains("p")) counterHasP++;
            if(c.toLowerCase().startsWith("p") || c.toLowerCase().endsWith("p")) counterStartWithEndsWithP++;
        }

        System.out.println("Elements starts with uppercase = " + counterUpperCase);
        System.out.println("Elements starts with lowercase = " + counterLowerCase);
        System.out.println("Elements having P or p = " + counterHasP);
        System.out.println("Elements starting or ending with P or p = " + counterStartWithEndsWithP);

        System.out.println("==========TASK-10===========");

        /*
        Requirement:
        -Create an ArrayList and store below numbers
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire list
        -Print how many element can be divided by 10
        -Print how many even numbers are greater than 15
        -Print how many odd numbers are less than 20
        -Print how many elements are less than 15 or greater
        than 50
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that can be divided by 10 = 4
        Elements that are even and greater than 15 = 3
        Elements that are odd and less than 20 = 4
        Elements that are less than 15 or greater than 50 = 8
         */

        ArrayList<Integer> numbers10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(numbers10);

        int counterDivided10 = 0;
        int counterEvenAndGreater15 = 0;
        int counterOddAndLess20 = 0;
        int counterLess15Greater50 = 0;

        for (int number : numbers10){
            if (number % 10 == 0) counterDivided10++;
            if (number % 2 == 0 && number > 15) counterEvenAndGreater15++;
            if (number % 2 == 1 && number < 20) counterOddAndLess20++;
            if (number < 15 || number > 50) counterLess15Greater50++;
        }

        System.out.println("Elements that can be divided by 10 = " + counterDivided10);
        System.out.println("Elements that are even and greater than 15 = " + counterEvenAndGreater15);
        System.out.println("Elements that are odd and less than 20 = " + counterOddAndLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + counterLess15Greater50);

    }
}
