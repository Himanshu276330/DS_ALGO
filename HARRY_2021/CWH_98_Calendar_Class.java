package HARRY_2021;

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_Calendar_Class {
    public static void main(String[] args) {

        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        Calendar c2=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone());
        System.out.println(c2.getTimeZone().getID());
    }
}
