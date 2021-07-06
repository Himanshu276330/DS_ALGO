package Dynamic_Programming;

import java.util.Arrays;

public class Minimum_Coin_To_make_a_value {
    public static void main(String[] args) {

        int []coins={25,10,5,30};
        int []coins2={25,10,5,30};
//        System.out.println(minCoin(coins2,15));
//        System.out.println(minCoin(coins2,20));
//        System.out.println(minCoin(coins2,35));
        count=0;
        System.out.println(minCoin(coins2,50)+" "+count);

//        int val=50;
//        memo=new int[50+1];
//        Arrays.fill(memo,-1);
//        count=0;
//        System.out.println(minCoin_memo(coins2,val)+" "+count);

        System.out.println(minCoin3(coins2,50));


    }//Main Ends..................................................

    //Simple recursion............................................
    static int minCoin(int []coins,int val){
        if(val==0) return 0;
        count++;
        int ans=Integer.MAX_VALUE;
        for (int coin : coins) {
            if (val >= coin)
                ans=Math.min(1+minCoin(coins, val - coin),ans);
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }

    //Using Dp(Memoization).......................................
    static int []memo;
    static int count;
    static int minCoin_memo(int []coins,int val){
        if(val==0) return 0;

        if(memo[val]!=-1) return memo[val]; //dp
        count++;
        System.out.println(val+" ------val");
        int ans=Integer.MAX_VALUE;
        for (int coin : coins) {
            if (val >= coin)
                ans=Math.min(1+minCoin_memo(coins, val - coin),ans);
        }
        if(ans==Integer.MAX_VALUE) return memo[val]=0;
        return memo[val]=ans;
    }

    //Using Dp(Tabulation).......................................
    static int minCoin3(int []coins,int val){
        int []dp=new int[val+1];
        dp[0]=0;

        for(int i=1;i<=val;i++){
            dp[i]=Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i >= coin)
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[val];
    }
}
