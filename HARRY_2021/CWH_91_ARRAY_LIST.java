package HARRY_2021;

import java.util.*;

public class CWH_91_ARRAY_LIST {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(2);
        l1.add(7);
        l1.add(8);
        l1.add(2);
        l1.add(5);
        l1.add(1, 9);
        l2.add(45);
        l2.add(46);
        l2.add(47);
        l2.add(48);
        l2.add(49);
        l2.add(50);

        //l1.addAll(l2);                   //add all l2 from last index
        l1.addAll(2, l2);            // add all l2 from 2nd index
        //System.out.println(l1.get(0));

        //l1.clear();
        l1.set(0,454);
        for(int i=0;i< l1.size();i++){
        System.out.print(l1.get(i)+" ");
        }

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(9));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));


    }
}