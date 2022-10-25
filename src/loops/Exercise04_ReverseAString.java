package loops;

import utilities.ScannerHelper;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();
        String revertName = "";

        for (int i = name.length() - 1; i >= 0; i--){
            revertName += name.charAt(i);
        }
        System.out.println("The reversed name is =" + revertName);

    }
}
