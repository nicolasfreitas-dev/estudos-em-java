package javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        if (cal.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia!");
        }

        System.out.println("-----------------------------------------");

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        cal.add(Calendar.DAY_OF_MONTH, 2);
        cal.roll(Calendar.HOUR, 12);

        System.out.println("-----------------------------------------");

        System.out.println(cal);
        System.out.println(date);
    }
}
