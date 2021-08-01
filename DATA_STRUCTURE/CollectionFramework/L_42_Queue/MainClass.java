package DATA_STRUCTURE.CollectionFramework.L_42_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();

            //Both do same work but removed throw exception
        System.out.println(q.poll());
//        q.remove();


            //Both do same work but only diff is add throw exception when Queue is full
        q.add(56);
        q.add(45);
        q.add(26);
        q.offer(56);
        q.offer(45);
        q.offer(26);

//        System.out.println(q);

//        System.out.println(q.remove());   //First remove 56 which we insert at first
//           //Both do same work but only diff is [remove] throw exception when Queue is null
//        System.out.println(q.poll());      //this time 45 is removed

           //Using our own Dequeue class
//        MyDequeue<Integer> md=new MyDequeue<>();
//
//        md.enqueue(12);
//        md.enqueue(56);
//        md.enqueue(98);
//        md.enqueue(256);

//        System.out.println(md.dequeue());
//        System.out.println(md.dequeue());
//        System.out.println(md.dequeue());
//        System.out.println(md.dequeue());
//        md.enqueue(2564);
//        System.out.println(md.dequeue());
//        md.enqueue(875);
//        System.out.println(md.element());

     }
}
