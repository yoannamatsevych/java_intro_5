package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns the boolean
        3. non-static
        4.There is overloaded methods, but we will use always with single arguments

         */

        String s = "TechGlobal";
        System.out.println(s.startsWith("T"));//true
        System.out.println(s.startsWith("t"));//false
        System.out.println(s.startsWith("Tech"));//true

        System.out.println(s.endsWith("Global"));//true

        // IMPORTANT

        String city = "Chicago";

        System.out.println(city.startsWith("Chicago"));//true
        System.out.println(city.startsWith(city));//true
        System.out.println(city.startsWith(""));//true
        System.out.println(city.endsWith(""));//true

        System.out.println(city.startsWith("M"));//false
        System.out.println(city.endsWith("lin"));//false
        System.out.println(city.endsWith("Ch"));




    }
}
