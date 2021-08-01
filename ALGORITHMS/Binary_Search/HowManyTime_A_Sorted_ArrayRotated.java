package ALGORITHMS.Binary_Search;

public class HowManyTime_A_Sorted_ArrayRotated {
    public static void main(String[] args) {

        int[] arr={11,12,15,18,2,5,6,8};
        int[] arr2={8,11,12,15,18,2,5,6};
        int[] arr3={6,8,11,12,15,18,2,5};
        int[] arr4={5,6,8,11,12,15,18,2};
        int[] arr5={2,5,6,8,11,12,15,18};
        int[] arr6={2,5};
        int[] arr7={2};
        int[] arr8={5,2};//***
        int[] arr9={5,2,3};//***   //4 3 2 1 0 0 0 1 2

        System.out.print(timeCount(arr,0, arr.length-1));
        System.out.print(timeCount(arr2,0, arr2.length-1));
        System.out.print(timeCount(arr3,0, arr3.length-1));
        System.out.print(timeCount(arr4,0, arr4.length-1));
        System.out.print(timeCount(arr5,0, arr5.length-1));
        System.out.print(timeCount(arr6,0, arr6.length-1));
        System.out.print(timeCount(arr7,0, arr7.length-1));
        System.out.print(timeCount(arr8,0, arr8.length-1));
        System.out.print(timeCount(arr9,0, arr9.length-1));
        System.out.println();

        System.out.print(timeCountIterative(arr));
        System.out.print(timeCountIterative(arr2));
        System.out.print(timeCountIterative(arr3));
        System.out.print(timeCountIterative(arr4));
        System.out.print(timeCountIterative(arr5));
        System.out.print(timeCountIterative(arr6));
        System.out.print(timeCountIterative(arr7));
        System.out.print(timeCountIterative(arr8));
        System.out.print(timeCountIterative(arr9));
        System.out.println();

        //Iterative..................................................



    }//Main Ends..................................................................

    //Nice and simple function...............
    static int timeCountIterative(int[] arr){
        int n=arr.length;
        int low=0,high=n-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int pre=(n+mid-1)%n;
            int next=(mid+1)%n;
            //System.out.println(mid+" "+pre+" "+next);
            if(arr[mid]<arr[pre] && arr[mid]<arr[next]){
                return (n-mid)%n;
            }else if(arr[mid]<=arr[high]){
                high=mid-1;
            }else if(arr[mid]>=arr[low]){
                low=mid+1;
            }
        }
        return 0;
    }

    static int timeCount(int[] arr,int low,int high){
        if(low>high) return -1; //***
        int mid=low+(high-low)/2;
        int prev=(mid-1+ arr.length)%arr.length;
        int next=(mid+1)%arr.length;

        if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
            return (arr.length-mid)%arr.length;
        }else if(arr[mid]<=arr[high]){
            return timeCount(arr,low,mid-1);
        }else if(arr[mid]>=arr[low]){
            return timeCount(arr,mid+1,high);
        }
        return 0;
    }

}
