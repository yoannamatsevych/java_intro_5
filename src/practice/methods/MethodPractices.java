package practice.methods;

public class MethodPractices {
    public static void main(String[] args) {
        MethodPractices.printChar("John" );
        printChar("" );
        printChar("JavaScript" );

        printMiddle("toyota"); //yo
        printMiddle("civic"); // v
        printMiddle("yj"); // less than 3

        printFirstLastMiddle("UniteStates");
        isSameString("xyhgjhxy");
    }

 public static void printChar(String str){
        if (str.isEmpty()) System.out.println("Length is zero");
        else{
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("Last char is = " + str.charAt(str.length() - 1));
            String str1 = str.toLowerCase();
            if (str1.contains("a") || str1.contains("e") || str1.contains("o") || str1.contains("u") ||
                    str1.contains("i")) {
                System.out.println("This String has vowel");
            }
            else System.out.println("This String does not have vowel");
        }
 }

    public static void printHasVowel(String str){
        String str1 = str.toLowerCase();
        if (str1.contains("a") || str1.contains("e") || str1.contains("o") || str1.contains("u") ||
                str1.contains("i")) {
            System.out.println("This String has vowel");
        }
        else System.out.println("This String does not have vowel");
    }

    public static void printMiddle (String str){
        if (str.length() < 3) System.out.println("Length is less than 3");
        else {
            if (str.length() % 2 == 0){
                System.out.println(str.substring((str.length() / 2 - 1), (str.length() / 2 + 1)));
            }
            else{
                System.out.println(str.charAt(str.length() / 2));
            }

//            System.out.println( (str.length() % 2 == 0) ? (str.substring((str.length() / 2 - 1), (str.length() / 2 + 1) :
//                    (str.charAt(str.length() / 2)));
        }
    }


    public static void printFirstLastMiddle (String str){
        if (str.length() < 4) System.out.println("INVALID INPUT");
        else{
            System.out.println("First 2 characters are = " + str.substring(0, 2));
            System.out.println("Last 2 characters are = " + str.substring(str.length() - 2));
            System.out.println("The other characters are = " + str.substring(2, str.length() - 2));
        }
    }

    public static void isSameString (String str){
        if (str.length() < 2) System.out.println("Length is less than 2");
        else System.out.println((str.substring(0, 2)).equals(str.substring(str.length() - 2)));

//        System.out.println(
//                str.length() < 2 ?
//                        "Length is less than 2" :
//                        (str.substring(0, 2)).equals(str.substring(str.length() - 2))
//
//        );

    }

}





