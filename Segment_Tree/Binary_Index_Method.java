package Segment_Tree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_Index_Method {
    public static void main(String[] args) {

        //Input array..
        int []array={10,20,30,40,50,60,70,80,90,100,110};
        n= array.length;
        arr=new int[n];bITree=new int[n+1];
        Arrays.fill(arr,0);
        Arrays.fill(bITree,0);

        for(int i=0;i<n;i++){
            update(i,array[i]);
        }

        System.out.println(getSum(3));
        System.out.println(getSum(5));
        System.out.println(getSum_range(1,3));



    }//MAIN ENDS...................
    static int n;
    static int []arr;
    static int []bITree;

    static void update(int i,int val){
        int diff=val-arr[i];
        arr[i]=val;
        i=i+1;
        while (i<=n){
            bITree[i]+=diff;
            i+=i&(-i);
        }
    }

    //Wrong function..???????? both function almost same h ,, Not no why,,,
    /* static void update_wrong(int i,int val){
        int diff=val-arr[i];
        arr[i]=val;
        i=i+1;
        while (i<=n){
            bITree[i]+=diff;
            i=i+i&(-i);
        }
    }*/

    static int getSum(int i){
        i++;
        int res=0;
        while (i>0){
            res+=bITree[i];
            i=i&(i-1);
        }
        return res;
    }
    static int getSum_range(int i,int j){
        int res=0;
        res+=arr[i];
        i++;j++;
        while (j>0){
            res+=bITree[j];
            j=j&(j-1);
        }
        while (i>0){
            res-=bITree[i];
            i=i&(i-1);
        }
        return res;
    }


}
