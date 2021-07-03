package Dynamic_Programming;

public class Coin_Change_Count_Combination {
    public static void main(String[] args) {

        int[] coins={2,5,3,6};
        System.out.println(getCount(coins,coins.length,10));
        System.out.println(count);
        System.out.println(getCount_dp_Tabulation(coins,coins.length,10));

    }//Main Ends.......................................................

    //Plain Recursion.....................................
    static int count=0;
    static int getCount(int []coins,int n,int sum){
         if(sum==0) return 1;
         if(n==0) return 0;
         count++;
         int res=getCount(coins,n-1,sum);
         if(coins[n-1]<=sum){
             res+= getCount(coins,n,sum-coins[n-1]);
         }
         return res;
    }

    //Dp(Tabulation)..........................................
    static int getCount_dp_Tabulation(int[] coins,int n,int sum){
        int[][] dp=new int[sum+1][n+1];
        for(int i=0;i<=n;i++) dp[0][i]=1;
        for(int i=1;i<=sum;i++) dp[i][0]=0;

        for(int iSum=1;iSum<=sum;iSum++){
            for(int jCoin=1;jCoin<=n;jCoin++){
                dp[iSum][jCoin]=dp[iSum][jCoin-1];
                if(coins[jCoin-1]<=iSum){
                    dp[iSum][jCoin]+=dp[iSum-coins[jCoin-1]][jCoin];
                }
            }
        }
        return dp[sum][n];
    }

}
