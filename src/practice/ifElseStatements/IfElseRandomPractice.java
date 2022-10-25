package practice.ifElseStatements;

public class IfElseRandomPractice {
    public static void main(String[] args) {


        // if-else method
       int num1 = (int) (Math.random() * 51);

        System.out.println(num1);

        if (num1 >= 10 && num1 <= 25){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // just print statement
        int num2 = (int) (Math.random() * 51);
        System.out.println(num2);

        boolean a = num2 >= 10 && num2 <= 25;
        System.out.println(a);

        //!!!!ONLY FOR RETURNING "TRUE" AND "FALSE"
        System.out.println(num2 >= 10 && num2 <= 25);

        // ternary operator
        int num3 = (int) (Math.random() * 51);
        System.out.println(num3);
        String condition = num3 >= 10 && num3 <= 25 ? "true" : "false";
        System.out.println(condition);

    }
}
