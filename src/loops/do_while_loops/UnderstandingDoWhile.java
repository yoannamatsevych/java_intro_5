package loops.do_while_loops;

public class UnderstandingDoWhile {
    public static void main(String[] args) {

        int i = 0;

        do{
            System.out.println(i);
            i++;
        }
        while (i < 5);

        System.out.println("======while loop======");
        int j = 0;
        while (j < 5){
            System.out.println(j);
            j++;
        }

        int count = 0;
        while (count < 10) {
            System.out.println("Welcome to Java");
            count++;
        }
        int k = 0;
        for(k=1; k<=10; k++); System.out.print(k);

        int l = 0;
        for(l = 100; l <= 0; l -= 10 ){
            System.out.print(l + ", ");
        }
    }
}
