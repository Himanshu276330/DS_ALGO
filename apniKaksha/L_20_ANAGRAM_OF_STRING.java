package apniKaksha;

public class L_20_ANAGRAM_OF_STRING {
    public static void main(String[] args) {

        // (a a b) or (a b a) are anagram but (a a b c) is not
        //1st check length must be same

        String a="ca t@";
        String b="cat";


//        boolean isAnagram=false;
//        if (a.length()==b.length()){
//            boolean visited[]=new boolean[b.length()];
//            for (int i=0;i<a.length();i++){
//                char c=a.charAt(i);
//                isAnagram=false;
//                for (int j=0;j<b.length();j++){
//                    if (b.charAt(j)==c && !visited[j]){
//                        visited[j]=true;
//                        isAnagram=true;
//                        break;
//                    }
//                }
//                System.out.println("check "+i);
//                if (!isAnagram) break;        //agar koi yak word nahi mila then anagram nahi h
//            }
//        }
//        if (isAnagram){
//            System.out.println("anagram");
//        }else System.out.println("not anagram");



              //Method 02
          //For clarity Package/L_37_MyArray
        int a1[] =new int[256];
        int b1[] =new int[256];
        boolean isAnagram2=true;
        for (char c:a.toCharArray()){
            int index=(int) c;
            a1[index]++;
        }
        for (char c:b.toCharArray()){
            int index=(int) c;
            b1[index]++;
        }
        for (int i=0;i<256;i++){
            if (a1[i]!=b1[i]){
                isAnagram2=false;
                break;
            }
        }
        if (isAnagram2){
            System.out.println("anagram");
        }else System.out.println("not anagram");


             //Optimisation
        int a2[] =new int[256];
        boolean isAnagram3=true;
        for (char c:a.toCharArray()){
            int index=(int) c;
            a2[index]++;
        }
        for (char c:b.toCharArray()){
            int index=(int) c;
            a2[index]--;
        }
        for (int i=0;i<256;i++){
            if (a2[i]!=0){
                isAnagram3=false;
                break;
            }
        }
        if (isAnagram3){
            System.out.println("anagram");
        }else System.out.println("not anagram");









    }
}
