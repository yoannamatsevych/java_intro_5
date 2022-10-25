package casting;

import practice.methods.VoidMethodPractices;

public class castingChars {
    public static void main(String[] args) {

        int i1 = 65;

        System.out.println(i1); //65

        char c1 = (char) i1;

        System.out.println(c1); // A

        System.out.println(51); // 51

        System.out.println((char) 51); //3
        System.out.println((char) 123); // {
        System.out.println((char) 32); // ( )
        System.out.println((char) 1024);

        char char1 = 'A';
        char char2 = 97; // 'a'

        System.out.println(char1 + char2 + 3 ); // 65 + 97 -> 162 + 3 -> 165
        System.out.println("" + char1 + char2); //Aa
        System.out.println("" + (char1 + char2) + 3); // 162(String) -> 1623
        System.out.println(char1 + char2 + ""); // 162(String)
        System.out.println(char1 + ""+ char2); // Aa
     }
}
