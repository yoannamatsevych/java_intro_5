package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            if (i % 2 !=0) System.out.println(i);
            i++;
        }

    }

    public static class Exercise02_PrintNumbersDividedBy3 {
        public static void main(String[] args) {

            int i = 1;
            while (i <= 100){
                if (i % 3 == 0) System.out.print(i + " - ");
                i++;
            }

        }
    }
}
