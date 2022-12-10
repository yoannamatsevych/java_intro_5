package exception_handling.multiple_catch_blocks;

public class MultipleCatch_practice {

    public static void main(String[] args) {

        String name = null;
        int age = 25;

        /*
        Get the first character from the name and pront it
        Divide the age by 0 and print it
        Print {name}'s age is {age}.
        null's age is 25.
         */
        try {
            System.out.println(name.charAt(0));
            System.out.println(age / 0);
        } catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        } catch (ArithmeticException arithmeticException){
           arithmeticException.printStackTrace();
       }

        System.out.println(name + "'s age is " + age + ".");



    }

}
