package Calander_Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface newDate = new CalendarToNewDateAdapter();

        newDate.setYear(2029);
        newDate.setMonth(2);
        newDate.setDay(12);

        System.out.println("Date: " + newDate);

        newDate.advanceDays(120);

        System.out.println("Date: " + newDate);
    }
}
