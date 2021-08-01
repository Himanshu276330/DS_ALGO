package DATA_STRUCTURE.CollectionFramework.L_43_Deque;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad=new ArrayDeque<>();
//        ad.addFirst(12);
//        ad.addFirst(123);

//        ad.pop();  //Removed last
//        System.out.println(ad.peek());

//        ad.push(12);
//        ad.push(23);
//        ad.push(34);
//
//        System.out.println(ad.pop());
//        System.out.println(ad.pop());

          //Creating our own Deque class
        MyDeque<Integer> md=new MyDeque<>();
        md.addToFirst(36);
        md.addToFirst(24);
        md.addToFirst(12);

        md.addToLast(36);
        md.addToLast(24);
        md.addToLast(12);

        md.print();

    }
}
