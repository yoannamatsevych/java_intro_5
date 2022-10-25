package practice.ifElseStatements;

public class IfElsePractice {
    public static void main(String[] args) {

        int myInt = -49;

        if (myInt >= 0 && myInt <= 24){
            System.out.println("first quarter");
        }
        else if (myInt >= 25 && myInt <= 49){
            System.out.println("second quarter");
        }
        else if (myInt >= 50 && myInt <= 74){
            System.out.println("third quarter");
        }
        else {
            System.out.println("This number is out of scope");
        }

        if (myInt >= -50 && myInt < 0){
            System.out.println("number is in negative part");
        }
        else if (myInt == 0){
            System.out.println("number is zero");
        }
        else if (myInt > 0 && myInt <= 50){
            System.out.println("number is in positive part");
        }
        else {
            System.out.println("This number is out of scope");
        }

        if (myInt == 0){
            System.out.println("number is zero");
        }
        else {
            if (myInt > 0){
                System.out.println("number is in positive part");
            }
            else if (myInt < 0){
                System.out.println("number is in negative part");
            }
        }



    }
}
