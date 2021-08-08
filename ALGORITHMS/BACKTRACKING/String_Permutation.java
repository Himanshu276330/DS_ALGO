package ALGORITHMS.BACKTRACKING;

public class String_Permutation {
    public static void main(String[] args) {
        //Given a DATA_STRUCTURE.String Print all those permutation which do not contain "AB" as a string.

        String str="ABC";
        permute(str,0,str.length()-1);


    }//MAINS ENDS....................
    static void permute(String str, int l, int r){
        if(l==r){
            System.out.print(str+" ");
        }else{
            for(int i=l;i<=r;i++){
                if(isSafe(str,l,i,r)){
                    str=new String(swap(str, i, l));
                    permute(str,l+1,r);
                    str=new String(swap(str, i, l));
                }
            }
        }
    }

    static boolean isSafe(String str,int l, int i, int r){
        if(l!=0 && str.charAt(l-1)=='A' && str.charAt(i)=='B')
            return false;
        if(r==(l+1) && str.charAt(i)=='A' && str.charAt(l)=='B')
            return false;
        return true;
    }

    static char[] swap(String str, int i, int j)
    {
        char []ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}