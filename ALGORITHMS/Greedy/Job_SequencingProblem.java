package ALGORITHMS.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Job_SequencingProblem {
    public static void main(String[] args) {

        ArrayList<Pair> arr=new ArrayList<>();
        arr.add(new Pair(4,70));
        arr.add(new Pair(1,80));
        arr.add(new Pair(1,30));
        arr.add(new Pair(1,100));
        System.out.println(maxProfit(arr));

        ArrayList<Pair> arr2=new ArrayList<>();
        arr2.add(new Pair(2,50));
        arr2.add(new Pair(2,60));
        arr2.add(new Pair(3,20));
        arr2.add(new Pair(3,30));
        System.out.println(maxProfit(arr2));

    }//Main Ends...................................................

    private static int maxProfit(ArrayList<Pair> arr){
        arr.sort(Comparator.comparing(Pair::getProfit).reversed());

        int maxDedLine=-1;
        for(Pair p:arr)
            maxDedLine=Math.max(maxDedLine,p.dedLine);

        int[] temp=new int[maxDedLine+1];
        for(Pair p:arr){
            for(int i=p.dedLine;i>=1;i--) {
                if (temp[i] == 0) {
                    temp[i]=p.profit;
                    break;
                }
            }
        }
        int total=0;
        for(int e:temp)
            total+=e;
        return total;
    }

    private static class Pair{
        int dedLine,profit;
        private Pair(int dedLine, int profit) {
            this.dedLine = dedLine;
            this.profit = profit;
        }
        private int getProfit() {
            return profit;
        }
    }

}
