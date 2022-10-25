package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise01 {
    public static void main(String[] args) {

        int num1 = ScannerHelper.getAnNumber();
        int num2 = ScannerHelper.getAnNumber();

        for(int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--){
            if(i < 10) break;
            System.out.println(i);
        }

        System.out.println("End of the program");
    }
}
