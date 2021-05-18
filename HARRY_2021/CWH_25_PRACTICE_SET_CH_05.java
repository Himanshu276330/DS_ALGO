package HARRY_2021;

public class CWH_25_PRACTICE_SET_CH_05 {
    public static void main(String[] args) {

        //Question 01
/*        int n = 4;
        int j;
        int i= 1;
        for (j=1; j<=n; j++){
            for (i=1; i<=n+1-j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (j=1; j<=n; j++){
            for (i=1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }  */

        //Question 02
 /*       int a = 10;
        int i2=1;
        while(i2<=10){
            System.out.print("+"+i2);
            i2++;
        }
        System.out.println();

        int sum=0;
        int n =30;
        for (int i=1; i<=n; i++){
            sum=sum+(2*i);
            System.out.print(i*2);
            if (i==30) continue;
            System.out.print("+");
        }
        System.out.println("="+sum);  */

        //Question 03
/*        int t=2;
        for (int i=1; i<=10; i++){
            System.out.println("2 * "+i+" = "+t*i);
        }

        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",t,i,t*i);
        }

        //question 4
        for (int i=10; i>=1; i--){
            System.out.printf("%d X %d = %d\n",t,i,t*i);
        }*/

        //question 05
        int n =9;
        int i=1;
        for (i=1; i<=n; i++){
            float f=n%i;
            //System.out.println(f);
            if (f==0){
                System.out.printf("factorial of %d is %d\n",n,i);
            }
        }

        //question 06
        int i2 =1;
        int n2 = 19;
        while (i2 <= n2) {
            float f2 = n2 % i2;
            if (f2 == 0) {
                System.out.printf("factorials of %d is %d\n", n2, i2);
            }
            i2++;
        }


    }
}
