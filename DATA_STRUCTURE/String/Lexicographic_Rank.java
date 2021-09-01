package DATA_STRUCTURE.String;

import java.io.StringReader;
import java.util.*;

public class Lexicographic_Rank {
    public static void main(String[] args) {

        System.out.println(lexicographic_Rank_Naive("STRING"));
        System.out.println(lexicographic_Rank("STRING"));
        System.out.println(lexicographic_Rank_Naive("STR"));
        System.out.println(lexicographic_Rank("STR"));

    }//Main Ends.....................................................

    private static int lexicographic_Rank(String str){
        int n=str.length();
        int[] ch=new int[256];
        for(int i=0;i<n;i++)
            ch[str.charAt(i)]++;
        for(int i=1;i<256;i++)
            ch[i]+=ch[i-1];

        int ans=0;
        int fac=factorial(n);
        for(int i=0;i<n;i++){
            fac=fac/(n-i);
            ans=ans+fac*(ch[str.charAt(i)]-1);

            //for update no of smaller character in right ..
            for(int j=str.charAt(i);j<256;j++)
                ch[j]--;
        }
        return ans+1;
    }
    private static int factorial(int n){
        int fac=1;
        for(int i=n;i>=1;i--)
            fac*=i;
        return fac;
    }

    private static int lexicographic_Rank_Naive(String str){
        ArrayList<String> per=new ArrayList<>();
        char[] ch=str.toCharArray();
        generateAllPermutation(ch,0,per);
        Collections.sort(per);
        for(int i=0;i<per.size();i++) {
            if(per.get(i).equals(str))
                return i+1;
        }
        return -1;
    }
    private static void generateAllPermutation(char[] ch, int i, ArrayList<String> per){
        if(i==ch.length){
            per.add(String.valueOf(ch));
            return;
        }
        for(int s=i;s<ch.length;s++){
            swap(ch,s,i);
            generateAllPermutation(ch,i+1,per);
            swap(ch,s,i);
        }
    }
    private static void swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }

}
