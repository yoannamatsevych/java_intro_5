package regex;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("SDET");
        Matcher matcher = pattern.matcher("TechGlobal provides students a complete educational program to be a " +
                "competitive SDET in the professional IT field. With the course, students learn all the fundamental " +
                "technologies needed to become an SDET professional and how important testing is in the " +
                "Software Development Life Cycle (SDLC)… Learn more about the technologies that " +
                "TechGlobal provides to its participants below and feel free to reach out to us with any questions.");

        System.out.println(matcher.matches());
        int count = 0;


        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());

            System.out.println("starting index: " + matcher.start());
            System.out.println("ending index: " + matcher.end());
        }
        System.out.println(count);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sentence = input.nextLine();
        Pattern pattern1 = Pattern.compile("[A-za-z0-9]{1,}");
        Matcher matcher1 = pattern1.matcher(sentence);
        int count1 = 0;


        while (matcher1.find()) {
            count1++;
            System.out.println(matcher1.group());
        }
        System.out.println("This sentence contains " + count1 + "words");

        System.out.println(Pattern.matches("[xyz]", "xyz")); // false
        System.out.println(Pattern.matches("[a-z&&[^pqrs]]", "n"));//true
        System.out.println(Pattern.matches("[a-z&&[^p-s]]", "r")); // false
        System.out.println(Pattern.matches("[^xyz]", "y")); //false

        pattern = Pattern.compile("[A-Za-z0-9_-]{9,15}");
        System.out.println(Pattern.matches(pattern.toString(), "TechGlobal"));

        String str = "I love it";
        str.replace("it", "");
    }
}