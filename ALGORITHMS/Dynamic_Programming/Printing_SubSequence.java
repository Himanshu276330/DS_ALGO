package ALGORITHMS.Dynamic_Programming;

public class Printing_SubSequence {
    public static void main(String[] args) {

        String s1="ABCDGH";
        String s2="AEDFHR";
        System.out.println(lcs_dp_Tabulation(s1,s2));

    }//MAINS ENDS....................................

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

        //Print subsequence........
        int x=m,y=n;
        StringBuilder sb=new StringBuilder();
        while (x>0 && y>0){
            if(s1.charAt(x-1)==s2.charAt(y-1)){
                sb.insert(0, ""+s1.charAt(x-1));
                x--;y--;
            }else{
                if(dp[x-1][y]>dp[x][y-1]) x--;
                else y--;
            }
        }
        System.out.println(sb);
        return dp[m][n];
    }
}
