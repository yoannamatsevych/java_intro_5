package string_methods;

public class _05_toUppercase_toLowercaseMethods {

    public static void main(String[] args) {

        /*
        1.return
        2. return the string
        3.non-static
        4. The one we use does not taking any arguments - there are overloaded methods
         */

        String name = "John";

        System.out.println(name.toLowerCase()); // john

        System.out.println(name.toUpperCase()); //JOHN

        System.out.println("hello".toUpperCase()); // HELLO
        System.out.println("HELLO".toLowerCase()); // hello
        System.out.println("abc".toUpperCase().toLowerCase()); //abc
        System.out.println("ab".toUpperCase().concat("XY".toUpperCase()).toLowerCase()); // abxy
        System.out.println("ab".toUpperCase().concat("XY".toUpperCase())); //ABxy


    }
}
