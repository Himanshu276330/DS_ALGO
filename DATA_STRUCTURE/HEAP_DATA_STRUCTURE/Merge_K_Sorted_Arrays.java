package DATA_STRUCTURE.HEAP_DATA_STRUCTURE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_Sorted_Arrays {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<3;i++){
            arr.add(i,new ArrayList<>());
        }
        arr.get(0).add(10);arr.get(0).add(20);arr.get(0).add(30);
        arr.get(1).add(5);arr.get(1).add(15);
        arr.get(2).add(1);arr.get(2).add(9);arr.get(2).add(11);arr.get(2).add(18);

        //Calling function.
        //merge_k_sorted_array1(arr);
        merge_k_sorted_array2(arr);


        //Printing  result....
        for(int e:ans) System.out.print(e+" ");

    }//MAIN ENDS.........................................................................................
    static ArrayList<Integer> ans;

    //Method 02.. More efficient than 01
    static void merge_k_sorted_array2(ArrayList<ArrayList<Integer>> arr){
        PriorityQueue<Triplet> pq=new PriorityQueue<>(Comparator.comparing(Triplet -> Triplet.val));
        ans=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            pq.add(new Triplet(arr.get(i).get(0),i,0));
        }
        Triplet temp;
        int indexOfArray,indexOfVal,val;
        while (!pq.isEmpty()){
            temp=pq.remove();
            indexOfArray=temp.indexOfArray;
            indexOfVal=temp.indexOfVal;
            val= temp.val;
            if(indexOfVal+1<arr.get(indexOfArray).size()){
                pq.add(new Triplet(arr.get(indexOfArray).get(indexOfVal+1),indexOfArray,indexOfVal+1));
            }
            ans.add(val);
        }
    }
    static class Triplet {
        int val;
        int indexOfArray;
        int indexOfVal;
        Triplet(int val, int indexOfArray,int indexOfVal){
            this.val=val;
            this.indexOfArray=indexOfArray;
            this.indexOfVal=indexOfVal;
        }
    }



    //Method 01...
    static void merge_k_sorted_array1(ArrayList<ArrayList<Integer>> arr){
        ans = new ArrayList<>(arr.get(0));
        for(int i=1;i<arr.size();i++){
            merge(arr.get(i),ans);
        }
    }
    static void merge(ArrayList<Integer> arr,ArrayList<Integer> ans){
        int arrL=arr.size(),ansL=ans.size();
        int i=ansL-1;
        int j=arrL-1;
        while (i>=0 && j>=0){
            if(ans.get(i)>arr.get(j)){
                i--;
            }else{
                ans.add(i+1,arr.get(j--));
            }
        }
        while (j>=0){
            ans.add(0,arr.get(j--));
        }
    }
}
