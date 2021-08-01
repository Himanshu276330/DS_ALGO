package DATA_STRUCTURE.CollectionFramework.L_44_Priority_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {

//        PriorityQueue<DATA_STRUCTURE.String>  pq=new PriorityQueue<>();
//
//        pq.add("Kiwi");
//        pq.add("Apple");
//        pq.add("Mango");
//        pq.add("Banana");
//           //in PriorityQueue element is not in shorter  form
//        System.out.println(pq);
//           //But when removed it removed in shorted way
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        pq2.add(24);
        pq2.add(56);
        pq2.add(58);
        pq2.add(1);
        pq2.add(586);
        System.out.println(pq2.isEmpty());

        System.out.println(pq2);

        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());

        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Comparator.reverseOrder());    //Important

        pq3.offer(24);
        pq3.offer(56);
        pq3.offer(58);
        pq3.offer(1);
        pq3.offer(586);

        System.out.println(pq3);

        System.out.println(pq3.remove());
        System.out.println(pq3.remove());
        System.out.println(pq3.remove());
        System.out.println(pq3.remove());
        System.out.println(pq3.remove());
    }
}
