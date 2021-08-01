package ALGORITHMS.Binary_Search;

public class SearchingInA_NearlySortedArray {
    public static void main(String[] args) {

        int[] arr={5,10,30,20,40};

        System.out.println(search(arr,0,arr.length-1,20));
        System.out.println(search(arr,0,arr.length-1,5));

    }//MAin Ends.................................................

    static int search(int[] arr,int low,int high,int a){
        if(low>high) return -1;
        int mid=low+(high-low)/2;

        if(arr[mid]==a) return mid;
        else if(mid-1>=low && arr[mid-1]==a) return mid-1;
        else if(mid+1<=high && arr[mid+1]==a) return mid+1;

        if(arr[mid]>a) return search(arr,low,mid-2,a);
        else return search(arr,mid+2,high,a);
    }
}
