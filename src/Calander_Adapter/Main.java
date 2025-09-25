package Calander_Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface newDate = new CalendarToNewDateAdapter();

        newDate.setYear(2025);
        newDate.setMonth(9);
        newDate.setDay(25);

        System.out.println("Date: " + newDate);

        newDate.advanceDays(10);

        System.out.println("Date: " + newDate);
    }
}
