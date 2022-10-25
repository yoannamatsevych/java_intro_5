package conditional_statements.nested_if_else_statement;

public class Exercise1_GoldNumber {

    public static void main(String[] args) {

        int randomNumber = (int)(Math.random() * 101) - 50;

        int points = 0;

        if(randomNumber > 0){
            points += 10;
            if(randomNumber > 25){
                points +=10;
            }
            else if (randomNumber == 7){
                points +=100;
            }
        }
        else{
            if(randomNumber == -7){
                points += 10;
            }
        }

        System.out.println("The random  number is = " + randomNumber);
        System.out.println("The points we get is = " + points);

    }
}
