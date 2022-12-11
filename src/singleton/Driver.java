package singleton;

public class Driver {

    // Achieve singleton design for the driver object

    private static Driver driver;

    private Driver(){}

    public static Driver getDriver(){
        if (driver == null) driver = new Driver();
        return driver;
    }

}
