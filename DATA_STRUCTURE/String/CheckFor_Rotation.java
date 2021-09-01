package DATA_STRUCTURE.String;

public class CheckFor_Rotation {
    public static void main(String[] args) {

        System.out.println(isRotated("abcd","cdab"));
        System.out.println(isRotated("abcd","cdae"));

    }//Main Ends........................................................

    private static boolean isRotated(String str,String rotStr){
        if(str.length()!=rotStr.length()) return false;
        str=str+str;
        return (str.contains(rotStr));  // Based on Pattern Searching...
    }

}
