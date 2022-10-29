package arrayList_linkedList_vector;

import java.util.ArrayList;

public class _04_addAll_removeAllMethod {
    public static void main(String[] args) {

        ArrayList<String> group1Students = new ArrayList<>();
        group1Students.add("Alex");
        group1Students.add("Mike");

        ArrayList<String> group2Students = new ArrayList<>();
        group2Students.add("John");
        group2Students.add("Jane");
        group2Students.add("James");

        ArrayList<String> group3Students = new ArrayList<>();
        group3Students.add("Leo");
        group3Students.add("Lucy");
        group3Students.add("Lucio");

        ArrayList<String> allStudents = new ArrayList<>();
        allStudents.addAll(group1Students);
        System.out.println(allStudents); //[Alex, Mike]

        allStudents.addAll(group3Students);
        System.out.println(allStudents);

        allStudents.addAll(0, group2Students);
        System.out.println(allStudents);//[John, Jane, James, Alex, Mike, Leo, Lucy, Lucio]

        group1Students.add("Messi");
        System.out.println(allStudents.removeAll(group1Students));

        System.out.println(allStudents);
    }
}
