package projects;

import java.util.Scanner;

public class Project01 {
    public static void main(String[] args){
       /*TASK-1
        -Store your name in a String variable called name
        -Print the variable with a proper message
        -EX/ My name is = name
        NOTE: Uppercases, lowercases and spaces are important
        */

        System.out.println("=======TASK-1========");

        String name = "Yoanna";

        System.out.println("\nMy name is = " + name);
        /*
        TASK-2
        -Create different char variables for each of your name letter and store them in
        separate variables as nameCharacter1, nameCharacter2 and so on.
        -Print variables with proper messages
        -EX/Name letter 1 is = nameCharacter1
        Name letter 2 is = nameCharacter2
         */

        System.out.println("\n========TASK-2========");

        char nameCharacter1 = 'Y';
        char nameCharacter2 = 'o';
        char nameCharacter3 = 'a';
        char nameCharacter4 = 'n';
        char nameCharacter5 = 'n';
        char nameCharacter6 = 'a';

        System.out.println("\nName letter 1 is = " + nameCharacter1);
        System.out.println("Name letter 2 is = " + nameCharacter2);
        System.out.println("Name letter 3 is = " + nameCharacter3);
        System.out.println("Name letter 4 is = " + nameCharacter4);
        System.out.println("Name letter 5 is = " + nameCharacter5);
        System.out.println("Name letter 6 is = " + nameCharacter6);

        /*TASK-3
        -Create different String variables to store info like myFavMovie, myFavSong,
        myFavCity, myFavActivity, myFavSnack.
        -Print variables with proper messages
        -EX/My favorite movie is = myFavMovie
         */

        System.out.println("\n========TASK-3==========");

        String myFavMovie = "A Walk to Remember";
        String myFavSong = "Billie Eilish \"Lovely\"";
        String myFavCity = "Chicago";
        String myFavActivity = "Dancing";
        String myFavSnack = "Nuts";

        System.out.println("\nMy favorite movie is = " + myFavMovie);
        System.out.println("My favorite song is = " + myFavSong);
        System.out.println("My favorite city is = " + myFavCity);
        System.out.println("My favorite activity is = " + myFavActivity);
        System.out.println("My favorite snack is = " + myFavSnack);

        /*TASK-4
        -Create different int variables to store info like myFavNumber,
        numberOfStatesIVisited, numberOfCountriesIVisited.
        -Print variables with proper messages
        -EX/My favorite number is = myFavNumber
         */

        System.out.println("\n=========TASK-4=========");

        int myFavNumber = 3;
        int numberOfStatesIVisited = 5;
        int numberOfCountriesIVisited = 6;

        System.out.println("\nMy favorite number is = " + myFavNumber);
        System.out.println("Number of states I visited = " + numberOfStatesIVisited);
        System.out.println("Number of countries I visited = " + numberOfCountriesIVisited);

        /*
        TASK-5
        -Create a boolean called amIAtSchoolToday
        -Assign true to this variable if you are at campus today
        -Assign false to this variable if you are joining online today
        -Print variable value with a proper message using println() method
        EX/ I am at school today = amIAtSchoolToday
         */

        System.out.println("\n=======TASK-5=======");

        boolean amIAtSchoolToday = false;

        System.out.println("\nI am at school today = " + amIAtSchoolToday);

        /*
        TASK-6
        -Create a boolean called isWeatherNiceToday
        -Assign true to this variable if it is above 60F today
        -Assign false to this variable if it is below or equal to 60F today
        -Print variable value with a proper message using println() method
        -EX/ Weather is nice today = isWeatherNiceToday
         */

        System.out.println("\n==========TASK-6==========");

        boolean isWeatherNiceToday = true;

        System.out.println("\nWeather is nice today = " + isWeatherNiceToday);

        System.out.println("What is the whether?");
        Scanner input = new Scanner(System.in);
        System.out.println("Whether is " + input.next());

        }

    }

