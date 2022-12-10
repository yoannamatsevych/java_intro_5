package exception_handling.try_catch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import utilities.ScannerHelper;

import java.util.InputMismatchException;

public class TryCatch_Practice02 {
    public static void main(String[] args) {


    /*
    Write a program that gets 2 numbers from the user as int
    Then divide these numbers and print the result


    print a massage saying "End of the program"
     */

        try{
            int num1 = ScannerHelper.getAnNumber();
            int num2 = ScannerHelper.getAnNumber();
            System.out.println("Division of the numbers = " + num1 / num2);
        }
        catch (InputMismatchException d){
            d.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of the program");

    }
}
