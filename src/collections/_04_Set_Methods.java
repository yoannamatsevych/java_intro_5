package collections;

import java.lang.reflect.Array;
import java.util.*;

public class _04_Set_Methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("a", "b"));
        System.out.println(set);

        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");

        System.out.println(set); // [Bar, bar, abc, Foo, foo, xxx]

        System.out.println(set.size()); //6
        System.out.println(set.isEmpty()); //false
        System.out.println(set.contains("ABC")); // false
        System.out.println(set.remove("AAA")); // false
        System.out.println(set.remove("xxx")); // true
        System.out.println(set);
        System.out.println(set.equals(set)); // true
        set.removeIf(e -> e.toLowerCase().startsWith("b"));
        System.out.println(set); //[abc, Foo, foo]
        set.forEach(System.out::println);

        for (String s : set) {
            System.out.println(s);
        }

        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());

        set.removeAll(set);

        set.clear();

        System.out.println(set.size()); // 0
        System.out.println(set); //[]

        reverse("large dog");
    }

    public static void reverse(String str){
        String[] arr = str.split(" ");
        String result = "";
        for (String s : arr) {
            result += new StringBuilder(s).reverse() + " ";
        }
        System.out.println(result.substring(0, result.length()-1));
    }


}
