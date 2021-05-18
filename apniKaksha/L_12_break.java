package apniKaksha;
import java.util.Scanner;

public class L_12_break {
    public static void main(String[] args) {

        for (int i =1; i<=100;  i++){
            if (i==35) break;
            System.out.print(i+" ");
        }


             //taking input from user repeatly
        Scanner sc=new Scanner(System.in);
        for ( ; ; ){
            System.out.println("Enter input : ");
            int input=sc.nextInt();
            if (input<0){
                break;
            }
        }


            //uses of continue
        for (int i=1; i<=100; i++){
            if (i>20 && i<50) continue;
            System.out.print(i+" ");
        }


   }
}
