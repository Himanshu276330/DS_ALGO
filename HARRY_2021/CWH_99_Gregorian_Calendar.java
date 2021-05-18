package HARRY_2021;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_99_Gregorian_Calendar {
    public static void main(String[] args) {

//        Calendar c=Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE)+ ":" +c.get(Calendar.SECOND));
//
//        GregorianCalendar cal=new GregorianCalendar();
//        System.out.println(cal.isLeapYear(2020));

        for (int i=0;i<629;i++) {
            try{
                System.out.println(TimeZone.getAvailableIDs()[i]);
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
