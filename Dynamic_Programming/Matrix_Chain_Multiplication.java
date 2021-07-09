package Dynamic_Programming;

public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {

        int[] arr={2,1,3,4};
        int[] arr2={2,1,3};
        int[] arr3={20,10,30,40};
        System.out.println(minIntegerMultiplication(arr,0,3));
        System.out.println(minIntegerMultiplication(arr3,0,3));

    }//Main Ends.....................................................

    //Plain Recursion................................................
    static int minIntegerMultiplication(int[] arr,int i,int j){
        if(i==j) return 0;
        if(i+1==j) return 0;

        int res=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            res=Math.min(res , arr[i]*arr[k]*arr[j]+minIntegerMultiplication(arr,i,k)
                    +minIntegerMultiplication(arr,k,j));
        }
        return res;
    }

}
