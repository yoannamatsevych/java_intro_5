package first_package;

import singleton.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello W");
        System.out.println("I start to learn Java!");
        System.out.println("I like Java");


        System.out.println("Yoanna");
        System.out.println("Matsevych");

        Student student = Student.getStudent();

        System.out.println(student); // singleton.Student@7ea987ac

    }
}
