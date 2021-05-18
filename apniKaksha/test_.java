package apniKaksha;

public class test_ {
    public static void main(String[] args) {

    String str="Himanshu";
    char c=str.charAt(0);
//    boolean ;
        System.out.println(c);
//        if ()


    }

    public static class L_18_SELECTION_SHORT {
        public static void main(String[] args) {

            int a[]={3,1,2,7,4,0};
            int n=a.length;
            for (int i=0;i<n-1;i++){
                int minInd =i;                 //Dought  solved in 26:02 in video
                for (int j=i;j<n;j++){
                    if (a[j]<a[i]){
                         minInd=j;
                    }
                }
                int tem=a[i];
                a[i]=a[minInd];
                a[minInd]=tem;
            }
            for (int e:a){
                System.out.print(e+" ");
            }
        }
    }
}