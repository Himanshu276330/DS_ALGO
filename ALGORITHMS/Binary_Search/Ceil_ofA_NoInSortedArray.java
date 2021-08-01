package ALGORITHMS.Binary_Search;

public class Ceil_ofA_NoInSortedArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,8,10,10,12,19};

        System.out.println(ceilInd(arr,5));
        System.out.println(ceilInd(arr,20));


    }//Main ENDS...............................................................

    static int ceilInd(int[] arr,int a){
        int low=0,high=arr.length-1;
        int mid=0;
        int ceilIndex=-1;

        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==a) return mid;
            else if(arr[mid]<a) low=mid+1;
            else {
                ceilIndex=mid;
                high=mid-1;
            }
        }
        return ceilIndex;
    }
}
