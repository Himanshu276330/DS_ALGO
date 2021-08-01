package ALGORITHMS.Dynamic_Programming;

import java.util.Arrays;

public class Longest_Increasing_SubSequence {
    public static void main(String[] args) {

        int []arr={10,5,18,7,2,9};
        int []arr2={3,10,20,4,6,7};
        int []arr3={8,100,150,10,12,14,110};
        System.out.println(lis(arr));

        System.out.println(Arrays.toString(arr));
        System.out.println(lis2(arr));

        System.out.println(Arrays.toString(arr2));
        System.out.println(lis2(arr2));

        System.out.println(Arrays.toString(arr3));
        System.out.println(lis2(arr3));

    }//Main Ends....................................................

    // Time complexity --> O(n2)....................................
    static int lis(int[] arr){
        int[] lis_arr=new int[arr.length];
        int max;
        for(int i=0;i<arr.length;i++){
            lis_arr[i]=1;
            max=0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j])
                    max=Math.max(max,lis_arr[j]);
            }
            lis_arr[i]+=max;
        }
        int ans=0;
        for(int e:lis_arr) ans=Math.max(e,ans);
        return ans;
    }

    // Time complexity --> O(nlog(n))..................................
    static int lis2(int[] arr){
        int[] tail=new int[arr.length];
        tail[0]=arr[0]; int len=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>tail[len-1])
                tail[len++]=arr[i];
            else {
                int c=ceilInd(tail,len,arr[i]);
                tail[c]=arr[i];
            }
            System.out.println(Arrays.toString(tail));
        }
        return len;
    }
    static int ceilInd(int[] tail,int len,int x){
        int i=0,y=0;
        len--;
        while(i<=len){
            int mid=(i+len)/2;
            if(tail[mid]<x) {
                y=mid+1;
                i = mid + 1;
            }
            else {
                len = mid - 1;
                y = mid;
            }
        }
        return y;
    }

}
