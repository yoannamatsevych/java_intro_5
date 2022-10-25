package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractices {

    public static void main(String[] args) {

        int ran1 = RandomNumberGenerator.getARandomNumber(5, 15);
        int ran2 = RandomNumberGenerator.getARandomNumber(3, 10);
        int ran3 = RandomNumberGenerator.getARandomNumber(50, 55);
        int ran4 = RandomNumberGenerator.getARandomNumber(6, 63);
        int ran5 = RandomNumberGenerator.getARandomNumber(100, 113);

        System.out.println("Number 1 = " + ran1);
        System.out.println("Number 2 = " + ran2);
        System.out.println("Number 3 = " + ran3);
        System.out.println("Number 4 = " + ran4);
        System.out.println("Number 5 = " + ran5);

        System.out.println("The average is = " + (ran1 + ran2 + ran3 + ran3 + ran4 + ran5) / 5);

    }
}
