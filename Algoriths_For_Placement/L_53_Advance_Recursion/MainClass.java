package Algoriths_For_Placement.L_53_Advance_Recursion;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {

//        int [][]a={
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,0,0},
//                {1,2,2,2,2,0,1,0},
//                {1,0,0,1,1,0,1,1},
//                {1,1,1,2,2,0,1,0},
//                {1,1,1,2,2,2,2,0},
//                {1,1,1,1,1,2,1,1},
//                {1,1,1,1,1,2,2,1},
//        };
//        floodFill(a,3,1,3,2);
//        print(a,a.length,a[0].length);

              //Question 02
        permutation("abc",0,2);
//        permutation("abced",0,4);
        System.out.println(count);

              //Question 03
//        int []a={1,5,7,3,700,4};
//        System.out.println(coinMax(a,0,a.length-1));
//
//        int []a2={1,5,7,3,700,4};
//        System.out.println(coinMax(a2,0,a2.length-1));



    }
        //Question 01 { Flood Fill }
//    static void floodFill(int a[][] ,int r,int c,int toFill,int prevFill){
//        int rows=a.length;
//        int cols=a[0].length;
//
//        if (r<0 || r>=rows || c<0 || c>=cols) return;
//        if (a[r][c]!=prevFill) return;
//
//        a[r][c]=toFill;
//
//        floodFill(a,r-1,c,toFill,prevFill);
//        floodFill(a,r,c-1,toFill,prevFill);
//        floodFill(a,r+1,c,toFill,prevFill);
//        floodFill(a,r,c+1,toFill,prevFill);
//    }
//
//    static void print(int a[][] ,int r,int c){
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }


        //Question 02  { Unique String print }
    static Set<String> set=new HashSet<>();
    static int count=0;
    static void permutation(String s, int l, int r){
        if(l==r){
               //For unique string
            if (set.contains(s)) return;
            set.add(s);
            System.out.println(s);
            count++;
            return;
        }
        for (int i=l;i<=r;i++){
            s=interchangeChar(s,l,i);
            permutation(s,l+1,r);
                // Not change anyThing in result if we removed it ? ,, see in future.
                // just like backTracking.
            s=interchangeChar(s,l,i);
        }
    }

    static String interchangeChar(String s,int a,int b){
        char array[]=s.toCharArray();
        char temp=array[a];
        array[a]=array[b];
        array[b]=temp;
        return String.valueOf(array);
    }

              //Question 03 { Game Theory }
    static int coinMax(int a[], int l, int r){
        if (l+1==r){
            return Math.max(a[l],a[r]);
        }
        return Math.max(a[l]+Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1))
                       ,   a[r]+Math.min(coinMax(a,l+1,r-1),coinMax(a,l,r-2)));
    }

}
