package variables;

public class UnderstandingVariables {
    public static void main(String[] args){

        //Variables declaration and assignment with the initial value

        int age = 45;

        System.out.println(age);

        //Variable declaration - it allocate (reserve) the memory

        String name;

        //Variable assignment

        name = "John";

        System.out.println (name);

        //Re-assigning - update previous one
        name = "Mike";

        System.out.println(name);

        age = 26;

        System.out.println(age);

        boolean isFemale= true;
        String babyName;

        if(isFemale){
            babyName = "Ema";
        }
        else{
            babyName = "George";
        }
        System.out.println(babyName);
    }
}
