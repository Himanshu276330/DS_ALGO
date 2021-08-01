package ALGORITHMS.Dynamic_Programming;

import java.util.Arrays;

public class Edit_Distance {
    public static void main(String[] args) {

        String s1="SATURDAY";
        String s2="SUNDAY";
        System.out.println(ed(s1,s2,s1.length(),s2.length()));

        dp=new int[s1.length()+1][s2.length()+1];
        for(int[] e:dp) Arrays.fill(e,-1);
        System.out.println(ed_dp_memoization(s1,s2,s1.length(),s2.length()));

        System.out.println(ed_Dp_Tabulation(s1,s2));

    }//Main Ends................................................

    //Plain Recursion ...........................................
    static int ed(String s1,String s2,int n1,int n2){
        if(n1==0) return n2; //Only option is insert all or delete all n2 character
        if(n2==0) return n1; //Only option is insert all or delete all n1 character

        if(s1.charAt(n1-1)==s2.charAt(n2-1)){
            return ed(s1,s2,n1-1,n2-1);
        }
        //1 for either insert,delete,or replace
        return 1+Math.min( /*insert --> */ ed(s1,s2,n1,n2-1)
                , Math.min(/*delete--> */ed(s1,s2,n1-1,n2)
                          ,/*replace--> */ed(s1,s2,n1-1,n2-1)));

    }

    //Using Dp(Memoization)........................................
    static int [][]dp;
    static int ed_dp_memoization(String s1,String s2,int n1,int n2){
        if(n1==0) return n2; //Only option is insert all or delete all n2 character
        if(n2==0) return n1; //Only option is insert all or delete all n1 character

        if(dp[n1][n2]!=-1) return dp[n1][n2];
        if(s1.charAt(n1-1)==s2.charAt(n2-1)){
            return dp[n1][n2]=ed(s1,s2,n1-1,n2-1);
        }
        //1 for either insert,delete,or replace.
        return dp[n1][n2]=1+Math.min( /*insert -->*/ ed(s1,s2,n1,n2-1)
                , Math.min(/*delete-->*/  ed(s1,s2,n1-1,n2)
                          ,/*replace-->*/ ed(s1,s2,n1-1,n2-1)));

    }

    //Using Dp(Tabulation)...........................................
    static int ed_Dp_Tabulation(String s1,String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) dp[i][0] = i;
        for (int i = 0; i <= s2.length(); i++) dp[0][i] = i;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
