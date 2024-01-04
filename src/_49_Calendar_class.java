import java.util.Calendar;

public class _49_Calendar_class {
    public static void main(String[] args) {
        Calendar cl=Calendar.getInstance();
        System.out.println(cl.getCalendarType());
        System.out.println(cl.getFirstDayOfWeek());
        System.out.println(cl.getTimeZone());
    }
}
