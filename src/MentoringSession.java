import java.util.Arrays;

public class MentoringSession {
    public static void main(String[] args) {

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

        //TASK-2

        // Assume that we have two strings with same length;
        // Create new string where each letter of the second string is after corresponding letter of the first string
        // String str1 = "XYZ"
        // String str2 = "ABC"
        // Expected output:
        // "XAYBCZ"

        String str1 = "XYZ";
        String str2 = "ABC";
        String str3 = "";
         for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++){
             str3 += str1.charAt(i);
             str3 += str2.charAt(j);
         }
        System.out.println(str3);



//        for ( int i = 0 ; i < 5 ; i ++ )
//            System.out.println ( i ) ;
//
//
//        int i = 0;
//        while (i < 5) System.out.println(i);
//        i ++;
//
//
//        int j = 0;
//        do System.out.println(j);
//        while (j < 5);


        // TASK-3 (After continue slide)
        // Print given sentence without Uppercase letters
        // String sentence = Chicago is the Best City of the World
        // Expected output = hicago is the est ity of the orld

        String sentence = "Chicago is the Best City of the World";
        String newSentence = "";

        for (int i = 0; i < sentence.length(); i++){
            if(Character.isUpperCase(sentence.charAt(i))) continue;
            else newSentence += sentence.charAt(i);
        }

        System.out.println(newSentence);

        // TASK-4 (After for-each)
//        String[] names = {"Lisa", "Kevin", "Roman"};
//        System.out.println(Arrays.toString(names));
//        String str = "";
//        for (String name : names){
//            str += name + ", ";
//        }
//        System.out.println(str.substring(0, str.length() - 2));

        // TASK-5
        //Now, lets come back to the break statement
        // String[] names = {"Lisa", "Kevin", "Roman"};
        // Want to find if name "Kevin" is existing in the array

        String[] names = {"Lisa", "Kevin", "Roman"};
        boolean isKevin = false;
        for (String name : names){
           if (name.equals("Kevin")) {
               isKevin = true;
               break;
           }
        }
        System.out.println(isKevin);

        // TASK - 6
        // but it is not only for Arrays
        // Assume we have the string "Java is my life"
        // We need to find out if word "is" is existing in this string
        String  str = "Java my life";
        boolean isIs = false;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.substring(i, i+2).equals("is")) {
                isIs = true;
                break;
            }
        }
        System.out.println(isIs);


    }
}
