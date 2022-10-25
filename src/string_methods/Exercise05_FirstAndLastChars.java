package string_methods;

import utilities.ScannerHelper;



public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {

       String name = ScannerHelper.getAName();
        System.out.println("First character in the name is =" + name.charAt(0));
        System.out.println("First character in the name is =" + name.charAt(name.length()-1));

    }
}
