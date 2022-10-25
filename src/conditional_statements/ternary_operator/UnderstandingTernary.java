package conditional_statements.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {

        char gender  = 'm';

        String name = gender == 'F' || gender == 'f' ? "Jane" : "John";

        System.out.println(name);

    }
}
