import java.util.Arrays;

public class MentoringSession {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.print((char) ('a' + i));
        }

        // For i loop
        // Multiple Initializations and Update Expressions (after first slide)

       // TASK-1
        // Write the program with the follow output:
        // Number = 1
        // Number = -1
        // Number = 2
        // Number = -2
        // Number = 3
        // Number = -3
        // Number = 4
        // Number = -4
        // Number = 5
        // Number = -5
//        for(int i=1, j= -1; i <= 5 && j >= -5; i++, j--){
//            System.out.println("Number = " + i);
//            System.out.println("Number = " + j);
//        }

//        int i=1, sum = 0;
//        for(; i <=10; sum += i, ++i);


//        for(int i = 0; i < 5; i++)
//            System.out.println(i);


//        int i = 0;
//        while (i < 5)
//            System.out.println(i);
//        i ++;

//
//        int j = 0;
//        do System.out.println(j);
//        while (j < 5);


        // TASK-3 (After continue slide)
        // Print given sentence without Uppercase letters
        // String sentence = Chicago is the Best City of the World
        // Expected output = hicago is the est ity of the orld

//        String sentence = "Chicago is the Best City of the World";
//        String newSentence = "";
//
//        for (int i = 0; i < sentence.length(); i++){
//            if(Character.isUpperCase(sentence.charAt(i))) break;
//            else newSentence += sentence.charAt(i);
//        }
//
//        System.out.println(newSentence);



        // TASK-5
        //Now, lets come back to the break statement
        // String[] names = {"Lisa", "Kevin", "Roman"};
        // Want to find if name "Kevin" is existing in the array
//
//        String[] names = {"Lisa", "Kevin", "Roman"};
//        boolean isKevin = false;
//        for (String name : names){
//           if (name.equals("Kevin")) {
//               isKevin = true;
//               break;
//           }
//        }
//        System.out.println(isKevin);

        // TASK - 6
        // but it is not only for Arrays
        // Assume we have the string "Java is my life"
        // We need to find out if word "is" is existing in this string
//        String  str = "Java  is my life";
//        boolean isIs = false;
//        for (int i = 0; i < str.length() - 1; i++){
//            if (str.substring(i, i+2).equals("is")) {
//                isIs = true;
//                break;
//            }
//        }
//        System.out.println(isIs);


    }



}
