package ALGORITHMS.Recuesion_Problem;

public class ADV_L_9_Josephus_Problem {
    public static void main(String[] args) {

        System.out.println(josh(3,2));
        System.out.println(josh2(3,2));
        System.out.println(5%4);

    }
      //indexing start from 0
    static int josh(int n,int k){
        if(n==1) return 0;

        return (josh(n-1,k) +k)%n;
    }

    //indexing start from 1
    static int josh2(int n,int k){
        if(n==1) return 1;

        return (josh(n-1,k) +k-1)%n+1;
    }
}
