package casting;

public class Exercise7_CalculateAbsoluteDifference {

    public static void main(String[] args) {

        String s1 = "100", s2 = "150", s3 = "50";

        int i1 = Integer.valueOf(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        System.out.println(Math.abs(i1 - i2));
        System.out.println(Math.abs(i3 - i2));
        System.out.println(Math.abs(i3 - i1));

    }
}
