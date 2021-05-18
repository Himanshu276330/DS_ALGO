package HARRY_2021;
import java.util.Scanner;

public class CWH_23_FOR_LOOP {
    public static void main(String[] args) {

        for (int i=1 ; i<=10 ; i++){
            System.out.print(i+" " );
        }

        //Quick quiz
        int a = 5;
        for (int a2=0; a2<a;a2++){
        System.out.print(2*a2+"\t");
        }
        System.out.println("\n");

        for (int b=5;b>0;b--){
        System.out.print(b+"\t");
        }
        System.out.println("\n");

        //Quick quiz
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        for (int i = 0;i<=n;i++){
            System.out.print(2*i+1+"\t");
        }

        for (int m = 6;m<0;m++){
            System.out.println(m);
        }       //IT IS ALSO JUST LIKE WHILE LOOP, first check condition then execute

    }
}
