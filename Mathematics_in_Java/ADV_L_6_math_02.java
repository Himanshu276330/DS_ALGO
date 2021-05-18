package Mathematics_in_Java;

import java.util.Arrays;

public class ADV_L_6_math_02 {
    public static void main(String[] args) {


        boolean isPrime[]=sieveOfEratoSthenes(20);

        for (int i=0;i<=20;i++){
            System.out.println(i+" --> "+isPrime[i]);
        }


//        System.out.println(gcd(15,27));

        System.out.println(fastPower(2,3));

    }

    //Function 01
    static boolean[] sieveOfEratoSthenes(int n){
        boolean isPrime[] =new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for (int i=2;i*i<=n;i++){
            for (int j=2*i;j<=n;j+=i){
                if(!isPrime[j]) continue;
                isPrime[j]=false;
            }
        }
        return isPrime;
    }

    //Function 02 [GCD function]. just like HCF
    static int gcd(int a,int b){

//        if (b==0) return a;
//        return gcd(b,a%b);

        return a%b==0 ? b : gcd(b,a%b);
    }

    //Fast power function
    static int fastPower(int a,int b){
        if (b==0) return 1;
//        if (b%2==0) return fastPower(a*a,b/2);
        //bitwise operation is fast.
        if ((b&1)==0) return fastPower(a*a,b>>1);
        return a*fastPower(a,b-1);
    }



    //Fast power function when int overflow.
    static long fastPower2(long a, long b){
        if (b==0) return 1;
//        if (b%2==0) return fastPower(a*a,b/2);

        if ((b&1)==0) return fastPower2(a*a,b>>1);
        return a*fastPower2(a,b-1);
    }


    //Fast power function when int and long overflow.
    static long fastPower3(long a,long b,long n){
        long res=1;
        while(b>0){
            if ((b&1)!=0){
                res=(res%n*a%n)%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return res;
    }

}
