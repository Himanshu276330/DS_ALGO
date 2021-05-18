package Arrays;

import java.util.ArrayDeque;

public class ADV_L_14_one_Stock_Buy_sellToMaxProfit {
    public static void main(String[] args) {

        //Price of stock at diff day in array
        //We find max profit from it.
        int []a={};
        System.out.println(maxProfit(a,a.length));
        System.out.println(maxProfit2(a,a.length));
        System.out.println(maxProfit3(a,a.length));

    }

    //Method 001
    static int maxProfit(int []a,int n){
        int maxProfit=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int currentProfit=a[j]-a[i];
                maxProfit=Math.max(currentProfit,maxProfit);
            }
        }
        return maxProfit;
    }


    //Method 002
    static int maxProfit2(int []a,int n){
        ArrayDeque<Integer> A=new ArrayDeque<>();
          //If array is empty
        if (n==0) return 0;
        A.offerFirst(a[n-1]);
        for (int i=n-2;i>=0;i--){
            A.offerFirst(Math.max(a[i],A.getFirst()));
        }
        int maxProfit=0;
        for (int i=0;i<n;i++){
            int currentProfit=(A.removeFirst()-a[i]);
           maxProfit=Math.max(maxProfit,currentProfit);
        }
        return maxProfit;
    }


    //Method 003.
    static int maxProfit3(int []a,int n) {
        int minAmount = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            minAmount=Math.min(a[i],minAmount);
            maxProfit=Math.max((a[i]-minAmount),maxProfit);
        }
        return maxProfit;
    }
}
