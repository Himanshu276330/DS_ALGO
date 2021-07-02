package Dynamic_Programming;

import java.util.Arrays;

public class Longest_Common_SubSequence {
    public static void main(String[] args) {

        String s1="ABCDGH";
        String s2="AEDFHR";
        memo=new int[s1.length()][s2.length()];
        for(int []e:memo) Arrays.fill(e,-1);
        count1=0;count2=0;
        System.out.println(lcs(s1,s2,s1.length()-1,s2.length()-1));
        System.out.println(count1);
        System.out.println(lcs_dp_Memoization(s1,s2,s1.length()-1,s2.length()-1));
        System.out.println(count2);

        String s11="AXYZ";
        String s22="BAZ";
        count1=0;   count2=0;
        for(int []e:memo) Arrays.fill(e,-1);
        System.out.println(lcs(s11,s22,s11.length()-1,s22.length()-1)+" "+count1);
        System.out.println(lcs_dp_Memoization(s11,s22,s11.length()-1,s22.length()-1)+" "+count2);

    }//MAINS ENDS............................................
    static int count1,count2;

    //Plain recursion code............................................
    static int lcs(String s1,String s2,int n1,int n2){
        if(n1==-1 || n2==-1) return 0;
        count1++;
        if(s1.charAt(n1)==s2.charAt(n2)){
            return 1+lcs(s1,s2,n1-1,n2-1);
        }
        return Math.max(lcs(s1,s2,n1-1,n2),lcs(s1,s2,n1,n2-1));
    }

    //Using DP(Memoization)...........................................
    static int [][]memo;
    static int lcs_dp_Memoization(String s1,String s2,int n1,int n2){
        if(n1==-1 || n2==-1) return 0;
        if(memo[n1][n2]!=-1) return memo[n1][n2];
        count2++;
        if(s1.charAt(n1)==s2.charAt(n2)){
            return memo[n1][n2]=1+lcs_dp_Memoization(s1,s2,n1-1,n2-1);
        }
        return memo[n1][n2]=Math.max(lcs_dp_Memoization(s1,s2,n1-1,n2),lcs_dp_Memoization(s1,s2,n1,n2-1));
    }

    //Using DP(Tabulation)...............................................
    static int lcs_dp_Tabulation(String s1,String s2){
        int m=s1.length(),n=s2.length();
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int i=0;i<=m;i++) dp[0][i]=0;

        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        return dp[m][n];
    }

}
