package casting;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Exercise4 {
    public static void main(String[] args) {

        //true false   -> "true" "false"

        System.out.println(true && false); //false
        // System.out.println("true" && "false"); //compiler error

        System.out.println(String.valueOf(true) + String.valueOf(false)); //truefalse
        System.out.println("" + true + false); //truefalse

        System.out.println(String.valueOf('A') + 'a'); //Aa

        System.out.println("" + 10.5 + 5); //10.55
        System.out.println('A' + 'A');


    }
}
