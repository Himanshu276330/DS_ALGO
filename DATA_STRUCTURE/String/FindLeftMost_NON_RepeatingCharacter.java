package DATA_STRUCTURE.String;

import java.util.Arrays;

public class FindLeftMost_NON_RepeatingCharacter {
    public static void main(String[] args) {

        System.out.println(leftMost_NonRepCharacter_Naive("geeksforgeek"));
        System.out.println(leftMostNonRepCharInd("geeksforgeek"));
        System.out.println(leftMostNonRepCharInd2("geeksforgeek"));

    }

    private static int leftMost_NonRepCharacter_Naive(String str){
        if(str.length()==0) return -1;
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }

    private static int leftMostNonRepCharInd(String str){
        if(str.length()==0) return -1;
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++)
            arr[str.charAt(i)-'a']++;
        for(int i=0;i<str.length();i++)
            if(arr[str.charAt(i)-'a']==1) return i;
        return -1;
    }

    private static int leftMostNonRepCharInd2(String str){
        if(str.length()==0) return -1;
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==-1) arr[str.charAt(i)]=i;
            else arr[str.charAt(i)]=-2;
        }
        int ansInd=Integer.MAX_VALUE;
        for (int e : arr) {
            if (e >= 0)
                ansInd = Math.min(e, ansInd);
        }
        return (ansInd==Integer.MAX_VALUE ? -1:ansInd);
    }
}
