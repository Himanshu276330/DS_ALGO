package DATA_STRUCTURE.HEAP_DATA_STRUCTURE;

import java.util.*;

public class Sort_K_Sorted_Array {
    public static void main(String[] args) {

        int []arr=new int[6];
        int k=2;
        arr[0]=9;arr[1]=8;arr[2]=7;arr[3]=19;arr[4]=18;arr[5]=20;

               //Naive Approach  ...  O(nlog(n))
        //DATA_STRUCTURE.Arrays.sort(arr);

              //Better approach........ O(nlog(k))
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        int index=0;
        for(int i=k+1;i<arr.length;i++){
            arr[index++]=pq.remove();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty())
            arr[index++]=pq.remove();


        //printing element of arr.
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
