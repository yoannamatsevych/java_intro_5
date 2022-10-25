package mathClass;

public class MathRandomMethod {

    public static void main(String[] args) {

        double myRandom = Math.random();
        int myRandomBetween0To10 = (int)(Math.random() * 10);
        int myDice = (int) (Math.random() * 7) + 1;

        /*
       RandomNumber * (end point - start point + 1) + start
       10 - 0 + 1
         */

//        System.out.println("Random number is = " + Math.random());
        System.out.println("Random number is = " + myRandom);
        System.out.println("Random number between 0 to 10 is = " + myRandomBetween0To10);
        System.out.println("Random dice value is = " + myDice);

        int myRandomBetween50And100 = (int)((Math.random() * (100 - 50) + 1) + 50);

        System.out.println("Random number between 0 to 10 is = " + myRandomBetween50And100);

        int myRandomNumberBetween20And40 = (int)((Math.random() * (40 - 20) + 1) + 20);

        System.out.println("\"Random number between 20 to 40 is = " + myRandomNumberBetween20And40);


        int c = (int)(Math.random() * 31 + 20);

        System.out.println(c);


    }
}
