package operators.shorthand_assignment_operators;

public class UnderstandingShorthandAssignmentOperators {
    public static void main(String[] args) {
        int age = 10;

        System.out.println(age);

        // What will be the age 5 years later

        age += 5; // age = age + 5;

        System.out.println(age);

        /*
        TASK2
         */
        int num1 = 50;
        System.out.println(num1 %= 12); // num1 = num1 % 12

    }
}
