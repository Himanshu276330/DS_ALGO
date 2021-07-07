package Dynamic_Programming;

public class Optimal_Strategy_for_aGame {
    public static void main(String[] args) {

            //You have to get max sum..
        int []value={20,5,4,6};
//        System.out.println(maxValue(value,0,value.length-1));
//        int sum=0;
//        for(int e:value) sum+=e;
//        System.out.println(maxValue2(value,0,value.length-1,sum));

        int []value2={2,3,15,7};
        System.out.println(maxValue(value2,0,value2.length-1));
        int sum2=0;
        for(int e:value2) sum2+=e;
        System.out.println(maxValue2(value2,0,value2.length-1,sum2));

        System.out.println(maxValue_Tab(value2));
        System.out.println(maxValue_Tab(value));

    }//Main Ends............................................
    static int maxValue(int []value,int s,int e){
        if(s+1==e) return Math.max(value[s],value[e]);

        return Math.max(
                value[s]+
                        Math.min(maxValue(value,s+2,e),maxValue(value,s+1,e-1))
                ,value[e]+
                        Math.min(maxValue(value,s,e-2),maxValue(value,s+1,e-1))
               );
    }

    static int maxValue2(int []value,int s,int e,int sum){
        if(s+1==e) return Math.max(value[s],value[e]);

        return Math.max(sum-maxValue2(value,s+1,e,sum-value[s])
                        ,sum-maxValue2(value,s,e-1,sum-value[e]) );
    }


    //Dp(Tabulation).........................................
    static int maxValue_Tab(int[] value){
        int n=value.length;
        int [][]dp=new int[n][n];

        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;i<n&&j<n;i++,j++){
                if(gap==0) {
                    dp[i][j]=value[i];  //filling base case..
                }else if(gap==1){
                    dp[i][j]=Math.max(value[j],value[j-1]); //filling base case..
                }else {
                    dp[i][j]=Math.max( value[i]+Math.min(dp[i+2][j],dp[i+1][j-1])
                               ,value[j]+Math.min(dp[i][j-2],dp[i+1][j-1])
                              );
                }
            }
        }
        return dp[0][n-1];
    }

}
