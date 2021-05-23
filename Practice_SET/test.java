package Practice_SET;

import java.util.*;

public class test {
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>();
        a.add(8);
        System.out.println(a.get(0).intValue());


    }
    public String solve(int A) {

        long ans=1;
        for(int i=100;i>=1;i--){
            ans*=i;
        }
        return String.valueOf(ans);
    }

}
