package HARRY_2021;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CWH_102_CH_15_PS {
    public static void main(String[] args) {

        //Question 01
        ArrayList<String> name=new ArrayList<>(10);
        name.add("Himanshu");
        name.add("Vishal");
        name.add("Sub-1");
        name.add("Sub-2");
        name.add("Sub-3");
        for (String n :name) {
            System.out.println(n);
        }
//        both work same
//        for (Object n :name) {
//            System.out.println(n);
//        }

        //Question 02
        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //Question 03
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+
                cal.get(Calendar.SECOND));

        //Question 04
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String myTime=df.format(dt);
        System.out.println(myTime);

        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        DateTimeFormatter df2=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String myTime2=df2.format(lt);
        System.out.println(myTime2);

        //Question 05
        HashSet<Integer> h1=new HashSet<>();
        h1.add(6);
        h1.add(96);
        h1.add(56);
        h1.add(45);
        h1.add(6);
        h1.add(45);
        System.out.println(h1);
    }
}
