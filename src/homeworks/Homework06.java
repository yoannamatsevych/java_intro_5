package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        /*
        Requirement:
        -Create an int array having size of 10
        -Assign 23 to index of 2
        -Assign 12 to index of 4
        -Assign 34 to index of 7
        -Assign 7 to index of 9
        -Assign 15 to index of 6
        -Assign 89 to index of 0
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 9
        -Print the entire array
        Expected Result:
        0
        89
        7
        [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
         */
        System.out.println("\n==========TASK-1=============");

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n===========TASK-2===========");

       /* Requirement:
        -Create a String array having size of 5
                -Assign “abc” to index of 1
                -Assign “xyz” to index of 4
        THEN:
        -Print element at index of 3
                -Print element at index of 0
                -Print element at index of 4
                -Print the entire array
        Expected Result:
        null
        null
        xyz
                [null, abc, null, null, xyz]
         */

        String[] strings = new String[5];
        strings[1] = "abc";
        strings[4] = "xyz";

        System.out.println(strings[3]);
        System.out.println(strings[0]);
        System.out.println(strings[4]);
        System.out.println(Arrays.toString(strings));

        System.out.println("\n===========TASK-3==========");

        /*Requirement:
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */

        int[] nums = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("\n========TASK-4=========");

        /*
        Requirement:
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania
        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically
        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine]
         */

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("==========TASK-5===========");
        /*
        Requirement:
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
        THEN:
        -Print the entire array
        -Then, check if it contains Pluto
        if it contains Pluto, then print true
        if it does not contain Pluto, print false
        Expected Result:
        [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
         */
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));
        //for-each loop
        boolean isPluto = false;
        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto"))
                isPluto = true;


        }
        System.out.println(isPluto);
        // METHOD
        Arrays.sort(cartoonDogs);
        System.out.println(Arrays.binarySearch(cartoonDogs, "Pluto") >= 0);

        System.out.println("\n=========TASK-6==========");

      /*  Requirement:
        -Create a String array that stores cartoon cats
                below
        Garfield, Tom, Sylvester, Azrael
        THEN:
        -Print the entire array sorted lexicographically
                -Then, check if it contains Garfield and Felix
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false
       */

        //for-each loop
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        boolean isGarfield = false;
        boolean isFelix = false;
        for (String cartoonCat : cartoonCats) {
            if (cartoonCat.equals("Garfield"))  isGarfield = true;
            if (cartoonCat.equals("Felix")) isFelix = true;

        }
        System.out.println(isFelix && isGarfield);

        //METHOD
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.binarySearch(cartoonCats, "Garfield") >= 0
                && Arrays.binarySearch(cartoonCats, "Felix") >= 0);

        System.out.println("\n============TASK-7===========");

       /* Requirement:
        -Create a double array that stores numbers below
        10.5, 20.75, 70, 80, 15.75
        THEN:
        -Print the entire array
        -Print each element
        Expected Result:
        [10.5, 20.75, 70.0, 80.0, 15.75]
        10.5
        20.75
        70
        80
        15.75
        */

        double[] numbers2 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbers2));
        for (double number2 : numbers2) {
            System.out.println(number2);
        }

        System.out.println("\n=========TASK-8=========");

       /* Requirement:
        -Create a char array that stores characters below
        A, b, G, H, 7, 5, &, *, e, @, 4
        THEN:
        -Print the entire array
        -Print the total count of the letters
        -Print the total count of lowercase letters
        -Print the total count of uppercase letters
        -Print the total count of digits
        -Print the total count of special characters
        Expected Result:
        [A, b, G, H, 7, 5, &, *, e, @, 4]
        Letters = 5
        Uppercase letters = 3
        Lowercase letters = 2
        Digits = 3
        Special characters = 3
        */

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));
        int countLetters = 0;
        int countUppercase = 0;
        int countLowercase = 0;
        int countDigit = 0;
        int countSpecials = 0;
        for (char character : characters) {
            if (Character.isLetter(character)) {
                countLetters++;
                if (Character.isUpperCase(character)) countUppercase++;
                else countLowercase++;
            } else if (Character.isDigit(character)) countDigit++;
            else if (character != ' ') countSpecials++;
        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUppercase);
        System.out.println("Lowercase letters = " + countLowercase);
        System.out.println("Digits = " + countDigit);
        System.out.println("Special characters = " + countSpecials);

        System.out.println("\n============TASK-9============");

       /* Requirement:
        -Create a String array that stores objects below
         Pen, notebook, Book, paper, bag, pencil, Ruler
        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring
        cases
        Expected Result:
        [Pen, notebook, Book, paper, bag, pencil, Ruler]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 4
        Elements starting with B or P = 5
        */
        int counterUppercase = 0;
        int counterLowercase = 0;
        int counterStartWith = 0;
        String[] words = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) counterUppercase++;
            if (Character.isLowerCase(word.charAt(0))) counterLowercase++;
            if (word.toUpperCase().charAt(0) == 'B' || word.toUpperCase().charAt(0) == 'P') counterStartWith++;
        }

        System.out.println(Arrays.toString(words));
        System.out.println("Elements starts with uppercase = " + counterUppercase);
        System.out.println("Elements starts with lowercase = " + counterLowercase);
        System.out.println("Elements starting with B or P = " + counterStartWith);

        System.out.println("\n===========TASK-10============");

       /* Requirement:
        -Create an int array that stores numbers below
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire array
        -Print how many elements are more than 10
        -Print how many elements are less than 10
        -Print how many elements are 10
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that are more than 10 = 5
        Elements that are less than 10 = 4
        Elements that are 10 = 2
        */

        int[] numbers3 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int counterMore10 = 0;
        int counterLess10 = 0;
        int counter10 = 0;

        for(int number3 : numbers3){
            if (number3 > 10) counterMore10++;
            else if (number3 < 10) counterLess10++;
            else counter10++;
        }
        System.out.println(Arrays.toString(numbers3));
        System.out.println("Elements that are more than 10 = " + counterMore10);
        System.out.println("Elements that are less than 10 = " + counterLess10);
        System.out.println("Elements that are 10 = " + counter10);

        System.out.println("\n===========TASK-11============");

        /*
        Requirement:
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
        THEN:
        -Print both arrays
        –Then, create a new array called that will take
        greatest of same index from first 2 arrays
        -Print third array as well
        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
         */

        int[] numbers01 = {5, 8, 13, 1, 2};
        int[] numbers02 = {9, 3, 67, 1, 0};
        int[] numbers03 = new int[numbers01.length];
        System.out.println(Arrays.toString(numbers01));
        System.out.println(Arrays.toString(numbers02));
        for(int i = 0; i < numbers01.length; i++){
          numbers03[i] = Math.max(numbers01[i], numbers02[i]);
        }
        System.out.println(Arrays.toString(numbers03));



    }
    }

