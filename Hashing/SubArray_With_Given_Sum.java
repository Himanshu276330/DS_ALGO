package Hashing;

import java.util.*;

public class SubArray_With_Given_Sum {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);arr.add(3);arr.add(2);
        arr.add(-5);arr.add(4);arr.add(1);arr.add(9);

        //We take sum be any thing 0 , 5, 22, 89, ....etc
        ArrayList<ArrayList<Integer>> demo=subArray(arr,5);
        for (ArrayList<Integer> integers : demo) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }//MAin Ends......................................

    static ArrayList<ArrayList<Integer>> subArray(ArrayList<Integer> arr,int sum){
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int cur=0;
        for(int i=0;i<arr.size();i++){
            cur+=arr.get(i);
            if(cur==sum){
                ArrayList<Integer> temp=new ArrayList<>(arr.subList(0,i+1));  // [ 0, i]
                ans.add(temp);
            }
            if(map.containsKey(cur-sum)){
                int j=map.get(cur-sum);
                ArrayList<Integer> temp=new ArrayList<>(arr.subList(++j,i+1));
                ans.add(temp);
            }
            map.put(cur,i);
        }
        return ans;
    }
}
