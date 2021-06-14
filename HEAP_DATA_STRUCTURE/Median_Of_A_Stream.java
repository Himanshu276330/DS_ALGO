package HEAP_DATA_STRUCTURE;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Median_Of_A_Stream {
    public static void main(String[] args) {

        //Find Median of stream.........
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(7);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        median_of_Stream(arr);
        for(double e:ans) System.out.print(e+" ");

    }//MAIN ENDS..............................................................................
    static ArrayList<Double> ans;

    //median_of_Stream function.......
    static void median_of_Stream(ArrayList<Integer> arr){
        ans=new ArrayList<>();
        PriorityQueue<Integer> left=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> right=new PriorityQueue<>();

        for(int i=0;i<arr.size();i++){
            if(i%2 == 0){
                if(!right.isEmpty() && right.peek()>=arr.get(i)){
                    left.add(arr.get(i));
                }else if(!right.isEmpty() && right.peek()<arr.get(i)){
                    left.add(right.remove());
                    right.add(arr.get(i));
                }else {
                    left.add(arr.get(i));
                }
                //Adding median...
                ans.add( (double)(left.element()) );
            }
            else {
                if(left.element()<=arr.get(i)) {
                    right.add(arr.get(i));
                }else {
                    right.add(left.remove());
                    left.add(arr.get(i));
                }
                //Adding median...
                ans.add((left.element()+right.element())/2d);
            }
        }
    }
}
