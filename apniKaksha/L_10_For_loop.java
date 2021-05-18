package apniKaksha;

public class L_10_For_loop {
    public static void main(String[] args) {
        for (int a =0; a<=100; a++){      //a++ --> a=a+1
            System.out.println(a);
            System.out.println("Hello world");
         }

           //sum of n natural no
        int n = 5;
        int sum = 0;
        for (int i=1; i<=n ; i++){
              sum= sum+i;
         }
            System.out.println(sum);

           //table of 4
        int n2 = 10;
        for (int a2=1 ; a2<=n2; a2++){
            System.out.print(4*a2+"\t");
        }

           //Find factorial of natural no
        int n3 = 5;
        int fac = 1;
        for (int a3=1; a3<=n3 ;a3++){
            fac = fac*a3;
        }
        System.out.println(fac);

           //2nd method
        int n4 = 5;
        int fac2 = 1;
        for (int a4=n4; a4>=1 ;a4--){
            fac2= fac2*a4;
        }
        System.out.println(fac2);



    }
}
