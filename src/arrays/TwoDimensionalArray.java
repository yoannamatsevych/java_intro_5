package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdullah", "Newer"}
        };
        System.out.println(students[0][1]); //Mehmet
        System.out.println(students[1][1]);

        System.out.println(students.length); // 3

        System.out.println(Arrays.toString(students[0])); //[Ali, Mehmet, Alex]
        System.out.println(Arrays.toString(students[1])); //[Alex, Regina]
        System.out.println(Arrays.toString(students[2])); //[Abdullah, Newer]
        // print the inner array with fori loops
        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));
        }
        // print the inner array with for each loop
        for (String[] group : students) {
            System.out.println(Arrays.toString(group));

            System.out.println("\n==========Printing inner arrays in for i loop");
            for (int i = 0; i < students.length; i++) {
                for (int j = 0; j < students[j].length; j++)
                    System.out.println(students[i][j]);
            }
            System.out.println("\n==========Printing inner arrays in for each loop");
            for (String[] group1 : students) {
                for (String student : group1)
                    System.out.println(student);
            }
            // Printing multi-dimensional array - whole
            System.out.println(Arrays.deepToString(students));

        }
    }
}
