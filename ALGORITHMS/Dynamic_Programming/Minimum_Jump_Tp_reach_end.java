package ALGORITHMS.Dynamic_Programming;

public class Minimum_Jump_Tp_reach_end {
    public static void main(String[] args) {

        int []arr={3,4,2,1,2,1};  //min== 3 -> 4 -> 1(end) == 2 jump.
//        System.out.println(minJump(arr,0));
//        System.out.println(minJump2(arr,arr.length-1));
          //arr[0] =3 means hum AtMost 3 index aage ga sakte h

        int []arr2={4,1,5,3,1,3,2,1,8};
//        System.out.println(minJump(arr2,0));
//        System.out.println(minJump2(arr2, arr2.length)-1);

//        int []arr3={4,0,3,0,0,3,2,1,8};
//        count=0;
//        System.out.println(minJump(arr3,0)+" count-> "+count);

//        memo=new int[arr2.length+1];
//        memo2=new int[arr2.length+1];
//        DATA_STRUCTURE.Arrays.fill(memo,-1);
//        DATA_STRUCTURE.Arrays.fill(memo2,-1);
//        count=0;
//        System.out.println(minJump(arr2,0)+" count of plain recursion-> "+count);
//        count=0;
//        System.out.println(minJump_memo(arr2,0)+" count of dp solution-> "+count);
//        count=0;
//        System.out.println(minJump_memo2(arr2,arr2.length-1)+" "+count);

        System.out.println(minJump_Tab(arr));
        System.out.println(minJump_Tab(arr2));


    }//Main Ends................................................

    //Plain Recursion...........................................
    static int minJump(int[] arr,int i){
        if(i>=arr.length-1) return 0;

        count++;
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=arr[i];j++)
            min=Math.min(minJump(arr,i+j),min);

        if(min==Integer.MAX_VALUE) return min;
        return min+1;
    }
    static int minJump2(int[] arr,int n){
        if(n==0) return 0;

        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
            if(arr[j]+j>=n){
                min=Math.min(minJump2(arr,j),min);
            }
        if(min==Integer.MAX_VALUE) return min;
        return min+1;
    }

    //Dp(Memoization).............................................
    static int []memo;
    static int count;
    static int minJump_memo(int[] arr,int i){
        if(i>=arr.length-1) return 0;

        if(memo[i]!=-1) return memo[i];
        count++;
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=arr[i];j++)
            min=Math.min(minJump_memo(arr,i+j),min);

        if(min==Integer.MAX_VALUE) return memo[i]=min;
        return memo[i]=min+1;
    }
    //memoization 1 fast h 2 se..................................
    static int []memo2;
    static int minJump_memo2(int[] arr,int n){
        if(n==0) return 0;
        count++;
        if(memo2[n]!=-1) return memo2[n];
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
            if(arr[j]+j>=n){
                min=Math.min(minJump_memo2(arr,j),min);
            }
        if(min==Integer.MAX_VALUE) return memo2[n]=min;
        return memo2[n]=min+1;
    }

    //Dp(Tabulation).............................................
    static int minJump_Tab(int []arr){
        int n=arr.length;
        int []dp=new int[n];
        dp[0]=0;

        for(int i=1;i<n;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(arr[j]+j>=i && dp[j]!=Integer.MAX_VALUE)
                    dp[i]= Math.min(dp[i],dp[j]);
            }
            dp[i]++;
        }
        return dp[n-1];
    }
}
