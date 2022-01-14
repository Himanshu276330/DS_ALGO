package Algoriths_For_Placement.L_58_Dynamic_Programming;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int n=18;
        int []a={7,5,1};

//        System.out.println(minCoins(n,a));

        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;

        System.out.println(minCoins(n,a,dp));
        for (int e:dp){
            System.out.print(e+" ");
        }

    }

      //withOut using Dynamic Programming.
    static int minCoins(int n,int a[]){
        if(n==0) return 0;
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (n-a[i] >=0){
                int subAns=minCoins(n-a[i],a);
                if (subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        return ans;
    }




    //with using Dynamic Programming.
    static int minCoins(int n,int a[],int []dp){
        if(n==0) return 0;
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (n-a[i] >=0){
                int subAns=0;
                if (dp[n-a[i]]!=-1){
                    subAns=dp[n-a[i]];
                }else{
                    subAns=minCoins(n-a[i],a,dp);
                }

                if (subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        return dp[n]=ans;
    }

}
