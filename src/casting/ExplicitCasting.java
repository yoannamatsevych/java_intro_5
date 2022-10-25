package casting;

public class ExplicitCasting {
    
    public static void main(String[] args) {

        //Explicit casting - narrowing - down-casting

        int age = 25;

        byte i = (byte) age;
        System.out.println(i); // 25

        //but, we will lose data if  bigger primitive holds a data that can not be stored in the small one

        int num1 = 250;

        byte num2 = (byte) num1; // it seems okay to compiler

        System.out.println(num2);

    }
}
