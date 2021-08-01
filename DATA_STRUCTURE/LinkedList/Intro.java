package DATA_STRUCTURE.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Intro {

    public static void main(String[] args) {

        String s="d";
        char c=s.charAt(0);

        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        //All function is same ArrayList ,just revised it
        ll.add(56);
        ll.add(59);
        ll.add(56);
        ll.add(63);
        for (Integer e:ll){
            System.out.println(e);
            if (e==56) System.out.println(true);
        }

        toAddAtEnd(ll);
        toAddAtEnd(al);

        //Important of DATA_STRUCTURE.LinkedList to insert and also deletion of obj in mid
        toAddAtStart(al);
        toAddAtStart(ll);
    }

    public static void toAddAtEnd(List<Integer> e){
        long start=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            e.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(e.getClass().getName()+" --> "+(end-start));
    }

    public static void toAddAtStart(List<Integer> e){
        long start=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            e.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(e.getClass().getName()+" --> "+(end-start));
    }
}


