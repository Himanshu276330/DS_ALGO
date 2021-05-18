package Practice_SET.RANDOM;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5, 8, 9, 3, 1, 2};
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
//        Merge_Sort s=new Merge_Sort();
        Merge_sort.Merge_Sort_algo(arr, 0, arr.length - 1);
        for (int e : arr) {
            System.out.print(e + " ");
        }

    }

}
class Merge_sort{

    static void Merge_Sort_algo(int []arr,int low,int high){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            Merge_Sort_algo(arr,low,mid);
            Merge_Sort_algo(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    private static void merge(int [] arr,int low,int mid,int high){
        int i, j;
        ArrayList<Integer> temp=new ArrayList<>();

        i = low;
        j = mid + 1;
        while(i<=mid && j<=high) {
            if (arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while (j<=high){
            temp.add(arr[j]);
            j++;
        }
        int y=low;
        for(Integer e:temp){
            arr[y]=e;
            y++;
        }
    }

}



