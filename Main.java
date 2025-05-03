public class Main {
    public static void main(String[] args) {
        System.out.println("Number of leap years between 2000 and 2025 (inclusive): " +
                           APCalendar.numberOfLeapYears(2000, 2025));

    
        System.out.println("Day of the week for January 5, 2019: " +
                           APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println("Day of the week for January 10, 2019: " +
                           APCalendar.dayOfWeek(1, 10, 2019));

        System.out.println("Day of the week for May 2, 2025: " +
                           APCalendar.dayOfWeek(5, 2, 2025)); // Should be Friday (4)
    }
}
