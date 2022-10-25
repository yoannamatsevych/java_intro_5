package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\n===========TASK-1==========\n");

        String s1 = "24", s2 = "5";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("The sum of " + i1 + " and " + i2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + i1 + " and " + i2 + " = " + (i1 - i2));
        System.out.println("The division of " + i1 + " and " + i2 + " = " + ((double)i1 / (double)i2));
        System.out.println("The multiplication of " + i1 + " and " + i2 + " = " + i1 * i2);
        System.out.println("THe remainder of " + i1 + " and " + i2 + " = " + i1 % i2);


        System.out.println("\n==========TASK-2==========\n");

        int random = 1359259;
        System.out.println(random);
        if (random == 1){
            System.out.println(random + " IS NOT A PRIME NUMBER");
        }
        else if (random == 2 || random == 3 || random == 5 || random == 7 ||
                random % 2 != 0 && random % 3 != 0 && random % 5 != 0 && random % 7 != 0){
            System.out.println(random + " IS A PRIME NUMBER");
        }
        else {
            System.out.println(random + " IS NOT A PRIME NUMBER");
        }

        // for (int i = 2; i <=random / 2; i++){
        // if (random % i == 0){
        // isPrime = false;
        // break;
        // }
        // }
        //if (isPrime) System.out.println (ranNum + " is a prime number");
        //else System.out.println (ranNum + " is not a prime number");
        System.out.println("\n==========TASK-3==========\n");

        int random1 = (int)(Math.random() * 50 + 1);
        int random2 = (int)(Math.random() * 50 + 1);
        int random3 = (int)(Math.random() * 50 + 1);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        if (random1 == random2 && random2 == random3){
            System.out.println("Numbers is the same.");
        }
        else {
            int lowestNum = Math.min(Math.min(random1, random2), random3);
            int greatestNum = Math.max(Math.max(random1, random2), random3);
            System.out.println("Lowest number is = " + lowestNum);
            if (random1 > lowestNum && random1 < greatestNum) {
                System.out.println("Middle number is = " + random1);
            } else if (random2 > lowestNum && random2 < greatestNum) {
                System.out.println("Middle number is = " + random2);
            } else if (random3 > lowestNum && random3 < greatestNum) {
                System.out.println("Middle number is = " + random3);
            }
            else {
                System.out.println("There is no middle number. Two from random three numbers are the same.");
            }
            System.out.println("Greatest number is = " + greatestNum);
        }

        // if (lowestNum == ran1){
        // middle = Math.min (random2, random3)
        // }else if (lowestNum ==ran2){
        // middle = Math.min (random1, random3);
        // } else middle = Math.min(random1, random2);

        // int midNum = (random1 + random2 + random3 - maxNum - minNum);

        System.out.println("\n==========TASK-4==========\n");

        char c = '5';

        if (c >= 65 && c <= 90){
            System.out.println("The letter is uppercase");
        }
        else if (c >=97 && c <= 122){
            System.out.println("The letter is lowercase");
        }
        else {
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("\n=============TASK-5============\n");

        char v = '#';

        if (v <= 65 || v >= 90 && v <= 97 || v >= 122){
            System.out.println("Invalid character detected!!!");
        }
        else if (v == 65 || v == 69 || v == 73 || v == 79 || v == 85 || v == 97 || v == 101
                || v == 105 || v == 111 || v == 117){
            System.out.println("The letter is vowel");
        }
        else {
            System.out.println("The letter is consonant");
        }

        // isLowercase = (c2 >= 'a' && c2 <= 'z');
        // isUppercase = (c2 >= 'A' && c2 <= 'Z');
       // if (isLowercase || isUppercase){
        // if (isLowercase) c2 += 32;
        //if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'){
        // System.out.println ("The letter is vowel");
        // } else
        //System.out.println ("The letter is consonant");
        //} else
        //System.our.println ("Invalid character detected");
        // }
        System.out.println("\n=========TASK-6===========\n");

        char h = '*';

        if (h < 31 || h >= 48 && h <= 57 || h >= 65 && h <= 90 || h >= 97 && h <= 122){
            System.out.println("Invalid character detected!!!");
        }
        else {
            System.out.println("Spacial character is = " + h);
        }

        System.out.println("\n============TASK-7=============\n");

        char character = 'g';


        if (character >= 65 && character <= 90 || character >= 97 && character <= 122){
            System.out.println("Character is a letter");
        }
        else if (character >= 48 && character <= 57){
            System.out.println("Character is a digit");
        }
        else {
            System.out.println("Character is a spacial character");
        }

    }

}
