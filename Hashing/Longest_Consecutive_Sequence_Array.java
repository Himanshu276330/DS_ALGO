package Hashing;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_Consecutive_Sequence_Array {
    public static void main(String[] args) {

        int[] arr1={1,9,3,4,2,20};
        int[] arr2={8,20,7,30};
        int [] arr3={20,30,40};

        System.out.println(LarConsecutiveSeq(arr1));
        System.out.println(LarConsecutiveSeq(arr2));
        System.out.println(LarConsecutiveSeq(arr3));

    }

    static int LarConsecutiveSeq(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int e:arr) set.add(e);

        int ans=0,cur;
        for (int j : arr) {
            if (!set.contains(j - 1)) {
                cur = 0;
                while (set.contains(j)) {
                    cur++;
                    j++;
                }
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }
}
