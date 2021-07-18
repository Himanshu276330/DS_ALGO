package Binary_Search;

public class FindPositionOfAnArrayInInfiniteSortedArray {
    public static void main(String[] args) {

        int[] arr=new int[5000];
        for(int i=0;i<5000;i++) arr[i]=i+1;
        int key=7;
        //Infinite array mean hum high ko (size-1) nahi le sakte......
        System.out.println(positionInd(arr,key));

    }//Main Ends......................................................

    static int positionInd(int[] arr,int key){
        int low=0,high=1;
        int mid;

        while (arr[high]<key){
            low=high;
            high=high*2; //For TimeComplexity== log(n)..
        }

        //And then apply simply binarySearch..
        while (low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if (arr[mid]>key) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
