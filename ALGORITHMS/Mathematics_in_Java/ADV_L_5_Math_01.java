package ALGORITHMS.Mathematics_in_Java;

public class ADV_L_5_Math_01 {
    public static void main(String[] args) {

               //Question 001  --> Trailing zero in factorial of n
//        int n=200;
//        int trailingZero=0;
//        int i=5;
//        while(n/i!=0){
//            trailingZero+=n/i;
//            i=i*5;
//        }
//        System.out.println(trailingZero);



        //Question 002  --> Palindrome no

        int n=1551;
        int temp=n;
        int temp2=0;
        while(temp!=0){
            temp2=temp%10 + temp2*10;
            temp/=10;
        }

        if (temp2==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }


}
