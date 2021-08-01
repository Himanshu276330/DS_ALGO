package ALGORITHMS.Binary_Search;

public class SearchingIn_Bitonic_Array {
    public static void main(String[] args) {

        int[] arr2={5,10,20,30,18,16,14,12,9,6,4};

        System.out.println(searchInd(arr2,18));
        System.out.println(searchInd(arr2,4));
        System.out.println(searchInd(arr2,5));
        System.out.println(searchInd(arr2,10));
        System.out.println(searchInd(arr2,9));

    }//Main Ends........................................................................................................

    static int searchInd(int[] arr,int key){
        int n=arr.length;
        if(n==0) return -1;
        if(n==1 && arr[0]==key) return 0;
        if(n==1) return -1;

        int peek=peekElementInd(arr);
        //System.out.println(peek+" ==peek");
        return Math.max(binarySearchINCREASE(arr,0,peek-1,key)
                    ,binarySearchDECREASE(arr,peek,n-1,key)  );
    }

    static int peekElementInd(int[] arr) {
        int low = 0, high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid == 0 && arr[mid] > arr[1]) return mid;
            else if (mid == arr.length - 1 && arr[mid] > arr[mid - 1]) return arr.length - 1;
            else if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;
            else if (arr[mid] > arr[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int binarySearchINCREASE(int[] arr,int low,int high,int key){
        int mid;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    static int binarySearchDECREASE(int[] arr,int low,int high,int key){
        int mid;
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}
