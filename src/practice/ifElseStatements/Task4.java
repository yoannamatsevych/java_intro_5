package practice.ifElseStatements;

public class Task4 {
    public static void main(String[] args) {

        char char1 = 0;

        if (char1 >= 48 && char1 <= 57){
            System.out.println("Character is the digit");
        }
        else if (char1 >= 65 && char1 <= 90 || char1 >=97 && char1 <=122){
            System.out.println("Characters is the letter");
        }

        String a = "65";
        int b = Integer.parseInt(a);
        char c = (char) b;


        System.out.println("String " + c);
    }
}
