package casting;

public class WrapperClasses {
    public static void main(String[] args) {

        //int vs Int

        int i1 = 25;

        System.out.println(i1); // 25

        Integer i2 = 25;
        System.out.println(i2); // 25

        int i3 = i2; // you can convert object in primitive

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.max(3, 5));

        String s = "25";
        System.out.println(Integer.valueOf(s) + 5); //30 String ->Integer(object) -> int()primitive
        System.out.println(Integer.parseInt(s) + 5); //30

    }
}
