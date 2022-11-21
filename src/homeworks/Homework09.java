package homeworks;

import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("========Task1========");

        /*
        Requirement:
        Write a program to find the first duplicated number in an int array
        It should print “There is no duplicates” if there are no duplicate
        elements.
        NOTE: Make your code dynamic that works for any given int array.
        Test data 1:
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        Expected output 1:
        0
        Test data 2:
        int[] numbers = {-8, 56, 7, 8, 65};

        Expected output 2:
        There is no duplicates
        Test data 3:
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        Expected output 2:
        3
         */

       // int[] arr1 = {-4, 0, -7, 0, 5, 10, 45, 45};
       // int[] arr1 =  {-8, 56, 7, 8, 65};
        int[] arr1 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        String duplicate1 = "";
        for (int i = 0; i < arr1.length; i++){
            if (!duplicate1.isEmpty()) break;
            for(int j = i+1; j < arr1.length; j++){
                if (arr1[i] == arr1[j]) {
                    duplicate1+= arr1[i];
                    break;
                }
            }
        }

        if (duplicate1.isEmpty()) System.out.println("There is no duplicates.");
        else System.out.println(duplicate1);

        System.out.println("========Task2========");

        /*
        Requirement:
        Write a program to find the first duplicated String in a String array, ignore
        cases. It should print “There is no duplicates” if there are no duplicate
        elements.
        NOTE: Make your code dynamic that works for any given String array.
        Test data 1:
        String[] words = {“Z”, “abc”, “z”, “123”, “#” };

        Expected output 1:
        Z
        Test data 2:
        String[] words = {“xyz”, “java”, ”abc”};

        Expected output 2:
        There is no duplicates
        Test data 3:
        String[] words = {“a”, “b”, “B”, “XYZ”, “123”};

        Expected output 2:
        b
         */

       // String[] words2 =  {"a", "b", "B", "XYZ", "123"};
        // String[] words2 = {"xyz", "java", "abc"};
        String[] words2 = {"Z", "abc", "z", "123", "#"};
        String duplicateWords2 = "";
       for (int i = 0; i < words2.length; i++){
           if (!duplicateWords2.isEmpty()) break;
           for(int j = i + 1; j < words2.length; j++){
               if (words2[i].equalsIgnoreCase(words2[j])){
                   duplicateWords2 += words2[i];
                   break;
               }
           }
       }

        if (duplicateWords2.isEmpty()) System.out.println("There is no duplicates.");
        else System.out.println(duplicateWords2);


        System.out.println("=======Task3======");
        /*
        Requirement:
        Write a program to find the all duplicates in an int array. It
        should print “There is no duplicates” if there are no
        duplicate elements.
        NOTE: Make your code dynamic that works for any given
        int array.
        Test data 1:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        Expected output 1:
        0
                -7
        Test data 2:
        int[] numbers = {1, 2, 5, 0, 7};

        Expected output 2:
        There is no duplicates
        */

        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        //int[] numbers3 = {1, 2, 5, 0, 7};
        String duplicate3 = "";
        for (int i = 0; i < numbers3.length; i++){
            for(int j = i+1; j < numbers3.length; j++){
                if (numbers3[i] == numbers3[j] && !duplicate3.contains(numbers3[i] + "")){
                    duplicate3 += numbers3[i];
                    System.out.println(numbers3[i]);
                    break;
                }
            }
        }
        if (duplicate3.isEmpty()) System.out.println("There is no duplicates.");


        System.out.println("========Task4========");

        /*
        Requirement:
        Write a program to find the all duplicates in a String array,
        ignore cases. It should print “There is no duplicates” if
        there are no duplicate elements.
                NOTE: Make your code dynamic that works for any given
        String array.
        Test data 1:
        String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”,
        “java”};

        Expected output 1:
        A
                foo
        Test data 2:
        String[] words = {“python”, “foo”, “bar”, “java”, “123” };

        Expected output 2:
        There is no duplicates
        */

        String[] words4 = {"A", "Foo", "12", "Foo", "bar", "a", "a", "java"};
        //String[] words4 = {"python", "foo", "bar", "java", "123" };
        String duplicate4 = "";
        for (int i = 0; i < words4.length; i++){
            for (int j = i + 1; j < words4.length; j++){
                if (words4[i].equalsIgnoreCase(words4[j]) &&
                        !duplicate4.toLowerCase().contains(words4[i].toLowerCase())){
                    duplicate4 += words4[i];
                    System.out.println(words4[i]);
                    break;
                }
            }
        }

        if (duplicate4.isEmpty()) System.out.println("There is no duplicates.");


        System.out.println("=========Task5=========");

        /*
        Requirement:
        Write a program to reverse elements in an array, then
        print array.
        NOTE: Make your code dynamic that works for any
        given array.
        Test data 1:
        String[] words1 = {“abc”, “foo”, “bar”};

        Expected output 1:
        [bar, foo, abc]
        Test data 2:
        String[] words2 = {“java”, “python”, “ruby”};

        Expected output 2:
        [ruby, python, java
        */
        String[] words5 = {"abc", "foo", "bar"};
        //String[] words5 = {"java", "python", "ruby"};

        String[] arr5 = new String[3];

        for (int i = words5.length-1, j = 0; i >= 0; i--, j++){
            arr5[j] = words5[i];
        }

        System.out.println(Arrays.toString(arr5));

        System.out.println("==========Task6=========");

        /*
        Requirement:
        Write a program to reverse each word in a given String
        NOTE: Make your code dynamic that works for any
        given String.
        Test data 1:
        String str = “Java is fun”;

        Expected output 1:
        avaJ si nuf
        Test data 2:
        String str = “Today is a fun day”;

        Expected output 2:
        yadoT si a nuf yad
         */

       // String str6 = "Java is fun";
        String str6 = "Today is a fun day";
        String[] arr6 = str6.trim().split(" ");
        String newStr = "";

        for (String element : arr6){
            for (int i = element.length() - 1; i >= 0; i--){
                newStr += element.charAt(i);
            }
            newStr += " ";
        }

        System.out.println(newStr.substring(0, newStr.length()-1));








    }
}
