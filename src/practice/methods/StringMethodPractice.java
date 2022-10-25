package practice.methods;

public class StringMethodPractice {
    public static void main(String[] args) {
        System.out.println(isCharExisting("John", 'o', 1));
        System.out.println(isCharExisting("John", 'c', 2));
        System.out.println(isCharExisting("Peter", 'o', 1));
        System.out.println(isCharExisting("peter", 'r', 4));
        System.out.println(isCharContained("john", 'o'));
        System.out.println(isCharContained("john", 'n'));
        System.out.println(isCharContained("john", 'p'));



    }

      /*
        Create a public static method named as "isCharExisting" which will take a String, A char and an index
        It will return true if a char is existing in that string at the given index
         */

    public static boolean isCharExisting(String word, char char1, int index){
        return word.charAt(index) == char1;

    }
    /*
    Create a public static method named as "isCharContained" which will take a String, A char and
        It will return true if a char is existing in that string at the given index
     */

    public static boolean isCharContained(String str, char char1){

        return str.contains(String.valueOf(char1));
   //     return str.contains("" + char1);
    }




}
