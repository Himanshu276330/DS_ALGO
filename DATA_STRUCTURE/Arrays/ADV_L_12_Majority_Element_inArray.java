package DATA_STRUCTURE.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ADV_L_12_Majority_Element_inArray {
    public static void main(String[] args) {

        //Question : find the element which present in array (>n/2).

//        int []a= {2};
//        int []a= {2,1,1,1,3,4};
        int []a= {2,8,5,8,8,8};
        System.out.println(majorityElement(a,a.length));
        System.out.println(majorityElement2(a,a.length));
        System.out.println(majorityElement3(a,a.length));
        System.out.println(majorityElement4(a,a.length));

    }

    //Method 001
    static int majorityElement(int []a,int n){
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if(a[i]==a[j]) count++;
                if(count>(n/2)) return a[j];
            }
        }
        return -1;
    }

    //Method 002
    static int majorityElement2(int []a,int n){
        Arrays.sort(a);
        int ans=0;
        int count =0;
        for (int i=0;i<n;i++){
            if(a[ans]==a[i]) {
                count++;
                if (count>(n/2)) return a[ans];
            }else{
                ans=i;
                count=1;
            }
        }
        return -1;
    }

    //Method 003
    static int majorityElement3(int []a,int n){
        Map<Integer,Integer> m=new HashMap<>();
        for(int e:a){
            if(m.containsKey(e)){
                m.put(e,m.get(e)+1);
            }else{
                m.put(e,1);
            }
        }
        for(int e:a){
            if(m.get(e) >(n/2)) return e;
        }
       return -1;
    }

    //Method 004
    static int majorityElement4(int []a,int n){
        int ansIndex=0;
        int count=1;
        for (int i=1;i<n;i++){
            if(a[ansIndex]==a[i]){
                count++;
            }else{
                count--;
            }
            if (count==0){
                ansIndex=i;
                count=1;
            }
        }
           //this effect because in method 02 array is sort.
        System.out.println(count+" --"+ansIndex);
        System.out.println(n);
        //Check if ansIndex is actually  ans.
        int finalCount=0;
        for (int e:a){
            if (a[ansIndex]==e) {
                finalCount++;
                if (finalCount>(n/2)) return a[ansIndex];
            }
        }

        return -1;
    }

}
