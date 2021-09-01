package DATA_STRUCTURE.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString_WithDistinctCharacter {
    public static void main(String[] args) {

        System.out.println(lonSubStringWithDisChar_Naive("abcdabc"));
        System.out.println(lonSubStringWithDisChar_Naive("a"));
        System.out.println(lonSubStringWithDisChar_Naive("abcd"));
        System.out.println(lonSubStringWithDisChar_Naive("aaaa"));

        System.out.println(lonSubStringWithDisChar("abcdabc"));
        System.out.println(lonSubStringWithDisChar("a"));
        System.out.println(lonSubStringWithDisChar("abcd"));
        System.out.println(lonSubStringWithDisChar("aaaa"));

    }//Main Ends......................................................................

    private static int lonSubStringWithDisChar(String str){
        int[] Char=new int[256];
        Arrays.fill(Char,-1);
        char[] ch=str.toCharArray();
        int[] maxEnd=new int[ch.length];
        maxEnd[0]=1;
        Char[ch[0]]=0;
        for(int i=1;i<ch.length;i++){
            if(Char[ch[i]]==-1)
                maxEnd[i]=maxEnd[i-1]+1;
            else
                maxEnd[i]=Char[ch[i]]-i;
            Char[ch[i]]=i;
        }
        int ans=0;
        for(int e:maxEnd)
            ans=Math.max(ans,e);
        return ans;
    }

    private static int lonSubStringWithDisChar_Naive(String str){
        int n=str.length();
        boolean[] vis;
        int ans=Integer.MIN_VALUE,cur=0;
        for(int i=0;i<n;i++){
            vis=new boolean[256];
            cur=0;
            for(int j=i;j<n;j++){
                if(!vis[str.charAt(j)]) {
                    vis[str.charAt(j)]=true;
                    cur++;
                }else
                    break;
            }
            ans= Math.max(ans,cur);
        }
        return ans;
    }

}
