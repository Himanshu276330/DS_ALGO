package ALGORITHMS.Hashing;

import java.util.*;

public class Intersection_of_Two_array {
    public static void main(String[] args) {

        int []a={10,15,20,15,30,30,5};
        int []b={30,5,30,80};
        int []ans=Intersection(a,b);
        for(int e:ans){
            if(e!=0)
                System.out.print(e+" ");
        }

    }
    static int[] Intersection(int []a,int []b){
        Set<Integer> set=new HashSet<>();
        int []ans=new int[a.length];
        for(int e:a) set.add(e);
        int i=0;
        for(int e:b){
            if(set.contains(e)){
                ans[i++]=e;
                set.remove(e);
            }
        }
        return ans;
    }
}
