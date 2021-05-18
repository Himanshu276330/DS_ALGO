package Algoriths_For_Placement.L_52_Recursion;

public class MainClass {
    static int stepCount=0;
    public static void main(String[] args) {

//        System.out.println(sum(4));
//
//        System.out.println(power(3,4));
//        System.out.println("StepCount : "+stepCount);
//
//        System.out.println(fastPower(3,20));
//        System.out.println("StepCount : "+stepCount);

//        System.out.println(path(2,2));
//        System.out.println(path(3,2));
//        System.out.println(path(3,3));
//        System.out.println(path(4,4));
//        System.out.println(path(4,2));
//        System.out.println(path(200,1));

    }
       //Question 01
    public static int sum(int n){
        if (n==1) return 1;
        else return sum(n-1)+n;
    }
       //Question 02
    public static int power(int a,int b){
        stepCount++;
        if (b==0) return 1;
        else{
            return a*power(a,b-1);
        }
    }

    public static int fastPower(int a,int b){
        stepCount++;
        System.out.println(b);
        if (b==0) return 1;
//        if (b%2==0) return fastPower(a*a,b/2);
           //uses of bit operation
        if ((b&1)==0) return fastPower(a*a,b/2);
        return fastPower(a,b-1);
    }

      //Question 03
    static int path(int n,int m){
        if (n==1 || m==1) return 1;
        return path(n,m-1)+path(n-1,m);
    }
}
