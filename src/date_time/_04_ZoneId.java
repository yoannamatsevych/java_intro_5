package date_time;

import java.time.ZoneId;

public class _04_ZoneId {

    public static void main(String[] args) {

        //Creating a ZoneId instance with systemDefault() method
        ZoneId zoneId1 = ZoneId.systemDefault();

        System.out.println(zoneId1); // system default zone id

        //Creating a ZoneId instance with of() method
        ZoneId zoneId2 = ZoneId.of("America/Los_Angeles");

        System.out.println(zoneId2); // America/Los_Angeles
    }


}
