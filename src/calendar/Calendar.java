package calendar;

import java.util.Date;
import java.util.HashMap;

public class Calendar {
    private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
    private final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

    private HashMap<Date, PlanItem> planMap;

    public Calendar() {
        planMap = new HashMap<Date, PlanItem>();
    }

    public void registerPlan(String strDate, String plan) {
        PlanItem p = new PlanItem(strDate, plan);
        planMap.put(p.getDate(), p);
    }

    public PlanItem searchPlan(String strDate) {
        Date date = PlanItem.getDatefromString(strDate);
        return planMap.get(date);
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month - 1];
        }
        return MAX_DAYS[month - 1];
    }

    public void printCalendar(int year, int month) {
        System.out.printf("    <<%d년 %d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("  --------------------");

        //get weekday automatically
        int weekday = getWeekday(year, month, 1);

        for (int i = 0; i < weekday; i++) {
            System.out.print("   ");
        }

        int maxDay = getMaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int newLine = count < 7 ? count : 0;
        for (int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        count++;
        for (int i = count; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == newLine) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

    }

    private int getWeekday(int year, int month, int day) {
        int syear = 1970;
        final int STANDARD_WEEKDAY = 4; // 1970-01-01 목요일
        int count = 0;

        for (int i = syear; i < year; i++) {
            int delta = isLeapYear(i) ? 366 : 365;
            count += delta;
        }

        for (int i = 1; i < month; i++) {
            int delta = getMaxDaysOfMonth(year, i);
            count += delta;
        }
        count += day - 1;

        int weekday = (count + STANDARD_WEEKDAY) % 7;
        return weekday;
    }

}
