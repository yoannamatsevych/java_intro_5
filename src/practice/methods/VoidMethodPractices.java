package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {

        flavoredPicker("chocolate");
        flavoredPicker("Chocolate");

        flavoredPicker("strawberry");

        checkAge(19);
        checkAge(20);
        checkAge(56);
        checkAge(-56);

        checkCreditScore(99);
        checkCreditScore(1567.98);
        checkCreditScore(27676.76);
        checkCreditScore(2345.98);

    }

    /*
    Create a public static method which will take an ice cream flavor and print the  message about your ise cream

    examples:
    chocolate -> You have a great taste
    vanilla -> not bad
    strawberry -> Enjoy it!
     */

    public static void flavoredPicker(String flavor){
//        if (flavor.equals("chocolate")) System.out.println("You have a great taste");
//        else if (flavor.equals("vanilla")) System.out.println("Not bad");
//        else if (flavor.equals("strawberry")) System.out.println("Enjoy it!");
//        else System.out.println("give me a valid flavor");

        switch(flavor){
            case "chocolate":
                System.out.println("You have a great day");
                break;
            case "vanilla":
                System.out.println("Not bad!");
                break;
            case "strawberry":
                System.out.println("Enjoy it!");
                break;
            default :
                System.out.println("Give me a valid flavor");
        }
    }

    /*
    Create a method public static name as "checkAge", it is going to take an age,
    then prints according to following:
    - 0 to 19 -> You are a teenager;
    - 20 to 21 -> You can drive
    - more than 21 -> You can drink coke
     */

    public static void checkAge(int age) {
        if (age >= 0 && age <= 19) System.out.println("You are a teenager");
        else if (age == 20 || age == 21) System.out.println("You can drive");
        else if (age > 21)System.out.println("You can drink coke");
        else System.out.println("It is not valid number");
    }

    /*
    Create a public static method named as "checkCreditScore", it is going to take a balance as parameter
    then it will print according to following:

    balance:
    0.00 - 999.99 -> Low credit score
    1000.00 - 1999.99 -> Medium credit score
    2000.00 - 2999.99 -> Good credit score
    else -> No valid credit score!
    */

    public static void checkCreditScore (double balance){
        if (balance >= 0 && balance <= 999.99) System.out.println("Low credit score");
        else if (balance >= 1000 && balance <= 1999.99) System.out.println("Medium credit score");
        else if (balance >= 2000 && balance <= 2999.99) System.out.println("Good credit score");
        else System.out.println("No valid credit score!");
    }
}
