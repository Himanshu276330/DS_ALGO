package DATA_STRUCTURE.String;

public class CheckPalindromeOrNot {
    public static void main(String[] args) {

        String str="aba";
        String str2="abc";
        System.out.println(isPal_Naive(str));
        System.out.println(isPal_Naive(str2));

        System.out.println(isPal(str));
        System.out.println(isPal(str2));

    }//Ends...............................................

    private static boolean isPal_Naive(String str){
        StringBuilder strRev=new StringBuilder(str);
        strRev.reverse();
        return str.equals(strRev.toString());
    }

    private static boolean isPal(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
