package apniKaksha;
import java.util.Scanner;

public class L_11_Practice_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //QUESTION 02
//        System.out.print("Enter the no: ");
//        int a=sc.nextInt();
//        System.out.print("Enter the power of no:  ");
//        int p=sc.nextInt();
//        int power=1;
//        for (int i=1;i<=p;i++){
//            power=power*a;
//        }
//        System.out.println("result is : " +power);


           //Question 03
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        if (n >= 2) {
//            for (int i= 2; i<n; i++){                   //loop  execute for n time
//                // n time
//                if (n%i==0){
//                    isPrime= false;
//                    break;
//                }
//            }
//        }else isPrime=false;
//        System.out.println("is prime "+ isPrime);


        //reduce no of lop
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n >= 2) {
            for (int i= 2; i*i<=n; i++){           //We know that all factor must present in bw 1 to root of no
                // n time                                //loop  execute for root n time
                if (n%i==0){                                         //time save
                    isPrime= false;
                    break;
                }
            }
        }else isPrime=false;
        System.out.println("is prime "+ isPrime);




       //Question 04
        float sum = 0.0f;
        System.out.println("Provide input: ");
        int n5 = sc.nextInt();

        for (int i = 1; i<=n5; i++){
            sum = sum +1.0f/i;
            if (i==n5) {
                System.out.printf("1/%d = %f", i,sum);
                break;
            }
            System.out.printf("1/%d + ",i);
        }
        System.out.println("\nTotal sum is : "+sum);

        float sum2 = 0.0f;
        System.out.println("Provide input: ");
        int n3 = sc.nextInt();
        for (float i = 1; i<=n3; i++){
            sum2 = sum2 +1/i;
            System.out.print(sum2+", ");
        }
        System.out.println("\nTotal sum is : "+sum2);




        //Question 05
        System.out.println("Enter no: ");
        int n4 = sc.nextInt();
        float sum4 = 1.0f;
        for (float i = 2; i<=n4; i++){
            if (i%2==0){
                sum4=sum4-1/i;
            }
            else{
                sum4= sum4+1/i;
            }
        }
        System.out.println("Total sum is: "+sum4);


        int x=0;
        int y=1;
        int z=10;
        System.out.print(x+" ");
        System.out.print(y+" ");
        for (int i=0;i<=z;i++){
            int r=x+y;
            System.out.print(r+" ");
            x=y;
            y=r;
        }


    }
}
