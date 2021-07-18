package Binary_Search;

public class Search_element_inA_SortedRotatedArray {
    public static void main(String[] args) {

        int[] arr={11,12,15,18,2,5,6,8};
        int[] arr2={8,11,12,15,18,2,5,6};
        //   0 1 2  3  4  5  6 7
        int[] arr3={6,8,11,12,15,18,2,5};
        int[] arr4={5,6,8,11,12,15,18,2};
        int[] arr5={2,5,6,8,11,12,15,18};
        int[] arr6={2,5};
        int[] arr7={2};
        int[] arr8={5,2};//***
        int[] arr9={5,2,3};//***
        System.out.println(search(arr,0,arr.length-1,12));
        System.out.println(search(arr,0,arr.length-1,2));
        System.out.println(search(arr7,0,arr7.length-1,2));


    }//Main Ends...............................................................

    static int search(int[] arr,int low,int high,int a){
        if(low>high) return -1;
        int mid=low+(high-low)/2;

        if(arr[mid]==a) return mid;
        else if(arr[mid]>=arr[low] && arr[mid]<=arr[high]){
            return binarySearch(arr,low,high,a);
        }else if(arr[mid]<=arr[high]){
            if(a>arr[mid] && a<=arr[high])
                return binarySearch(arr,mid+1,high,a);
            else
                return search(arr,low,mid-1,a);
        }else if(arr[mid]>=arr[low]){
            if(a>=arr[low] && a<arr[mid]) {
                return binarySearch(arr,low,mid-1,a);
            }else
                return search(arr,mid+1,high,a);
        }
        return -1;
    }

    static int binarySearch(int[] arr,int low,int high,int a){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==a){
            return mid;
        }else if(arr[mid]>a){
            return binarySearch(arr,low,mid-1,a);
        }else
            return binarySearch(arr,mid+1,high,a);
    }

}
