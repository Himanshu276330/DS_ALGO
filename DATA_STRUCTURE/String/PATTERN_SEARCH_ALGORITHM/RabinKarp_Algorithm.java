package DATA_STRUCTURE.String.PATTERN_SEARCH_ALGORITHM;

public class RabinKarp_Algorithm {
    public static void main(String[] args) {



    }//Main Ends...............................................

    private static void patternSearch(String str,String pat){
        final int d=5;
        final int mod=1000000007;

        //Calculate hash function of pattern....
        int patHash=1;
        for(int i=0;i<pat.length();i++){
            patHash= (int) ( (patHash*pat.charAt(i)* Math.pow(d,i)) %mod );
        }


    }
}
