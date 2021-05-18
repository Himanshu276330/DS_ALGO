package Algoriths_For_Placement.L_54_BackTracking;

import java.util.ArrayList;

public class Split_Array_Into_two_equal_sum {
    public static void main(String[] args) {

        int a[] = {2,1,2,3,4,8};
        int sum=0;
        for (int e:a){
            sum+=e;
        }
        System.out.println(sum);

        ArrayList<Integer> ans=new ArrayList<>();
        //if last bit of sum is 1-->even ,but if 0-->odd
        // and '&' operator do bit wise operation bw 1 and last bit of sum
        boolean isPossible= (sum&1)==0 && partition(a, sum/2 , 0, ans );

        if (isPossible){
            for (Integer e:ans){
                System.out.print(e+" ");
            }
        }else{
            System.out.println("Not Possible");
        }
    }
    static boolean partition(int a[], int sum ,int i, ArrayList<Integer> ans){
        if (i>=a.length || sum<0) return false;

        ans.add(a[i]);
        boolean leftPossible=partition(a,sum-a[i],i+1,ans);
        if (leftPossible) return true;

            //This makes backtracking possible.
        ans.remove(ans.size()-1);
        return partition(a,sum,i+1,ans);
    }

}
