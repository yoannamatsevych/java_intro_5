package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Assume you have an ArrayList of languages as below
        Java
        JavaScript
        Ruby
        Go
        Java
        Ruby
        Java
         */


        String[] langs = {"Java", "JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"};
        ArrayList<String> languages = new ArrayList<>(Arrays.asList(langs));
        ArrayList<String> uniques = new ArrayList();

        for (String language : languages){
            if(!uniques.contains(language)) uniques.add(language);
        }

        System.out.println(uniques);



        for (int i = 0; i < languages.size(); i++){
            for (int j = i + 1; j < languages.size(); j++){
                if (languages.get(j) == languages.get(i)) {
                    languages.remove(j);
                }
            }


        }
        System.out.println(languages);
    }

}
