package DATA_STRUCTURE.CollectionFramework.L_47_Zero_Sum_Subarray;
import  java.util.*;
/*
 * Given an array ,find if there exists a subArray with sum equals to zero.
 * n<10^5
 */

public class MainsClass {
    public static void main(String[] args) {

            //Time complexity is O[n^2].
//       int [] a={2,1,0,3,4,2};
//       int n=a.length;
//        boolean isFound=false;
//       for (int i=0;i<n;i++){
//           int sum=0;
//           for (int j=i;j<n;j++){
//               sum+=a[j];
//               if(sum==0){
//                   isFound=true;
//                   break;
//               }
//           }
//           if(isFound) break;
//       }
//        System.out.println("Found --> "+isFound);


             //Using set in Time Complexity o[n].
//        int [] a={2,1,-3,4,2};
//        int n=a.length;
//        boolean isFound=false;
//        int sum=0;
//        Set<Integer> s=new HashSet<>();
//        for(int e:a){
//            s.add(sum);
//            sum+=e;
//            if(s.contains(sum)) {
//                isFound=true;
//                break;
//            }
//        }
//        System.out.println("Found --> "+isFound);


        /*
         * Given an array ,find if there exists a subArray with sum equals to K.
         * n<10^5
         */
        int [] a={2,1,-3,4,2};
        int n=a.length;
        int k=7;
        boolean isFound=false;
        int sum=0;
        Set<Integer> s=new HashSet<>();
        for(int e:a){
            s.add(sum);
            sum+=e;
            if(s.contains(sum-k)) {
                isFound=true;
                break;
            }
        }
        System.out.println("Found --> "+isFound);


    }
}
