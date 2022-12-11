package enum_practices;

public class Task01 {
    public static void main(String[] args) {

        Frequency frequency = Frequency.YEARLY;

        switch (frequency){
            case HOURLY:
                System.out.println("$20");
                break;
            case WEEKLY:
                System.out.println("$800");
                break;
            case BI_WEEKLY:
                System.out.println("$1600");
                break;
            case MONTHLY:
                System.out.println("$3200");
                break;
            case YEARLY:
                System.out.println("$38400");
                break;
            default:
                throw new IllegalStateException("No such frequency!!!");
        }

    }
}
