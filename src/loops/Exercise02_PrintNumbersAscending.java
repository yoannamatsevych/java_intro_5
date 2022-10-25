package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
          if (i <= 9)  System.out.print(i + " - ");
            else System.out.println(i);
        }

        System.out.println("======Advance WAY======");

        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " - ";
        }

        System.out.println(result.substring(0, result.length() - 3));
    }
}
