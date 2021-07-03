package Dynamic_Programming;

import java.util.Arrays;

public class Edit_Distance {
    public static void main(String[] args) {

        String s1="SATURDAY";
        String s2="SUNDAY";
        System.out.println(ed(s1,s2,s1.length(),s2.length()));

        dp=new int[s1.length()+1][s2.length()+1];
        for(int[] e:dp) Arrays.fill(e,-1);
        System.out.println(ed_dp_memoization(s1,s2,s1.length(),s2.length()));

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

    //Using Dp(Memoization)......................................
    static int [][]dp;
    static int ed_dp_memoization(String s1,String s2,int n1,int n2){
        if(n1==0) return n2; //Only option is insert all or delete all n2 character
        if(n2==0) return n1; //Only option is insert all or delete all n1 character

        if(dp[n1][n2]!=-1) return dp[n1][n2];
        if(s1.charAt(n1-1)==s2.charAt(n2-1)){
            return dp[n1][n2]=ed(s1,s2,n1-1,n2-1);
        }
        //1 for either insert,delete,or replace
        return dp[n1][n2]=1+Math.min( /*insert -->*/ ed(s1,s2,n1,n2-1)
                , Math.min(/*delete-->*/  ed(s1,s2,n1-1,n2)
                          ,/*replace-->*/ ed(s1,s2,n1-1,n2-1)));

    }
}
