package HARRY_2021;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class CWH_101_Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime dt=LocalDateTime.now();
        LocalTime lt=LocalTime.now();
        System.out.println(dt);

//        see java dock
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyy || h:m a || E");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter  df3 =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.MEDIUM );
        DateTimeFormatter  df4 =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.FULL );

        String myDate=dt.format(df);
        String myDate2=dt.format(df2);
        String myDate3=dt.format(df3);
        //DATA_STRUCTURE.String myDate4=dt.format(df4);

        System.out.println(myDate);
        System.out.println(myDate2);
        System.out.println(myDate3);
        //System.out.println(myDate4);

    }
}
