package ALGORITHMS.Binary_Search;

public class IndexOfFirst_1_InA_BinarySortedInfiniteArray {
    public static void main(String[] args) {

        int[] arr={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println(position(arr));

    }//Main Ends...................................................................................

    static int position(int[] arr){
        int low=0,high=1;
        int mid;
        int ans=-1;

        while (arr[high]==0){
            low=high;
            high=high*2;
        }

        //Then simply code for first occurrence of 1 in this arr..(low,high)
        while (low<=high){
            mid=low+(high-low)/2;
            if (arr[mid]==1){
                high=mid-1;
                ans=mid;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }

}
