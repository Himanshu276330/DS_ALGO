package HARRY_2021;

import java.util.*;

public class CWH_92_ArrayList_VS_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
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

        l1.addLast(855);
        l1.addFirst(955);  //this two not in arraylist

        //l1.addAll(l2);                   //add all l2 from last index
        l1.addAll(2, l2);            // add all l2 from 2nd index
        //System.out.println(l1.get(0));

        //l1.clear();
        l1.set(0,454);   // 0 index wala ko hata kar set hoga
        for(int i=0;i< l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(9));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));
    }
}
