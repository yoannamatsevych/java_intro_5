package casting;

public class Exercise5 {
    public static void main(String[] args) {
        String s1 = "35", s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);


        System.out.println("Sum of  s1 and s2 = " + (i1 + i2));
        System.out.println("Difference of s1 and s2 =" + (i1 - i2));
        System.out.println("Absolute Difference of s1 and s2 = " + Math.abs(i1 - i2));
        System.out.println("Product of s1 and s2 = " + (i1 * i2));
        System.out.println("Division od s1 and s2 = " + (i1 / i2));
        System.out.println("Remainder of s1 and s2 = " + (i1 % i2));
        System.out.println("Min number of s1 and st = " + Math.min(i1, i2));
        System.out.println("Max number os s1 ans s2 = " + Math.max(i1, i2));
    }
}
