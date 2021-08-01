package ALGORITHMS.Dynamic_Programming;

public class Count_BST_With_N_Key {
    public static void main(String[] args) {

        System.out.println(count_BST(4));
        System.out.println(count_BST(5));
        System.out.println(count_BST(3));
        System.out.println(count_BST(2));
        System.out.println(count_BST(1));

        memo=new int[100];
        System.out.println(count_BST_memo(5));
        System.out.println(count_BST_memo(4));

        System.out.println(count_BST_Tab(5));
        System.out.println(count_BST_Tab(4));


    }//Mains End...................................................

    //Plain Recursion..............................................
    static int count_BST(int key) {
        if (key == 0 || key == 1) return 1;

        int ans = 0;
        for (int i = 0; i < key; i++) {
            ans += count_BST(i) * count_BST(key - 1 - i);
        }
        return ans;
    }

    //Dp(Memoization)..............................................
    static int []memo;
    static int count_BST_memo(int key) {
        if (key == 0 || key == 1) return 1;

        if (memo[key]!=0) return memo[key];
        int ans = 0;
        for (int i = 0; i < key; i++) {
            ans += count_BST_memo(i) * count_BST_memo(key - 1 - i);
        }
        return memo[key]=ans;
    }

    //Dp(Tabulation)...............................................
    static int count_BST_Tab(int key){
        int []dp=new int[key+1];
        dp[0]=1;dp[1]=1;

        for(int i=2;i<=key;i++){
            dp[i]=0;
            for(int j=0;j<i;j++)
                dp[i]+=dp[j]*dp[i-1-j];
        }
        return dp[key];
    }


}