package OOPS.L_30_Two_Pointer_Alorithm;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

               //Finding triplet whose sum is 0
              //Time complexity is O(n3);
//        int [] arr={2,4,-1,3,-4,0,-3};
//        int n=arr.length;
//        int x=1;
//        for (int i=0;i<n-2;i++){
//            for (int j=i+1;j<n-1;j++){
//                for (int k=j+1;k<n;k++){
//                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//                    if (arr[i]+arr[j]+arr[k]==0){
//                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" = "+x+" pair");
//                        x++;
//                    }
//                }
//            }
//        }


              //twoSum Algorithm by two pointer algorithm
//        int [] arr2={2,4,-1,1,3,-4,0,-3,5,6,4,7};
//        Arrays.sort(arr2);        //For shorting ,best method
//        int n2= arr2.length;
//        int x2=8;
//        int i=0 , j=n2-1;
//        while(i<j){
//            if (arr2[i]+arr2[j]>x2){
//                j--;
//            }else if (arr2[i]+arr2[j]<x2){
//                i++;
//            }else{
//                System.out.println(arr2[i]+" "+arr2[j]+" = required pair" );
//                i++;
//            }
//        }


              //Find triplet whose sum is 0
              //With 2 pointer algorithm
              //First short the arr then apply---
        int [] arr2={2,4,-1,1,3,-4,0,-3,5};
        Arrays.sort(arr2);        //For shorting ,best method to do that
        int n2= arr2.length;

        for (int r=0;r<n2-2;r++) {
            int x2 = arr2[r];
            int i=r+1;
            int j = n2 - 1;
            while (i < j) {
                if (arr2[i] + arr2[j] > -x2) {
                    j--;
                } else if (arr2[i] + arr2[j] < -x2) {
                    i++;
                } else {
                    System.out.println(arr2[r]+" "+arr2[i] + " " + arr2[j] + " = required pair");
                    i++;
                }
            }
        }



    }
}
