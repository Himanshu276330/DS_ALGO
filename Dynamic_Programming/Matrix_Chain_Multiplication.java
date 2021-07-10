package Dynamic_Programming;

import java.util.Arrays;

public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {

        int[] arr={2,1,3,4};
        int[] arr2={2,1,3,8,6,5,4,5,2,3};
        int[] arr3={20,10,30,40};count=0;
        System.out.println(minIntegerMultiplication(arr,0,3)+" count of plane recursion--> "+count);
        count=0;
        System.out.println(minIntegerMultiplication(arr2,0,arr2.length-1)+" count of plane recursion-->"+count);
        System.out.println(minIntegerMultiplication(arr3,0,3));

        memo=new int[arr.length][arr.length];count=0;
        System.out.println(minIntegerMultiplication_memo(arr,0,arr.length-1)+" count of memo-->"+count);

        memo=new int[arr2.length][arr2.length];count=0;
        System.out.println(minIntegerMultiplication_memo(arr2,0,arr2.length-1)+" count of memo--> "+count);

        System.out.println(minIntegerMultiplication_Tab(arr));
        System.out.println(minIntegerMultiplication_Tab(arr2));


    }//Main Ends..............................................................

    //Plain Recursion..........................................................
    static int minIntegerMultiplication(int[] arr,int i,int j){
        if(i==j) return 0;
        if(i+1==j) return 0;
        count++;
        int res=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            res=Math.min(res , arr[i]*arr[k]*arr[j]+minIntegerMultiplication(arr,i,k)
                    +minIntegerMultiplication(arr,k,j));
        }
        return res;
    }

    //Dp(Memoization)..........................................................
    static int[][] memo;
    static int count;
    static int minIntegerMultiplication_memo(int[] arr,int i,int j){
        if(i==j) return 0;
        if(i+1==j) return 0;

        if(memo[i][j]!=0) return memo[i][j];
        count++;
        int res=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            res=Math.min(res , arr[i]*arr[k]*arr[j]+minIntegerMultiplication_memo(arr,i,k)
                    +minIntegerMultiplication_memo(arr,k,j));
        }
        return memo[i][j]=res;
    }

    //Dp(Tabulation)...........................................................
    static int minIntegerMultiplication_Tab(int[] arr){
        int n=arr.length;
        int [][]dp=new int[n][n];     //we create 1 index based dp...
        for(int j=1;j<n;j++) dp[j-1][j]=0;
        for(int j=2;j<n;j++) dp[j-2][j]=arr[j-2]*arr[j-1]*arr[j];

        for(int gap=3;gap<n;gap++) {
            for (int row = 0, col = gap; row < n && col < n; row++, col++) {
                dp[row][col]=Integer.MAX_VALUE;
                for(int k=row+1;k<col;k++){
                    dp[row][col]=Math.min(dp[row][col],arr[row]*arr[k]*arr[col]
                                                       +dp[row][k]+dp[k][col]);
                }
            }
        }
        //for Check......
        //for(int i=0;i<n;i++) {
        //    for (int j = 0; j < n; j++)
        //        System.out.print(dp[i][j] + " ");
        //    System.out.println();
        //}

        return dp[0][n-1];
    }

}
