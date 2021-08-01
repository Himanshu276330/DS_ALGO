package DATA_STRUCTURE.CollectionFramework.L_44_Priority_Queue;

import java.util.*;

public class Practice_Question {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Ternary_Search cases: ");
        int t=sc.nextInt();
        while(t-->0){
            System.out.print("Enter no of element in array: ");
            int n=sc.nextInt();
            System.out.print("Entered required greatest no from array: ");
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                System.out.print("Enter element of array: ");
                a[i]=sc.nextInt();
            }
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i=0;i<n;i++){
                if (i<k){
                    pq.add(a[i]);
                }else{
                    if (pq.element()<a[i]){
                        pq.poll();
                        pq.add(a[i]);
                    }
                }
            }
            ArrayList<Integer> ans=new ArrayList<>(pq);
            Collections.sort(ans,Collections.reverseOrder());
            for (int x:ans){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
