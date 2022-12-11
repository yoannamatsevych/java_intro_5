package singleton;

public class TestDriver {
    public static void main(String[] args) {

        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();
        Driver d4 = Driver.getDriver();

        System.out.println(d1); // singleton.Driver@7ea987ac
        System.out.println(d2); // singleton.Driver@7ea987ac
        System.out.println(d3); // singleton.Driver@7ea987ac
        System.out.println(d4); // singleton.Driver@7ea987ac


    }
}
