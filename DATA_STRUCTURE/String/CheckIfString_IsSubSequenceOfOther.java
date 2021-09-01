package DATA_STRUCTURE.String;

public class CheckIfString_IsSubSequenceOfOther {
    public static void main(String[] args) {

        System.out.println(isSubSequence("subString","suring"));
        System.out.println(isSubSequence("subStrings","surina"));

    }
    private static boolean isSubSequence(String str,String subSequence){
        int j=0;
        int l=subSequence.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==subSequence.charAt(j))
                j++;
            if(j==l) return true;
        }
        return false;
    }
}
