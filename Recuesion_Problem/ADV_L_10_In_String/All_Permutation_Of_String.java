package Recuesion_Problem.ADV_L_10_In_String;

import java.util.Arrays;

public class All_Permutation_Of_String {
    public static void main(String[] args) {

        permute("abc",0,2);
//        System.out.println(swap("abs",0,2));


    }

    static void permute(String s,int l,int h){
        if(l==h){
            System.out.println(s);
            return;
        }
        for (int i=l;i<=h;i++){
            s=swap(s,l,i);
            permute(s,l+1,h);
            s=swap(s,l,i);     //this line is for backTracking
        }
    }

    static String swap(String s,int l,int i){
        char []c=s.toCharArray();
        char temp=c[l];
        c[l]=c[i];
        c[i]=temp;
        return String.valueOf(c);
    }
}
