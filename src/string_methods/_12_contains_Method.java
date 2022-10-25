package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns boolean
        3. non-static
        4. takes one argument as CharSequence same like String
         */


        String s = "TechGlobal School";

        System.out.println(s.contains("Tech"));//true
        System.out.println(s.contains("School"));//true
        System.out.println(s.contains("a"));//true
        System.out.println(s.contains("E"));//false

        // IMPORTANT
        System.out.println(s.contains("")); // true
        System.out.println(s.contains(s)); //true
        System.out.println(s.contains("education")); //false
        System.out.println(s.contains("e'")); //false


    }

    public String getSandwich(String str) {
        for(int i = 0; i < str.length(); i++){
            if (str.substring(i, i + 5).equals("bread")){
                for (int j = i + 5; j < str.length(); j++){
                    return str.substring(i+5, j);
                }
            }
        }
        return "";
    }

}
