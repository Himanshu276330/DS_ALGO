package Binary_Search;

public class FirstAndLastOccurrencesOfElement {
    public static void main(String[] args) {

        int[] arr1={2,4,10,10,10,18,20}; int a1=10;
        int[] arr2={1,3,3,3,3,3,3,3,3,3,3,3,5,7}; int a2=3;
        int[] arr3={5};

        System.out.println(indexFirstBS(arr1,0,arr1.length-1,10));
        System.out.println(indexFirstBS(arr2,0,arr2.length-1,3));
        System.out.println(indexFirstBS(arr2,0,arr2.length-1,6));
        System.out.println(indexFirstBS(arr3,0,arr3.length-1,5));
        System.out.println(indexFirstBS(arr3,0,arr3.length-1,3));
        System.out.println(indexFirstBS(arr3,0,arr3.length-1,10));


        System.out.println(indexLastBS(arr1,0,arr1.length-1,10));
        System.out.println(indexLastBS(arr2,0,arr2.length-1,3));
        System.out.println(indexLastBS(arr2,0,arr2.length-1,6));
        System.out.println(indexLastBS(arr3,0,arr3.length-1,5));
        System.out.println(indexLastBS(arr3,0,arr3.length-1,3));
        System.out.println(indexLastBS(arr3,0,arr3.length-1,10));

    }//Main Ends...................................................

    static int indexFirstBS(int[] arr,int low,int high,int a){
        if(low>high) return Integer.MAX_VALUE;
        int mid=low+(high-low)/2;
        int res;
        if(arr[mid]>a)
            res=indexFirstBS(arr,low,mid-1,a);
        else if(arr[mid]<a)
            res=indexFirstBS(arr,mid+1,high,a);
        else{
            res=mid;
            res=Math.min(res,indexFirstBS(arr,low,mid-1,a));
        }
        return res;
    }

    static int indexLastBS(int[] arr,int low,int high,int a){
        if(low>high) return Integer.MIN_VALUE;
        int mid=low+(high-low)/2;
        int res;
        if(arr[mid]>a)
            res=indexLastBS(arr,low,mid-1,a);
        else if(arr[mid]<a)
            res=indexLastBS(arr,mid+1,high,a);
        else{
            res=mid;
            res=Math.max(res,indexLastBS(arr,mid+1,high,a));
        }
        return res;
    }

}
