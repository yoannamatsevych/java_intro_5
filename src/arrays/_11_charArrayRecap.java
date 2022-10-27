package arrays;

import java.util.Arrays;

public class _11_charArrayRecap {
    public static void main(String[] args) {
        // Create a charArray which will hold your name's letter both ways

        char[] charsForName = new char[6];
        System.out.println(Arrays.toString(charsForName));

        charsForName[0] = 'Y';
        charsForName[1] = 'o';
        charsForName[2] = 'a';
        charsForName[3] = 'n';
        charsForName[4] = 'n';
        charsForName[5] = 'a';
        char[] charsForName2 = {'Y', 'o', 'a', 'n', 'n', 'a'};

        System.out.println(Arrays.toString(charsForName));
        System.out.println(Arrays.toString(charsForName2));
        charsForName2[0] = 'J';
        charsForName[0] = 'J';
        System.out.println(Arrays.toString(charsForName2));
        System.out.println(Arrays.toString(charsForName2));

        charsForName[0] = 'Y';
        System.out.println("for-each loop");
        for(char charForName : charsForName){
            System.out.print(charForName);
        }

        System.out.println("\n fori loop");
        for(int i = 0; i < charsForName.length; i++){
            System.out.print(charsForName[i]);
        }

    }



}
