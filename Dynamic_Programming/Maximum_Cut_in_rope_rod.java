package Dynamic_Programming;

import java.util.Arrays;

public class Maximum_Cut_in_rope_rod {
    public static void main(String[] args) {

        int len_of_rope=5;
        int c1=1,c2=2,c3=3; //Allowed cuts are..
        System.out.println(cut_count(len_of_rope,c1,c2,c3));

        int len_of_rope2=9;
        int c11=2,c22=2,c33=2; //Allowed cuts are............
        System.out.println(cut_count(len_of_rope2,c11,c22,c33));

        System.out.println(cut_count2(9,2,2,2));
        System.out.println(cut_count2(5,1,2,3));


    }//Main ENDS......................................................

    //Plain Recursive solution........Time complexity =(3^n)..........
    static int cut_count(int len_of_rope,int c1,int c2,int c3){
        if (len_of_rope==0) return 0;
        if(len_of_rope<0) return -1;

        int res=Math.max(cut_count(len_of_rope-c1,c1,c2,c3)
                ,Math.min(cut_count(len_of_rope-c2,c1,c2,c3)
                        ,cut_count(len_of_rope-c3,c1,c2,c3)));

        if(res==-1) return -1; //If all return -1 then return -1 for no partition possible for given cut.
        return res+1;
    }

    //Dp solution ..............Time complexity =O(n)...................
    static int cut_count2(int len_of_rope,int c1,int c2,int c3){
        int []dp=new int[len_of_rope+1];
        dp[0]=0;

        for(int i=1;i<=len_of_rope;i++){
            dp[i]=-1;
            if(i-c1>=0) dp[i]=Math.max(dp[i],dp[i-c1]);
            if(i-c2>=0) dp[i]=Math.max(dp[i],dp[i-c2]);
            if(i-c3>=0) dp[i]=Math.max(dp[i],dp[i-c3]);

            if(dp[i]!=-1) dp[i]++;
        }
        return dp[len_of_rope];
    }


}
