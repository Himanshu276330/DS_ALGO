package apniKaksha;
import java.util.Scanner;

public class L_14_ADVANCED_NESTED_FOR_LOOP_PATERN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          //Patter 01
//        int n=sc.nextInt();
//        for (int j=1; j<=n; j++){
//            for (int i=1; i<=n-j; i++){
//                System.out.print(" ");
//            }
//            for (int i=1; i<=j; i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

         //Pattern 02
//        int a=1;
//        int n=sc.nextInt();
//        for (int j=1; j<=n; j++){
//            for (int i=1; i<=n-j; i++){
//                System.out.print(" ");
//            }
//            for (int i=1; i<=j; i++){
//                System.out.print(a+" ");
//                a++;
//            }
//            System.out.println();
//        }

            //Pattern 03
//        int n3= sc.nextInt();
//        int a=1;
//        int row=2*n3-1;
//        for (int j=1; j<=2*n3-1; j++){
//            if (j<=n){
//                for (int i=1; i<=j; i++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else{
//                for (int i=1; i<=n3+1-2*a; i++){
//                    System.out.print("* ");
//                }
//                a++;
//                System.out.println();
//            }
//        }

           //Pattern 04
        int n4= sc.nextInt();
        System.out.println("*");
        if (n4>=2){
            for (int j=2; j<=n4-1; j++){
                System.out.print("* ");
                for (int i2=1; i2<=j-2; i2++){
                    System.out.print("  ");
                }
                System.out.println("* ");
            }
            for (int i=1; i<=n4; i++){
                System.out.print("* ");
            }
        }



    }
}
