package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {

        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";
String c1 = "true";
        int s0 = Integer.parseInt(salary1);
        boolean b1 = Boolean.parseBoolean(c1);
        double s1 = Double.parseDouble(salary1);
        double s2 = Double.parseDouble(salary2);
        double s3 = Double.parseDouble(salary3);
        System.out.println(b1);
        System.out.println("Min salary = $" + Math.min(Math.min(s1, s2), s3));
        System.out.println("Max salary = $" + Math.max(Math.max(s1, s2), s3));

        // Task - 2
        //0.1 = .1
        System.out.println("10 percent of salary " + Math.min(Math.min(s1, s2), s3) * .1);
     }
}
