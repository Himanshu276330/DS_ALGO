package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Longest_Sum_With_Equal_no_of_Zero_and_One {
    public static void main(String[] args) {

        int[] arr={1,0,1,1,1,0,0};
        //int[] arr={0,1,1,1,0,0};
        System.out.println(longestSubArray(arr));

    }//Main Ends.......................................................
    static int longestSubArray(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int maxLength=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) sum--;   //we assume 0 as -1..
            else sum++;
            if(sum==0) {
                maxLength = Math.max(maxLength, i + 1);
            }
            if(map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            }
            map.put(sum,map.getOrDefault(sum,i));
        }
        return maxLength;
    }
}
