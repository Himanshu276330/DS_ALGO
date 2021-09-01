package DATA_STRUCTURE.String;

import java.util.Arrays;

public class FindLeftMost_RepeatingCharacter {
    public static void main(String[] args) {

        System.out.println(leftMostRepCharInd_Naive("geeksforgeek"));
        System.out.println(leftMostRepCharInd("geeksforgeek"));
        System.out.println(leftMostRepCharInd2("geeksforgeek"));
        System.out.println(leftMostRepCharInd3("geeksforgeek"));

    }

    private static int leftMostRepCharInd_Naive(String str){
        if(str.length()==0) return -1;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++)
                if(str.charAt(i)==str.charAt(j)) return i;
        }
        return -1;
    }

    private static int leftMostRepCharInd(String str){
        if(str.length()==0) return -1;
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++)
            arr[str.charAt(i)-'a']++;
        for(int i=0;i<str.length();i++)
            if(arr[str.charAt(i)-'a']>1) return i;
        return -1;
    }

    private static int leftMostRepCharInd2(String str){
        if(str.length()==0) return -1;
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        int ansInd=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==-1) arr[str.charAt(i)]=i;
            else ansInd=Math.min(ansInd,arr[str.charAt(i)]);
        }
        return (ansInd==Integer.MAX_VALUE ? -1:ansInd);
    }

    private static int leftMostRepCharInd3(String str){
        if(str.length()==0) return -1;
        boolean[] vis=new boolean[256];
        int ansInd=Integer.MAX_VALUE;
        for(int i=str.length()-1;i>=0;i--){
            if(vis[str.charAt(i)]) ansInd=i;
            else vis[str.charAt(i)]=true;
        }
        return (ansInd==Integer.MAX_VALUE ? -1:ansInd);
    }

}
