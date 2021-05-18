package Recuesion_Problem.ADV_L_10_In_String;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("a"));
        System.out.println(palindrome2("a",0,0));
        System.out.println(palindrome2("abcddcba",0,7));
        System.out.println(palindrome2("abcddcb",0,6));
    }

    //method 001 with out recursion
    static boolean palindrome(String s){
        char [] c =s.toCharArray();
        int n=c.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(c[i]!=c[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    //method 001 with  recursion, not so efficient
    static boolean palindrome2(String s,int l,int r){
        char [] ca =s.toCharArray();

        if(l>=r) return true;

        if (ca[l]!=ca[r]) return false;

        return palindrome2(s,l+1,r-1);


    }
}
