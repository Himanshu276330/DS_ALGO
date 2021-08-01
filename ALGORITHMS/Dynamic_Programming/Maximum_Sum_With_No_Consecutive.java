package ALGORITHMS.Dynamic_Programming;

import java.util.Arrays;

public class Maximum_Sum_With_No_Consecutive {
    public static void main(String[] args) {

        int []arr={1,10,2};
        int []arr2={8,7,6,10,45,52,68,21};
        System.out.println(maxSumConsecutive(arr,3));
        count=0;
        System.out.println(maxSumConsecutive(arr2,arr2.length)+" count--> "+count);

        memo=new int[11];
        Arrays.fill(memo,-1);count=0;
        System.out.println(maxSumConsecutive_memo(arr2,arr2.length)+" count--> "+count);

        System.out.println(maxSumConsecutive_Tab(arr,arr.length));
        System.out.println(maxSumConsecutive_Tab(arr2,arr2.length));


    }//Main Ends.......................................................

    //Plain Recursion..................................................
    static int maxSumConsecutive(int []arr,int n) {
        if(n==1) return arr[n-1];
        if(n==2) return Math.max(arr[n-1],arr[n-2]);
        count++;
        return Math.max(maxSumConsecutive(arr,n-1),maxSumConsecutive(arr,n-2)+arr[n-1]);
    }

    //Dp(Memoization)..................................................
    static int[] memo;
    static int count;
    static int maxSumConsecutive_memo(int []arr,int n) {
        if(n==1) return arr[n-1];
        if(n==2) return Math.max(arr[n-1],arr[n-2]);
        count++;
        if(memo[n]!=-1) return memo[n];
        return memo[n]=Math.max(maxSumConsecutive_memo(arr,n-1),maxSumConsecutive_memo(arr,n-2)+arr[n-1]);
    }

    //Dp(Tabulation)......................................................
    static int maxSumConsecutive_Tab(int[] arr,int n){
        int []dp=new int[n+1];
        dp[1]=arr[0];
        dp[2]=Math.max(arr[0],arr[1]);

        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1],arr[i-1]+dp[i-2]);
        }
        return dp[n];
    }


}
