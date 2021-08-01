package ALGORITHMS.Binary_Search;

public class MinimumDiff_Element_InA_sorted_Array {
    public static void main(String[] args) {

        int[] arr={4,6,9,10,15,16};
        int key=12;

        System.out.println(minDiffElement(arr,key));
        System.out.println(minDiffElement(arr,17));

    }//Main Ends.................................................................

    //If element not present in arr then after binary search end low is at ceil value
    // and high is at floor value of key......
    //but --> if low is greater than size-1 then ceil not exit.
    // if high is less than 0 then floor not exit.
    static int minDiffElement(int[] arr,int key){
        int low=0,high=arr.length-1;
        int mid;

        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==key){
                low=high=mid;
                break;
            }else if(arr[mid]<key){
                low=mid+1;
            }else
                high=mid-1;
        }
        //System.out.println(low+" "+high);
        if(low==arr.length) return arr[arr.length-1];
        if(high<0) return arr[0];

        if(low==high) return arr[low];
        else {
            if(Math.abs(arr[low]-key)<= Math.abs(arr[high]-key)) return arr[low];
            else return arr[high];
        }
    }
}
