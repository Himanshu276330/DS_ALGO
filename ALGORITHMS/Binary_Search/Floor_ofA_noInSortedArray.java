package ALGORITHMS.Binary_Search;

public class Floor_ofA_noInSortedArray {
    public static void main(String[] args) {

        int[] arr={2,3,4,8,10,10,12,19};

        System.out.println(floorInd(arr,5));
        System.out.println(floorInd(arr,1));
        System.out.println(floorInd(arr,10));

    }//Main ENDS...................................................

    static int floorInd(int[]arr,int a){
        int low=0,high=arr.length-1;
        int mid=0;
        int floorIndex=-1;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==a) return mid;
            else if(arr[mid]<a){
                floorIndex=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return floorIndex;
    }

}
