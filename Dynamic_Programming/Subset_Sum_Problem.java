package Dynamic_Programming;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Subset_Sum_Problem {
    public static void main(String[] args) {

        int []arr={10,5,2,3,6};
        System.out.println(subsetSum_count(arr, arr.length,8));

        int []arr2={2,5,3};
        // (2,3) ,(2) (3) ,(1,2) (2) --> is me se sirf 1 valid h , (2,3),mean digits must be different..
        System.out.println(subsetSum_count(arr2, arr2.length,5));

        System.out.println(subSetSum_Tab(arr2,5));
        System.out.println(subSetSum_Tab(arr,8));

    }//Main Ends.........................................................

    //Plain Recursion....................................................
    static int subsetSum_count(int[] arr,int n,int sum){
        if(n==0)
            return (sum==0)?1:0;
        return subsetSum_count(arr,n-1,sum)+subsetSum_count(arr,n-1,sum-arr[n-1]);
    }

    //Dp(Tabulation).....................................................
    static int subSetSum_Tab(int[] arr,int sum){
        int n=arr.length;
        int[][] dp=new int[n+1][sum+1];

        for(int i=0;i<=sum;i++) dp[0][i]=0;
        for(int i=0;i<=n;i++) dp[i][0]=1;

        for(int row=1;row<=n;row++){
            for(int jSum=1;jSum<=sum;jSum++){
                if(arr[row-1]<=jSum)
                    dp[row][jSum]=dp[row-1][jSum]+dp[row-1][jSum-arr[row-1]];
                else
                    dp[row][jSum]=dp[row-1][jSum];
            }
        }

        //printing matrix for check.............
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }

        //printing subSetSum .................................................
        Stack<pair> stack=new Stack<>();
        if(dp[n][sum]!=0) stack.push(new pair(n,sum));
        int i=1;

        while (!stack.isEmpty()){
            pair temp= stack.pop();
            if(temp.row==0 && temp.col==0) {
                System.out.print("      #"+(i++)+" <--subSet");
                System.out.println(); //for new line..
                continue;
            }

            if(dp[temp.row-1][temp.col]!=0){
                stack.push(new pair(temp.row-1,temp.col));
            }

            if(temp.col-arr[temp.row-1]>=0 && dp[temp.row-1][temp.col-arr[temp.row-1]]!=0){
                stack.push(new pair(temp.row-1,temp.col-arr[temp.row-1]));
                System.out.print(arr[temp.row-1]+" ");
            }
        }

        return dp[n][sum];
    }
    static class pair{
        int row,col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
}
