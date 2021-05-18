package CollectionFramework.L_45_Sliding_Window_Question;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        Solution sol=new Solution();
        int a[] ={4,3,1,2,5,3,4,7,1,9};
        int ans[] =sol.maxSlidingWindow(a,4);

        for (int x:ans){
            System.out.print(x+" ");
        }
        System.out.println();

        Solution2 sol2=new Solution2();
        int ans2[] =sol2.maxSlidingWindow(a,4);

        for (int x:ans2){
            System.out.print(x+" ");
        }

    }

    static class Solution{
        public  int[] maxSlidingWindow(int[] a, int k){
            int n=a.length;
            if (n<=1) return a;   //For empty array and single array.
            Deque<Integer> dq=new LinkedList<>();
            int ans [] =new int[n-k+1];
            int i=0;
            for(;i<k;i++){
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            for (;i<n;i++){
                ans[i-k]=a[dq.peekFirst()];
                while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                    dq.removeFirst();
                }
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            ans[i-k]=a[dq.peekFirst()];
            return ans;
        }
    }


     //By using priority queue
    static class Solution2{
        public int[] maxSlidingWindow(int[] a,int k){
            int n=a.length;
            int [] ans=new int[n-k+1];
            Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
            for (int i=0;i<=n-k;i++){
                pq.clear();
                for (int j=i;j<i+k;j++){
                    pq.add(a[j]);
                }
                ans[i]=pq.peek();
            }
            return ans;
        }
    }
}
