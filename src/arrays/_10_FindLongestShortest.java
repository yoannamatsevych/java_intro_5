package arrays;

public class _10_FindLongestShortest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};
        findLongestShortestElement(colors);

    }

    /*
    create a public static method which will take a string array
    then it will print the longest and shortest string from that array
     */

    public static void findLongestShortestElement(String[] elements){
        String longest = elements[0];
        String shortest = elements[0];
        for (int i = 1; i < elements.length; i++){
            if (elements[i].length() > longest.length()) longest = elements[i];
            if (elements[i].length() < shortest.length()) shortest = elements[i];
        }
        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }


}
