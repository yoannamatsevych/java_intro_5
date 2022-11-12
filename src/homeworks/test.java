package homeworks;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String str = input.nextLine();
        str = str.trim();

        if (!str.contains(" ")) System.out.println("This sentence does not have 2 or " +
                "more words to swap");
        else {
            int indFirstSpace = str.indexOf(" ");
            int indLastSpace = str.lastIndexOf(" ");
            System.out.println(str.substring(indLastSpace + 1) +
                    str.substring(indFirstSpace, indLastSpace + 1) + str.substring(0, indFirstSpace));

        }


        System.out.println(moreThen100("uk"));

        String str1 = "2860 S River Rd Suite 350, Des Plaines IL 60018";
        str1 = str1.toLowerCase();
        System.out.println(str1.replace("a", "*").replace("o", "@").
                replace("e", "#").replace("i", "+").replace('u', '$'));
    }

    public static String moreThen100(String str){

        if (str.length() > 5) return str.substring(2, str.length()-2);
        return "Invalid input";
//        Scanner input = new Scanner(System.in);
//
//        int sum = 0;
//
//        do{
//            System.out.println("Please enter a number");
//            int num = input.nextInt();
//            if(num >= 100) System.out.println("This numbers is already more then 100");
//            else {sum+=num;}
//        }while (sum < 100);
//
//        if (sum >= 100) System.out.println("The sum of the number is at list 100");
    }


}
