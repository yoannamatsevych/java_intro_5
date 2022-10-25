package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {

        int num1 = ScannerHelper.getAnNumber();
        int num2 = ScannerHelper.getAnNumber();
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if (i == 5) continue;
            System.out.println(i);
        }

    }
}
