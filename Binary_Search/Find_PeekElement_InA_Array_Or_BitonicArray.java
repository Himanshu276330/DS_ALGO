package Binary_Search;

public class Find_PeekElement_InA_Array_Or_BitonicArray{
    public static void main(String[] args) {

        int[] arr={5,10,20,15,11};
        int[] arr2={5,10,20,30,18,16};
        int[] arr3={40,30,20};
        int[] arr4={40,50,20};
        System.out.println(peekElementInd(arr));
        System.out.println(peekElementInd(arr2));
        System.out.println(peekElementInd(arr3));
        System.out.println(peekElementInd(arr4));

    }//Mains Ends.......................................................................................................

    static int peekElementInd(int[] arr){
        int low=0,high=arr.length-1;
        int mid;

        if(high==0) return 0; //if arr have only single element..

        while (low<=high){
            mid=low+(high-low)/2;

            if(mid==0 && arr[mid]>arr[1]) return mid;
            else if(mid==arr.length-1 && arr[mid]>arr[mid-1]) return arr.length-1;
            else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]>arr[mid-1])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

}
