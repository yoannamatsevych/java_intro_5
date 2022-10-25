package string_methods;

public class _10_substring_Methods {
    public static void main(String[] args) {

        /*
        1. returns method
        2. return a String
        3. non-static
        4. it is overloaded
        5 takes one or 2 int index
         */

        String s = "TechGlobal";

        //get Global
        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1);

        System.out.println(s.substring(0, 4));



    }
}
