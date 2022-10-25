package loops;

public class Exercise05_findTheIndexOf {
    public static void main(String[] args) {
        System.out.println(findFirstIndexOf("I love Java", 'a'));
        System.out.println(findFirstIndexOf("Banana", 'a'));
        System.out.println(findFirstIndexOf("Banana", 't'));
        System.out.println(findLastIndexOf("I love Java", 'a'));
        System.out.println(findLastIndexOf("Banana", 'a'));
        System.out.println(findLastIndexOf("Banana", 't'));
        System.out.println(clearChar("Banana", 't'));
        System.out.println(clearChar("Banana", 'a'));
        System.out.println(clearChar("I love Java", 'a'));
        System.out.println(clearWord("Banana", "an"));
        System.out.println(clearWord("Banana", "ababababa"));
        System.out.println(clearWord("I love Java", "av"));

        System.out.println(frontAndBack("abcxxxxxxabc"));
        System.out.println(frontAndBack("abcxxxxxxfgh"));
        System.out.println(frontAndBack("abxxxxxab"));
        System.out.println(frontAndBack("bcxxxxababc"));
        System.out.println(mostRepeatedChar("I love Java"));


        System.out.println(mostRepeatedChar("I love Java"));
        System.out.println(mostRepeatedChar("Banana"));
        System.out.println(mostRepeatedChar("I love Java"));



    }


    /*
    Create a public static method named as findFirstIndexOf() and it will take a String and a char then it will return
    the index of the first occurrence of th char, if the char does not exist in the string (-1)
     "I love Java", 'a' ->  8
    "Banana", 'a' -> 1
    "Banana", 't' -> -1
     */
    public static int findFirstIndexOf(String s, char c){
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) return i;
        }
        return -1;
    }
     /*
    Create a public static method named as findLastIndexOf() and it will take a String and a char then it will return
    the index of the first occurrence of th char, if the char does not exist in the string (-1)
     "I love Java", 'a' ->  8
    "Banana", 'a' -> 1
    "Banana", 't' -> -1
     */
     public static int findLastIndexOf(String s, char c){
         for (int i = s.length()-1; i >= 0 ; i--){
             if(s.charAt(i) == c) return i;
         }
         return -1;
     }


       /*
    Create a public static method named as clearChar() and it will take a String and a char then it will return
    the String without given char
     "I love Java", 'a' ->  I love Jv
    "Banana", 'a' -> 1 Bnn
    "Banana", 't' -> Banana
     */

    public static String clearChar(String s, char c){
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) str += "";
            else str += s.charAt(i);
        }
        return str;
    }


      /*
    Create a public static method named as clearWord() and it will take the two Strings then it will return
    the String without the given second String
     "I love Java", "av" ->  I love Ja
    "Banana", "an" ->  Ba
    "Banana", 'babababba' -> ""
     */

    public static String clearWord(String s, String c) {
        if (s.length() > c.length()) {
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                if (!s.substring(i).startsWith(c)) str += s.charAt(i);
                else i += c.length() - 1;
            }
            return str;
        }
        return "";
    }

      /*
    Create a public static method named as frontAndBack() and it will take a Strings then it will return
    the String which has the most common words from start and end
     "I love Java", "av" ->  I love Ja
    "Banana", "an" ->  Ba
    "Banana", 'babababba' -> ""
     */
      public static String frontAndBack(String s) {
          /*
          1. Create container
          2.Create a fori loop (0, s.length()/ 2 )
          3. get the substring and check if it is ending with. If it is ending update the container
           */
          String newS = "";
          for (int i = 0; i < s.length() / 2; i++) {
              if (s.endsWith(s.substring(0, i + 1))) {
                  newS = s.substring(0, i + 1);
              }

          }
          return newS;
      }

         /*
    Create a public static method named as mostRepeatedChar() and it will take a String then it will return
    the most repeated char from String. If there is same amount of repeatision return the first one.
     "I love Java" ->  v
    "Banana" ->  a
    "Python" -> "P"
     */


    //supporting char method it will take A String and the Char it will return int

    public static int countChar(String s, char c) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) counter++;
        }
        return counter;
    }
    public static char mostRepeatedChar(String s) {
        char mostRepeated = ' ';
        int mostAmountOfRepetition = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;
            if (countChar(s, s.charAt(i)) > mostAmountOfRepetition) {
                mostRepeated = s.charAt(i);
                mostAmountOfRepetition = countChar(s, s.charAt(i));
            }

        }
        return mostRepeated;
    }
    }









