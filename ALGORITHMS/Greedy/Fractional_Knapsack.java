package ALGORITHMS.Greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {

        ArrayList<Pair> arr=new ArrayList<>();
        arr.add(new Pair(50,600));
        arr.add(new Pair(20,500));
        arr.add(new Pair(30,400));

        System.out.println(maxValue(arr,70));

    }//Main Ends.....................................................

    private static int maxValue(ArrayList<Pair> arr,int knapsack){
        arr.sort(Comparator.comparing(Pair -> (Pair.value/Pair.weight)));
        int val=0;

        for(int i=arr.size()-1;i>=0;i--){
            Pair p= arr.get(i);
            if(knapsack<=0) break;
            if(knapsack>=p.weight) {
                knapsack -= p.weight;
                val+=p.value;
            }else {
                val+=(knapsack*p.value)/p.weight;
                knapsack=0;
            }
        }
        return val;
    }

    private static class Pair{
        int weight,value;
        private Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

}
