package Segment_Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SegmentTree_Method {
    public static void main(String[] args) {

        int []arr={10,20,30,40};
        //int []arr={10,20,30,40,50};
        tree=new int[2*arr.length-1];
        preProcess(arr,0,arr.length-1,0);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

//All getSum() ==> log(n) and updateKey() ==> log(n) .........................................
        //System.out.println(getSum(0,3,0, arr.length-1,0));
        //System.out.println(getSum(1,3,0, arr.length-1,0));
        //System.out.println(getSum(2,3,0, arr.length-1,0));
        //System.out.println(getSum(3,3,0, arr.length-1,0));
        //System.out.println(getSum(4,3,0, arr.length-1,0)); //return 0;
        //System.out.println(getSum(2,3,0, arr.length-1,0));
        //System.out.println(getSum(1,2,0, arr.length-1,0));
        //System.out.println(getSum(1,3,0, arr.length-1,0));

        System.out.println(getSum(1,2,0, arr.length-1,0));
        System.out.println(getSum(0,0,0, arr.length-1,0));
        System.out.println(getSum(0,3,0, arr.length-1,0));
        updateKey(1,60,arr);
        System.out.println(getSum(1,2,0, arr.length-1,0));
        System.out.println(getSum(0,0,0, arr.length-1,0));
        System.out.println(getSum(0,3,0, arr.length-1,0));


    }//Main Ends.........................................

    static void updateKey(int index,int val,int []arr){
        update(0,arr.length-1,index,0,val-arr[index]);
    }
    private static void update(int ss,int se,int alterIndex,int i,int diff){
        if(alterIndex<ss || alterIndex>se) return;
        tree[i]+=diff;
        if(ss<se) {
            int mid=(ss+se)/2;
            update(ss,mid,alterIndex,2*i+1,diff);
            update(mid+1,se,alterIndex,2*i+2,diff);
        }
    }

    static int getSum(int userQueryS,int userQueryE,int searchS,int searchE,int i){
        if(searchS>userQueryE || searchE<userQueryS) return 0;
        if(userQueryS<=searchS&& userQueryE>=searchE) return tree[i];

        if(searchS<searchE){
            int mid=(searchS+searchE)/2;
            return getSum(userQueryS,userQueryE,searchS,mid,2*i+1)
                      + getSum(userQueryS,userQueryE,mid+1,searchE,2*i+2);
        }
        return 0;
    }

    //Making Segment Tree array for fast output..
    static int [] tree;
    static int preProcess(int [] arr,int sRange,int eRange,int indexOfTree){
        if(sRange==eRange){
            return tree[indexOfTree]=arr[sRange];
        }
        // left child = 2*indexOfTree+1 ; right child = 2*indexOfTree+2 ..
        int mid=(sRange+eRange)/2;
        return tree[indexOfTree]=preProcess(arr,sRange,mid,2*indexOfTree+1)
                            +preProcess(arr,mid+1,eRange,2*indexOfTree+2);
    }
}
