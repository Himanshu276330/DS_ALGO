package DATA_STRUCTURE.Arrays;

public class ADV_L_13_Largest_sum_Contiguous_SubArray {
    public static void main(String[] args) {

        //Also know "Kaiden Algorithm".
//        int []a={-5,4,6,-3,4,-1};
        int []a={-5,-4,-6,-3,-4};

        System.out.println(LargestSumContiguousSubArray(a,a.length));
        System.out.println(LargestSumContiguousSubArray2(a,a.length));


    }

    //Method 001
    static int LargestSumContiguousSubArray(int []a,int n){
        int ansSum=-1;
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum+=a[j];
                if (sum>ansSum){
                    ansSum=sum;
                }
            }
        }
        return ansSum;
    }


    //Also know "Kaiden Algorithm".
    static int LargestSumContiguousSubArray2(int []a,int n){
        int maxSum=-Integer.MAX_VALUE;
        int currentSum=0;
        for (int i=0;i<n;i++){
            currentSum+=a[i];
            if (currentSum>maxSum) {
                maxSum = currentSum;
            }
            if (currentSum<0) currentSum=0;
        }
        return maxSum;
    }

}
