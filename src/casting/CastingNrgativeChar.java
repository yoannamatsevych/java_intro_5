package casting;

public class CastingNrgativeChar {
    public static void main(String[] args) {
//
//        int negative = -65;
//
//        char myChar = (char) negative;
//
//        System.out.println(myChar);

        char upperA = 65;

        char upperZ = 90;

        System.out.println("Uppercase A = " + upperA);
        System.out.println("Uppercase Z = " + upperZ);

        char myChar0 = 'O';
        int oASCIIValue = myChar0;

        System.out.println("Uppercase 0 = " + myChar0);
        System.out.println("O ASCII value  = " + oASCIIValue);

        if (oASCIIValue >= 65 && oASCIIValue <= 90) System.out.println("Your char id=s uppercase.");
        else System.out.println("Your char is not uppercase");
    }
}
