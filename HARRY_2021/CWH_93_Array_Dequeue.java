package HARRY_2021;

import java.util.ArrayDeque;

public class CWH_93_Array_Dequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> l1=new ArrayDeque();
        l1.add(6);
        l1.add(56);

        l1.addFirst(78);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());


    }
}
