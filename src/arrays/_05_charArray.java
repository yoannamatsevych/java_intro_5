package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

        System.out.println("\n===========TASK-1=========\n");
/*
TASK-1
Create a char array and store values below
#
$
5
A
b
H

Print the array

EXPECTED:
[#, $, 5, A, b, H]
 */
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n==========TASK-2===========\n");
        /*
TASK-2
Print the size of the array with a message

EXPECTED:
The size of the array is = 6
 */


        System.out.println("The size of the array is = " + characters.length);

        System.out.println("\n=============TASK-3==========\n");

        for (int i = 0; i < characters.length; i++){
            System.out.println(characters[i]);
        }

        System.out.println("\n============TASK-4=========\n");

        for(char element : characters){
            System.out.println(element);
        }

        System.out.println("\n============TASK-5==========");
        /*
TASK-5
Print each element that are letters

EXPECTED:
A
b
H
 */
        System.out.println("\n============for-i loop==========");
        for(int i = 0; i < characters.length; i++){
          if (Character.isLetter(characters[i])) System.out.println(characters[i]);
        }

        System.out.println("\n===========for-each loop===========");
        for (char c : characters){
            if (Character.isLetter(c)) System.out.println(c);
        }

        System.out.println("\n========TASK-6===========");

/*
TASK-6
Count how many uppercase characters you have in the array

EXPECTED:
2
 */

        System.out.println("\n=========for-each loop=========");
        int counter1 = 0;
        for (char c : characters){
            if(Character.isUpperCase(c)) counter1++;
        }
        System.out.println(counter1);

        System.out.println("\n===========for-i loop==========");

        int counter2 = 0;

        for (int i = 0; i < characters.length; i++){
            if(Character.isUpperCase(characters[i])) counter2++;
        }
        System.out.println(counter2);


        /*

         */
    }
    }

