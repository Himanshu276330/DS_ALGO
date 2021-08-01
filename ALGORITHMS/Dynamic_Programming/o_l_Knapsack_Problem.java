package ALGORITHMS.Dynamic_Programming;

public class o_l_Knapsack_Problem {
    public static void main(String[] args) {

        int []weight={5,4,6,3};
        int []value={10,40,30,50};
        int bagCapacity=10; //weight...
        //System.out.println(maxValue(weight,value,bagCapacity, weight.length));

        int []weight2={10,20,30};
        int []value2={60,100,120};
        int bagCapacity2=50; //weight...
        //System.out.println(maxValue(weight2,value2,bagCapacity2, weight2.length));

        System.out.println(maxValue_Tab(weight,value,10));
        System.out.println(maxValue_Tab(weight2,value2,50));



    }//Main ENDS...................................................

    //Plain Recursion..............................................
    static int maxValue(int []weight,int []value,int cap,int a){
        if(a==0 || cap==0) return 0;

        int res=0;
        if(weight[a-1]<=cap){
            res=value[a-1]+maxValue(weight,value,cap-weight[a-1],a-1);
        }
        res=Math.max(res,maxValue(weight,value,cap,a-1));
        return res;
    }

    //Dp(Tabulation)...............................................
    static int maxValue_Tab(int[] weight,int[] value,int w){
        int [][]dp=new int[value.length+1][w+1];

        for(int i=0;i<=value.length;i++) dp[i][0]=0;
        for(int i=0;i<=w;i++) dp[0][i]=0;

        for(int i=1;i<=value.length;i++){
            for(int j=1;j<=w;j++){
                dp[i][j]=0;
                if(weight[i-1]<=j)
                    dp[i][j]=value[i-1]+dp[i-1][j-weight[i-1]]; //weight[i] is taken

                dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);  //max of weight[i] is or not..
            }
        }

        //print..dp..for..check............
        for(int i=0;i<=value.length;i++){
            for(int j=0;j<=w;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }

        return dp[value.length][w];
    }


}
