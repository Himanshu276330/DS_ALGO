package CollectionFramework.L_49_hashCode_and_equals;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {

        Pen pen1=new Pen(11,"blue");
        Pen pen2=new Pen(10,"blue");

        System.out.println(pen1==pen2);
        System.out.println(pen1.equals(pen2));
           //Store at diff memory position
        System.out.println(pen1);
        System.out.println(pen2);

        Set<Pen> pens =new HashSet<>();
          //set treat both pen diff , because set allowed unique  value ,but we see that bot pen is same
          //this problem arises because hashCode of both is diff , so we first define our own hashCode()
        pens.add(pen1);
        pens.add(pen2);
        System.out.println(pens);

        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
    }
}
