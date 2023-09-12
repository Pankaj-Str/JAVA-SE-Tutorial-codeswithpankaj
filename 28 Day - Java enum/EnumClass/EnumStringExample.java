public enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String displayName;

    private Day(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

public class EnumStringExample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Today is " + today.getDisplayName()); // Output: Today is Friday
    }
}
