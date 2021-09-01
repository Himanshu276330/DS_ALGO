package ALGORITHMS.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelectionProblem {
    public static void main(String[] args) {

        ArrayList<Pair> arr=new ArrayList<>();
        arr.add(new Pair(1,3));
        arr.add(new Pair(2,4));
        arr.add(new Pair(3,8));
        arr.add(new Pair(10,11));
        System.out.println("By Recursive: "+maxActivitySelection(arr,0,0,0));
        System.out.println("By Iterative: "+maxActivitySelection2(arr));

        ArrayList<Pair> arr2=new ArrayList<>();
        arr2.add(new Pair(2,3));
        arr2.add(new Pair(1,4));
        arr2.add(new Pair(5,8));
        arr2.add(new Pair(6,11));
        arr2.sort(Comparator.comparing(Pair -> Pair.f));
        System.out.println("By Recursive: "+maxActivitySelection(arr2,0,0,0));
        System.out.println("By Iterative: "+maxActivitySelection2(arr2));

    }//Main Ends.........................................................................

    private static int maxActivitySelection2(ArrayList<Pair> arr){
        arr.sort(Comparator.comparing(Pair->Pair.s));
        Pair prev=arr.get(0);
        int ans=1;
        for(Pair p:arr){
            if(prev.s<=p.f){
                ans++;
                prev=p;
            }
        }
        return ans;
    }

    private static int maxActivitySelection(ArrayList<Pair> arr,int i,int s,int ans){
        if(i==arr.size()) return ans;
        Pair p=arr.get(i);
        if(s<=p.f){
            return Math.max(maxActivitySelection(arr,i+1,p.s,ans+1)
                    ,maxActivitySelection(arr,i+1,s,ans));
        }else
            return maxActivitySelection(arr,i+1,s,ans);
    }

    private static class Pair{
        int f,s;
        private Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }
}
