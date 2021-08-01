package ALGORITHMS.Hashing;

import java.util.*;

public class Count_Distinct_Element_Every_Window {
    public static void main(String[] args) {

        int[] arr1={10,20,20,10,30,40,10};
        int[] arr2={10,20,30,40};
        int[] arr3={10,10,10,10,10};

        int[] ans=distinctCount(arr1,4);
        for(int e:ans) System.out.print(e+" ");
        System.out.println();

        int[] ans2=distinctCount(arr2,3);
        for(int e:ans2) System.out.print(e+" ");
        System.out.println();

        int[] ans3=distinctCount(arr3,3);
        for(int e:ans3) System.out.print(e+" ");

    }//MAin ends.........

    static int[] distinctCount(int[] arr,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int[]ans=new int[arr.length-k+1];
        int i=0;
        while (k<arr.length){
            ans[i]=map.size();
            if(map.get(arr[i])>1){
                map.put(arr[i],map.get(arr[i])-1);
            }else {
                map.remove(arr[i]);
            }
            map.put(arr[k],map.getOrDefault(arr[k],0)+1);
            k++;i++;
        }
        ans[i]=map.size();
        return ans;
    }
}
