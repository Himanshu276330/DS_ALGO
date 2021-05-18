package L_26_REVERSE_A_STRING;

public class MainClass {
    public static void main(String[] args) {

        String s="  The sky is blue";
        int i=s.length()-1;
        System.out.println(i);
        String ans ="";
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')i--;
                int j=i;
                if (i<0) break;    //Help to remove  beginning spaces
                    while (i >= 0 && s.charAt(i) != ' ') i--;
                    if (ans.isEmpty()) {
                       ans= ans.concat(s.substring(i + 1, j + 1));  //j+1 isliye ki substring me last wala index ka char nahi include hota h
                    } else {
                       ans= ans.concat(" " + s.substring(i + 1, j + 1));
                    }
        }
        System.out.println(ans);
    }
}
