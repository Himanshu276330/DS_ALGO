package ALGORITHMS.Dynamic_Programming;

public class Palindromic_Partitioning {
    public static void main(String[] args) {

        System.out.println(minCut("g",0,0));
        System.out.println(minCut("ge",0,1));
        System.out.println(minCut("ee",0,1));
        System.out.println(minCut("geek",0,3));
        System.out.println(minCut("abbac",0,4));
        System.out.println(minCut("abbabbc",0,6)+" count of plane recursion-->"+count);

        count=0;
        memo=new int[6+1][6+1];
        System.out.println(minCut_memo("abbabbc",0,6)+" count of dp memo-->"+count);

        System.out.println(minCut_Tab("abbabbc",0,6));
        System.out.println(minCut_Tab("abbabba",0,6));
        System.out.println(minCut_Tab("geek",0,3));

    }//Main Ends................................................................

    //Plain Recursion...........................................................
    static int minCut(String str,int s,int e){
        if(checkPalindrome(str,s,e)) return 0;
        count++;
        int res=Integer.MAX_VALUE;
        for(int i=s;i<e;i++){
            res=Math.min(res,minCut(str,s,i)+minCut(str,i+1,e));
        }
        return res+1;
    }

    //Dp(Memoization).............................................................
    static int [][]memo;
    static int count;
    static int minCut_memo(String str,int s,int e){
        if(checkPalindrome(str,s,e)) return 0;

        if(memo[s][e]!=0) return memo[s][e];
        count++;
        int res=Integer.MAX_VALUE;
        for(int i=s;i<e;i++){
            res=Math.min(res,minCut_memo(str,s,i)+minCut_memo(str,i+1,e));
        }
        return memo[s][e]=res+1;
    }

    //Dp(Tabulation).............................................................
    static int minCut_Tab(String str,int s,int e){
        int[][] dp=new int[e+1][e+1];
        for(int j=0;j<=e;j++) dp[j][j]=0;

        for(int gap=1;gap<=e;gap++){
            for(int i=0,j=gap;j<=e;j++,i++){
                if(checkPalindrome(str,i,j)) {
                    dp[i][j]=0;
                }else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j]);
                    }
                    dp[i][j]++;
                }
            }
        }
        return dp[0][e];
    }

    //Utility Function.............
    static boolean checkPalindrome(String str,int i,int j){
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }


}
