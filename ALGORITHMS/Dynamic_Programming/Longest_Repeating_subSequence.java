package ALGORITHMS.Dynamic_Programming;

import java.util.Arrays;

public class Longest_Repeating_subSequence {
    public static void main(String[] args) {

        String str="AABB";
        System.out.println(lrs(str,str,str.length()-1,str.length()-1));
        String str2="AAA";
        System.out.println(lrs(str2,str2,str2.length()-1,str2.length()-1));

        memo=new int[str.length()][str.length()];
        for(int []e:memo) Arrays.fill(e,-1);
        System.out.println(lrs_momo(str,str,str.length()-1,str.length()-1));

        System.out.println(lrs_Tabu(str));
        System.out.println(lrs_Tabu2(str));
        System.out.println(lrs_Tabu2(str2));

        String str3="AABBAACCBB";
        System.out.println(lrs_Tabu2(str3));


    }//Main Ends.......................................................

    //Simple Recursion ................................................
    static int lrs(String s1,String s2,int n1,int n2){
        if(n1==-1 || n2==-1) return 0;
        //System.out.println("=======");
        if(s1.charAt(n1)==s2.charAt(n2) && n1!=n2){  //This line is differ from lcs problem
            return 1+lrs(s1,s2,n1-1,n2-1);
        }
        return Math.max(lrs(s1,s2,n1-1,n2),lrs(s1,s2,n1,n2-1));
    }

    //Recursion with DP(Memoization)..................................
    static int [][]memo;
    static int lrs_momo(String s1,String s2,int n1,int n2){
        if(n1==-1 || n2==-1) return 0;
        if(memo[n1][n2]!=-1) return memo[n1][n2];
        //System.out.println("---------");
        if(s1.charAt(n1)==s2.charAt(n2) && n1!=n2){  //This line is differ from lcs problem
            return memo[n1][n2]=1+lrs_momo(s1,s2,n1-1,n2-1);
        }
        return memo[n1][n2]=Math.max(lrs_momo(s1,s2,n1-1,n2),lrs_momo(s1,s2,n1,n2-1));
    }

    //Recursion with DP(Tabulation)....................................
    static int lrs_Tabu(String str){
        int m=str.length();
        int [][]dp=new int[m+1][m+1];
        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int i=0;i<=m;i++) dp[0][i]=0;

        for(int i=1;i<=m;i++)
            for(int j=1;j<=m;j++){
                if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[j][i-1]);
            }

        return dp[m][m];
    }

    //Recursion with DP(Tabulation)....................................
    static int lrs_Tabu2(String str){
        int m=str.length();
        int [][]dp=new int[2][m+1];  //Linear space............
        for(int i=0;i<=1;i++) dp[i][0]=0;
        for(int i=0;i<=m;i++) dp[0][i]=0;
        boolean up=true;

        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= m; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    if (up)
                        dp[1][j] = 1 + dp[0][j - 1];
                    else
                        dp[0][j] = 1 + dp[1][j - 1];
                }else {
                    if (up)
                        dp[1][j] = Math.max(dp[0][j], dp[1][j - 1]);
                    else
                        dp[0][j] = Math.max(dp[1][j], dp[0][j - 1]);
                }
            }
            up=!up;
        }
        if(up) return dp[0][m];
        return dp[1][m];
    }

}
