package HEAP_DATA_STRUCTURE;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Print_K_Closest_Element {
    public static void main(String[] args) {

        int []arr=new int[6];
        arr[0]=30;
        arr[1]=40;
        arr[2]=32;
        arr[3]=33;
        arr[4]=36;
        arr[5]=37;
        int x=38; int k=3;

                 //Naive sol
        boolean []vis=new boolean[arr.length];
        for(int i=0;i<k;i++){
            int diff=Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<arr.length;j++){
                if(!vis[j]) {
                    int abs = Math.abs(arr[j] - x);
                    if (abs < diff) {
                        diff = abs;
                        index = j;
                    }
                }
            }
            System.out.print(arr[index]+" ");
            vis[index]=true;
        }
        System.out.println();

                //Better sol
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparing(Pair::getFirst).reversed());
        int i=0;
        for(;i<k;i++){
            pq.add(new Pair(Math.abs(arr[i]-x),i));
        }
        for(;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            if(pq.element().first>diff){
                pq.remove();
                pq.add(new Pair(diff,i));
            }
        }
        while (!pq.isEmpty()){
            System.out.print(arr[pq.remove().second]+" ");
        }

    }
}

