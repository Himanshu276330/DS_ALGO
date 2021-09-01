package DATA_STRUCTURE.String;

public class Anagram_Search {
    public static void main(String[] args) {

        System.out.println(isAnagramPattern_Naive("geeksforgeeks","frog"));
        System.out.println(isAnagramPattern_Naive("geeksforgeeks","rseek"));

        System.out.println(isAnagramPattern("geeksforgeeks","frog"));
        System.out.println(isAnagramPattern("geeksforgeeks","rseek"));



    }//Main Ends..............................................................

    private static boolean isAnagramPattern(String str,String pat){
        if(pat.length()>str.length()) return false;

        int[] cl=new int[26];
        int[] cPat=new int[26];
        int patLen=pat.length();

        for(int i=0;i<patLen;i++){
            cl[str.charAt(i)-'a']++;
            cPat[pat.charAt(i)-'a']++;
        }
        if(isSame(cl,cPat))
            return true;

        for(int i=patLen;i<str.length();i++){
            cl[str.charAt(i-patLen)-'a']--;
            cl[str.charAt(i)-'a']++;
            if(isSame(cl,cPat))
                return true;
        }
        return false;
    }

    private static boolean isSame(int[] cl,int[] cPat){
        for(int i=0;i<26;i++)
            if(cl[i]!=cPat[i]) return false;
        return true;
    }

    private static boolean isAnagramPattern_Naive(String str,String pat){
        if(pat.length()>str.length()) return false;

        int patLen=pat.length();
        for(int i=0;i<=str.length()-patLen;i++){
            if(checkAnagram(str,i,i+patLen,pat))
                return true;
        }
        return false;
    }

    private static boolean checkAnagram(String str,int s,int e,String s2){
        int[] arr=new int[26];
        for(int i=s;i<e;i++)
            arr[str.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++)
            arr[s2.charAt(i)-'a']--;

        for(int i=0;i<26;i++)
            if(arr[i]!=0) return false;

        return true;
    }

}
