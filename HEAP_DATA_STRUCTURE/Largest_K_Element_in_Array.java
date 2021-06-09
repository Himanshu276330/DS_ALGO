package HEAP_DATA_STRUCTURE;

import java.util.PriorityQueue;

public class Largest_K_Element_in_Array {
    public static void main(String[] args) {

         int []arr=new int[6]; int k=2;
         int index=0;
         arr[index++]=5;
         arr[index++]=15;
         arr[index++]=10;
         arr[index++]=20;
         arr[index]=8;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        for(;i<k;i++) pq.add(arr[i]);
        for(;i<arr.length;i++){
            if(pq.element()<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()) System.out.print(pq.remove()+" ");
    }
}
