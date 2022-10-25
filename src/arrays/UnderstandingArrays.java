package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        //Storing a name in the String
        String name = "John";

        //Storing best friends' names;
        String bff1 = "Jane";
        String bff2 = "Alex";
        String bff3 = "Mike";

        //Storing more names
        String[] names = {
                "Bayza",
                "Andrii",
                "Vlad",
                "Samir",
                "Olena"
        }; // holding a collection of names

        //Retrieving an element from an array - using index
        System.out.println(names[2]);//Vlad
        System.out.println(names[4]);//Olena

        // ArrayIndexOutOFBoundsException //[5]

        int age = 25;
        int[] ages = {22, 23, 25};
        System.out.println(ages[2]); // 25

    }
}
