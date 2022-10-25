package mathClass;

public class MinAndMaxMethods {
    public static void main(String[] args) {

        int maxNumber = Math.max(80, 27);

        int maxNumber2 = Math.max(maxNumber, 125);

        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("MaxNumber2 = " + maxNumber2);
        System.out.println("MaxNumber3 = " + maxNumber3);

//        int maxNumber = Math.max (80, 27);

        int maxNumber6 = Math.max (Math.max (80, 27), 2);

//        System.out.println("\nmaxNumber = " + maxNumber);
        System.out.println("maxNumber2 = " +maxNumber6);

        int maxOfTwoNag = Math.max (-40, -60);

        System.out.println("maxOfTWoNum = " + maxOfTwoNag);

        //infinite, ........, - 10, -9......-1, 0, 1 ......9, 10....80....infinite

        double maxOfTwoDecimals = Math.max(1.7, 6.5);

        System.out.println("MaxOfTwoDecimals = " + maxOfTwoDecimals);

        double maxOfTwoDecimalsNegative = Math.max(-5.4, -27.2);
        System.out.println("MaxOfTwoDecimalsNeg = " + maxOfTwoDecimalsNegative);

        int maxOfNumbers1 = Math.max (6, 9);
        int maxOfNumbers2 = Math.max (17, 49);
        double maxOfNumbers3 = Math.max (34.2, 12.5);
        int maxOfNumbers4 = Math.max (-14, -32);
        int maxOf3Numbers1 = Math.max (17, 49);
        int maxOf3Numbers2 = Math.max(maxOf3Numbers1, 125);

        System.out.println("maxOfNumbers1 = " + Math.max (6, 9));
        System.out.println("maxOfNumbers2 = " + maxOfNumbers2);
        System.out.println("maxOfNumbers3 = " + maxOfNumbers3);
        System.out.println("maxOfNumbers4 = " + maxOfNumbers4);
        System.out.println("maxOf3Numbers = " + Math.max(Math.max (17, 49), 125));
        System.out.println("max is:" + Math.max(Math.max(25, 125), 625));

        System.out.println("\n=======TASK========");
        System.out.println("min is " + Math.min(6, 9));
        System.out.println("min is " + Math.min(17, 49));
        System.out.println("min is " + Math.min(34.2, 12.5));
        System.out.println("min is " + Math.min(-14, -32));
        System.out.println("min is " + Math.min(Math.min(17, 49), 125));
        System.out.println("min is " + Math.min(Math.min(Math.min(45, 32), 56), 89));








    }
}
