package arrays;

import java.util.Arrays;

public class Exercise02_countsWords {
    public static void main(String[] args) {


    /*
    Assume that you are given below string:
    String sentence = "I love arrays";

     */
        String sentence = "I love arrays";
       /*
       String sentence = "I love arrays";

      int countS = 0;

      for (int i = 0; i < sentence.length(); i++) {
    if(sentence.charAt(i) == ' ') countS++;
        }

        System.out.println(countS + 1);
        */

        System.out.println("\n==============Solution 1=========");
        int count = 0;
        for (char element : sentence.toCharArray()){
            if(element == ' ') count++;
        }
        System.out.println(count + 1);

        System.out.println("\n===============Solution 2 with split() method=========\n");
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
       // System.out.println(sentence.split(" ").length);
    }
}
