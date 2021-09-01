package DATA_STRUCTURE.String;

import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String[] args) {

        System.out.println(isAnagram_Naive("abcd","abdc"));
        System.out.println(isAnagram("abcde","abdec"));

    }
    private static boolean isAnagram_Naive(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    private static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;

        int[] arr=new int[26];
        for(int i=0;i<str1.length();i++)
            arr[str1.charAt(i)-'a']++;
        for(int i=0;i<str2.length();i++)
            arr[str2.charAt(i)-'a']--;

        for(int i=0;i<26;i++)
            if(arr[i]!=0) return false;

        return true;
    }

}
