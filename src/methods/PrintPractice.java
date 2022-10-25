package methods;

import utilities.PrintUtils;

public class PrintPractice {
    public static void main(String[] args) {

        PrintUtils myPrinter = new PrintUtils();

        myPrinter.printHello();

        PrintUtils.printName("Vlad");
        PrintUtils.printName("Yoanna");
        PrintUtils.printName("Olena");

    }
}
