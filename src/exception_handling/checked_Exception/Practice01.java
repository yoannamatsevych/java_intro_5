package exception_handling.checked_Exception;

public class Practice01 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000); // recommended to be handled with try-catch block
        }

    }

}
