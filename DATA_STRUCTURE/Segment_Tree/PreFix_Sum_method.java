package DATA_STRUCTURE.Segment_Tree;

import java.util.ArrayList;

public class PreFix_Sum_method {
    public static void main(String[] args) {

        arr= new int[]{10, 20, 30,40,50,60,70,80};
        pre=new ArrayList<>();
        preProcess();
        System.out.println(getSum(0,2));
        System.out.println(getSum(0,3));
        System.out.println(getSum(1,2));

        update(1,60);

        System.out.println(getSum(0,3));
        System.out.println(getSum(1,2));

    }//Main End.................................................................

    static ArrayList<Integer> pre;
    static int []arr;

    static void preProcess(){
        int sum=0;
        for (int j : arr) {
            sum += j;
            pre.add(sum);
        }
    }

    static int getSum(int s,int e){
        return (pre.get(e)- pre.get(s)+arr[s]);
    }

    static void update(int i,int val){
        int diff=val-arr[i];
        arr[i]=val;
        for(int j=i;j< pre.size();j++){
            System.out.println(j);
            pre.set(j,pre.get(j)+diff);
        }
    }
}
