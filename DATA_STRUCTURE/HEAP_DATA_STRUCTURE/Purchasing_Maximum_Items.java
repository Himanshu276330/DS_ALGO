package DATA_STRUCTURE.HEAP_DATA_STRUCTURE;

import java.util.PriorityQueue;

public class Purchasing_Maximum_Items {
    public static void main(String[] args) {

//        int []cost={1,12,5,3,112,200};
//        int money=25;

        int []cost={20,10,5,30,100};
        int money=35;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int e:cost) pq.add(e);

        int item=0;
        while (money>0){
            if(pq.element()<=money){
                item++;
                money-=pq.remove();
            }else break;
        }
        System.out.println(item);
    }
}
