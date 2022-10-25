package strings;

public class StringConcatenation {
    public static void main (String [] args){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        System.out.println("\n===========Concatenation with + operator============");
        String firstName = "Yoanna";
        String lastName = "Matsevych";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("\n=========Concatenation with concat() operator==========");
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);


    }
}
