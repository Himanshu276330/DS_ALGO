package DATA_STRUCTURE.Arrays;

public class ADV_L_15_many_Stock_Buy_sellToMaxProfit {
    public static void main(String[] args) {

        int []a={5,2,6,1,4,7,3,6};
        System.out.println(maxProfit(a,a.length));

    }

    static int maxProfit(int []a,int n){
        int maxProfit=0;
        for (int i=1;i<n;i++){
            if (a[i-1]<a[i]){
                maxProfit+=a[i]-a[i-1];
            }
        }
        return maxProfit;
    }

}
