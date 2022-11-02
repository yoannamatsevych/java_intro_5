package string_methods;

public class _07_indexOf_lastIndexOf_Methods {

    public static void main(String[] args) {
/*
1. return method
2. returns int which matching index
3. non-static
4. It takes the char and String - this is two overloading methods

 */
        String company = "TechGlobal school";

        int firstIndexOfO = company.indexOf('o'); // 6
        int lastIndexOfO = company.lastIndexOf('o'); //15
        System.out.println(firstIndexOfO);
        System.out.println(lastIndexOfO);

        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf('x')); // -1

        System.out.println(company.indexOf("School")); // 11





    }


}
