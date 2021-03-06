package ALGORITHMS.Dynamic_Programming;

import java.util.Arrays;

public class EGG_Dropping_Puzzle {
    public static void main(String[] args) {

        int floor=10,egg=2;count=0;
        System.out.println(solve(floor,egg)+" count--> "+count);
        System.out.println(solve(floor,1));

        memo=new int[floor+1][egg+1];count=0;
        for(int []e:memo) Arrays.fill(e,-1);
        System.out.println(solve_memo(floor,egg)+" count--> "+count);

        System.out.println(solve_Tab(floor,1));

        System.out.println(solve_Tab(floor,5));

        System.out.println(solve_Tab_binary(floor,5));

    }//Main Ends............................................

    //Plain Recursion.......................................
    static int solve(int floor,int egg){
        if(floor==0) return 0;
        if(floor==1) return 1;
        if(egg==1) return floor;

        count++;
        int ans=Integer.MAX_VALUE;

        //we add 1 to ans for that trail........................
        for(int x=1;x<=floor;x++){
            ans=Math.min(ans
                    //We take max because we assumed worst case..
                    ,Math.max(solve(x-1,egg-1),solve(floor-x,egg))
            );
        }
        return ans+1;
    }

    //Dp(Memoization).........................................
    static int [][]memo;
    static int count;
    static int solve_memo(int floor,int egg){
        if(floor==0) return 0;
        if(floor==1) return 1;
        if(egg==1) return floor;

        if(memo[floor][egg]!=-1) return memo[floor][egg];
        int ans=Integer.MAX_VALUE;
        count++;
        //we add 1 to ans for that trail........................
        for(int x=1;x<=floor;x++){
            ans=Math.min(ans
                    //We take max because we assumed worst case..
                    ,Math.max(solve_memo(x-1,egg-1),solve_memo(floor-x,egg))
            );
        }
        return memo[floor][egg]=ans+1;
    }


    //Dp(Tabulation).............................................
    static int solve_Tab(int floor,int egg){
        int [][]dp=new int[floor+1][egg+1];
        for(int i=0;i<=floor;i++) {
            dp[i][0]=0;
            dp[i][1]=i;
        }
        dp[0][0]=dp[1][0]=0;
        for(int i=1;i<=egg;i++){
            dp[0][i]=0;
            dp[1][i]=1;
        }

        for(int iFloor=2;iFloor<=floor;iFloor++){
            for(int jEgg=2;jEgg<=egg;jEgg++){
                dp[iFloor][jEgg]=Integer.MAX_VALUE;
                for(int x=1;x<=iFloor;x++){
                    dp[iFloor][jEgg]=Math.min( dp[iFloor][jEgg]
                            ,Math.max(dp[x-1][jEgg-1],dp[iFloor-x][jEgg])
                    );
                }
                dp[iFloor][jEgg]++;
            }
        }
        return dp[floor][egg];
    }

    //Dp(Tabulation).... By Binary Search.........................................
    static int solve_Tab_binary(int floor,int egg){ //A=egg , b =floor
        int [][]dp=new int[egg+1][floor+1];
        for(int i=1;i<=floor;i++)
            dp[1][i]=i;

        for(int i=1;i<=egg;i++)
        {
            dp[i][1]=1;
        }
        //int low=0,high=0;
        for(int i=2;i<=egg;i++)
        {
            for(int j=2;j<=floor;j++)
            {
                int low = 1;
                int high = j;
                while(low<=high){
                    int mid = (low+high)/2;
                    if(dp[i-1][mid-1]<dp[i][j-mid]) low = mid+1;
                    else high = mid-1;
                }
                int option1 = Math.max(dp[i-1][low-1],dp[i][j-low]);
                int option2 = Math.max(dp[i-1][high-1],dp[i][j-high]);
                dp[i][j] = 1 + Math.min(option1,option2);
            }
        }
        return dp[egg][floor];
    }


}
