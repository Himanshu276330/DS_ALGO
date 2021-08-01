package ALGORITHMS.Hashing;

import java.util.*;

public class Longest_common_span_with_same_sum_in_binary_array {
    public static void main(String[] args) {

//        int []a={0,1,0,0,0,0};
//        int []b={1,0,1,0,0,1};

        int []a={0,1,0,1,1,1,1};
        int []b={1,1,1,1,1,0,1};

//        int []a={0,0,0};
//        int []b={1,1,1};

//        int []a={0,0,1,0};
//        int []b={1,1,1,1};

        System.out.println(maxCommonSpan(a,b));
        System.out.println(maxCommonSpan2(a,b));

    }//Main Ends....................................................................................

    //Efficient solution.........
    static int maxCommonSpan2(int[] a,int[] b){
        //This problem is going to reduce into the problem of finding the longest subArray
        // with zero sum , if we subtract one array into other.
        int [] temp=new int[a.length];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i]-b[i];
        }
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int sum=0;
        for(int i=0;i<temp.length;i++){
            sum+=temp[i];
            if(sum==0){
                ans=Math.max(ans,i+1);
            }
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }
            map.put(sum,map.getOrDefault(sum,i));
        }
        return ans;
    }

    //Naive Solution...  //Assume that both array have same size..
    static int maxCommonSpan(int[] a,int[]b){
        int res=0;
        for(int i=0;i<a.length;i++){
            int sum1=0,sum2=0;
            for(int j=i;j<a.length;j++){
                sum1+=a[j];
                sum2+=b[j];
                if(sum1==sum2)
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
}
