package DATA_STRUCTURE.String;

import java.util.Locale;

public class Reverse_aString {
    public static void main(String[] args) {

        String str="  Welcome to   gfg  ";
        reverse_Naive1(str);

        reverse1(str);


    }//Main Ends..............................................

    private static void reverse_Naive1(String s){
        int i=s.length()-1;
        System.out.println(i);
        String ans ="";
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')i--;
            int j=i;
            if (i<0) break;    //Help to remove  beginning spaces
            while (i >= 0 && s.charAt(i) != ' ') i--;
            if (ans.isEmpty())
                ans= ans.concat(s.substring(i + 1,j + 1));  //j+1 isLieye ki substring me
                                              // last walla index ka char nahi include hota h
            else
                ans= ans.concat(" "+s.substring(i + 1, j + 1));
        }
        System.out.println(ans);
    }

    private static void reverse1(String str){
        str=str.trim();
        String[] strArr=str.split("(\\s)+");
        StringBuilder sb=new StringBuilder();
        for(int i= strArr.length-1;i>=0;i--) {
            sb.append(strArr[i]);
            if(i>0) sb.append(" ");
        }
        System.out.println(sb.toString());
    }

}
