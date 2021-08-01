package ALGORITHMS.Dynamic_Programming;

public class Allocate_Minimum_No_of_Pages {
    public static void main(String[] args) {

        int[] arr={10,20,30,40};
        int[] arr2={10,5,30,1,2,5,10,10};
        System.out.println(minCut(arr,0,arr.length-1,2));
        System.out.println(minCut(arr,0,arr.length-1,1));
        System.out.println(minCut(arr,0,arr.length-1,3));
        count=0;
        System.out.println(minCut(arr2,0,arr2.length-1,3)+" "+count);

        memo=new int[4][2+1];
        System.out.println(minCut_memo(arr,0,3,2));

        memo=new int[arr2.length][4];
        count=0;
        System.out.println(minCut_memo(arr2,0,arr2.length-1,3)+" "+count);

        System.out.println(minCut_Tab(arr2,3));
        System.out.println(minCut_Tab(arr,2));

    }//Main Ends..........................................................

    //Plain Recursion.....................................................
    static int minCut(int[] arr,int s,int e,int k){
        if(k==1){
            return sum(arr,s,e);
        }
        count++;
        int res=Integer.MAX_VALUE;
        for(int i=s;i<e;i++){
            res=Math.min(
                   res,Math.max(sum(arr,s,i),minCut(arr,i+1,e,k-1))
            );
        }
        return res;
    }

    //Dp(Memoization).......................................................
    static int[][] memo;
    static int count;
    static int minCut_memo(int[] arr,int s,int e,int k){
        if(k==1){
            return sum(arr,s,e);
        }
        if(memo[s][k]!=0) return memo[s][k];
        count++;
        int res=Integer.MAX_VALUE;
        for(int i=s;i<e;i++){
            res=Math.min(
                    res,Math.max(sum(arr,s,i),minCut_memo(arr,i+1,e,k-1))
            );
        }
        return memo[s][k]=res;
    }

    //Dp(Tabulation)..........................................................
    static int minCut_Tab(int[] arr,int k){
        int n=arr.length;
        int[][] dp=new int[k+1][n];
        for(int i=0;i<n;i++) dp[0][i]=0;
        for(int i=0;i<n;i++) dp[1][i]=sum(arr,0,i);
        for(int i=2;i<=k;i++) dp[i][0]=arr[0];

        for(int i=2;i<=k;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=Integer.MAX_VALUE;
                for(int a=0;a<j;a++){
                    dp[i][j]=Math.min(
                        Math.max(dp[i-1][a],sum(arr,a+1,j))
                        ,dp[i][j]
                    );
                }
            }
        }
        return dp[k][n-1];
    }
    static int sum(int[] arr,int i,int j){
        int res=0;
        for(int s=i;s<=j;s++) res+=arr[s];
        return res;
    }

}
