package arrayList_linkedList_vector;

import java.util.LinkedList;
import java.util.List;

public class Exercise03_RemoveElements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        /*
        TASK
        Remove all elements that starts with J and print the list
        EXPECTED:
        [C#, Python, C++]
         */

        /*
        for (String language : languages) { // ConcurrentModificationException
            if(language.startsWith("J")) languages.remove(language);
        }
         */

        /*
        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).startsWith("J")) {
                languages.remove(languages.get(i));
                i--;
            }
        }
        */

        languages.removeIf(x -> !x.startsWith("C"));
        System.out.println(languages.size());


    }

    public String stringX(String str) {
        String result = str.charAt(0) + "";
        for(int i = 1; i < str.length()-1; i++){
            if(!(str.charAt(i) == 'x')) result += str.charAt(i);
        }
        result += str.charAt(str.length()-1);
        return result;
    }
}
