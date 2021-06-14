package Hashing;

import java.util.*;

public class Pair_With_Given_Sum {
    public static void main(String[] args) {

        int []a={3,2,8,15,-8};
        System.out.println(isPair(a,17));
        System.out.println(isPair(a,11));
        System.out.println(isPair(a,6));

    }

    static boolean isPair(int []a,int sum){
        Set<Integer> set=new HashSet<>(a.length);
        for (int j : a) {
            if (set.contains(sum - j)) return true;
            else set.add(j);
        }
        return false;
    }
}
