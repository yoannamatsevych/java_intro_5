package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {

        /*
        1. return
        2. return a char at given index
        3.non-static
        4. It takes one index in this
         */

        String sentence = "Java is fun";

        char c1 = sentence.charAt(3);// 'a'
        char c2 = sentence.charAt(4); // ' ' space

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(sentence.charAt(9)); // 9

        // NOTE: Runtime error - StringIndexOutOfBoundsException
//        System.out.println(sentence.charAt(-5));
//        System.out.println(sentence.charAt(50));

        //System.out.println(sentence.charAt(1).toUpperCase()); // NOT POSSIBLE - compiler error
        // because toUpperCase() method cannot be invoked with the characters

    }
}
