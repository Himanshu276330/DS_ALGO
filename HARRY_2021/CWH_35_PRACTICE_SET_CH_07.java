package HARRY_2021;

public class CWH_35_PRACTICE_SET_CH_07 {
/*    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d \n",n,i,n*i);
        }
    }*/

/*    static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

/*    static int sum_of_natural_no(int n){    //RECURSION METHOD
        if (n==1){
            return 1;
        }else return n+sum_of_natural_no(n-1);
    }

    static void pattern2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

/*    static int fib(int n){
        if (n==1){
            return 0;
        }else if (n==2){
            return 1;
        }else return fib(n-1)+fib(n-2);
    }
    static int fib2(int n){
        if (n==1||n==2){
            return n-1;
        }else return fib(n-1)+fib(n-2);
    }*/

    static float avg(float ...array){
        float totalSum=0;
        for (int i=0;i< array.length;i++){
            totalSum+=array[i];
        }
        return totalSum/ array.length;
    }

    static void pattern_rec(int n){
        if (n>0) {
            pattern_rec(n - 1);
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_rec2(int n){
        if (n>0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            pattern_rec2(n - 1);
        }
    }

    static double con(double n){
        return n+273.14;
    }


    public static void main(String[] args) {
        //int x = 2;
        //Question 01
//        multiplication(7);
//        multiplication(x);

        //Question 02
//        pattern(4);

       // Question 03
/*       int c=sum_of_natural_no(3);
       System.out.println(c);
        System.out.println(sum_of_natural_no(5));

        //Question 04
        //pattern2(4);

        //Question 05
        //fibonacci series
        System.out.println(fib(4));
        int y=10;
        for (int i=1;i<=y;i++){
            System.out.print(fib(i)+" ");
        }
        System.out.println();
        System.out.println(fib2(10));   */

        //Question 06
        //System.out.println(avg(45.2f, 56.2f, 80f, 54f));
        //System.out.println(avg(50,50,100,10));

        //Question 07
        pattern_rec2(4);

        //Question 08
        pattern_rec(4);

        //Question 09
        double x = 27.32;
        System.out.printf("%f celsius is equal to %f kelvin",x,con(x));
        System.out.println();

        //Question 10
        int sum=0;
        int n= 3;
        for (int i=1;i<=n;i++){
            sum+=i;
            System.out.printf("%d ",i);
            if (i==n){
                System.out.print("=");
                continue;
            }
            System.out.print("+ ");
        }
        System.out.println(" "+sum);
    }
}
