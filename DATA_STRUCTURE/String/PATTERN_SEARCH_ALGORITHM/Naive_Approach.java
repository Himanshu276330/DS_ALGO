package DATA_STRUCTURE.String.PATTERN_SEARCH_ALGORITHM;

public class Naive_Approach {
    public static void main(String[] args) {

        patSearch_Naive("GEEKSFORGEEKS","EKS");
        patSearch_Naive2("GEEKSFORGEEKS","EKS");

    }//Main Ends......................................................

    private static void patSearch_Naive(String txt,String pat){
        int n=txt.length(), m=pat.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++)
                if(pat.charAt(j)!=txt.charAt(i+j)) break;
            if(j==m)
                System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void patSearch_Naive2(String txt,String pat){
        int n=txt.length(), m=pat.length();
        for(int i=0;i<=n-m;i++){
            if(txt.charAt(i)==pat.charAt(0)) {
                int j;
                for (j = 1; j < m; j++)
                    if (pat.charAt(j) != txt.charAt(i + j)) break;
                if (j == m)
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
