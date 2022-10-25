package practice.loopsPractice;

import utilities.RandomNumberGenerator;

public class WhileLoopsPractice {
    public static void main(String[] args) {

//        int random = RandomNumberGenerator.getARandomNumber(1, 20);
//
//        System.out.println("Random number: " + random);
//
//        while(random != 7){
//            random = RandomNumberGenerator.getARandomNumber(1, 20);
//            if (random == 7) break;
//            System.out.println("Random number: " + random);
//        }
//        System.out.println("Congrats you hit the number: " + random);

        String str = "abXYabc";
        int n = 2;
        String str1 = str.substring(0, n + 1);
        String str2 = "";
        for (int i = 0; i < str.length() - n; i++){
            str2 = str.substring(i, i+n+1);
            if (str1.equals(str2)) break;
        }
        System.out.println(str1.equals(str2));
    }

    public boolean prefixAgain(String str, int n) {
        String str1 = str.substring(0, n + 1);
        String str2 = "";
        for (int i = 0; i > str.length() - n; i++){
            str2 = str.substring(i, i+n+1);
            if (str1.equals(str2)) break;
        }
        return str1.equals(str2);
    }
}
