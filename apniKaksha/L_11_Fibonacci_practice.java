package apniKaksha;
import java.util.Scanner;

public class L_11_Fibonacci_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 3; i<=n; i++){
            int c= a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }


    }
}
