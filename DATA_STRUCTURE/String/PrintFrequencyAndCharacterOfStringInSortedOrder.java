package DATA_STRUCTURE.String;

public class PrintFrequencyAndCharacterOfStringInSortedOrder {
    public static void main(String[] args) {

        String str="geeksforgeek";
        print(str);

    }//Main Ends...............................................

    private static void print(String str){
        int[] ch=new int[26];  //0->a , 25->z;
        for(int i=0;i<str.length();i++)
            ch[str.charAt(i)-'a']++;

        for(int i = 0;i<ch.length; i++)
            if(ch[i]>0)
                System.out.println((char) (i+'a')+" --fre-> "+ch[i]);
    }
}
