package loops.fori_loops;

public class UnderstandingForILoop {
    public static void main(String[] args) {
        /*
        Syntax:

        for (initialization; termination condition; change){
        block to executed
        }
         */

        for (int i = 0; i <=99; i++){
            System.out.println("Hello World!");
        }

        int j = 0;
        for (; j <=99; j++){
            System.out.println("Hello World!");
        }

        System.out.println("End of the program");
    }
}
