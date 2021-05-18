package HARRY_2021;
import java.util.Scanner;

public class CWH_06_EXERCISE_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks IN Math = ");
        float m= sc.nextFloat();
        System.out.print("Enter Your Marks IN science =  ");
        float s= sc.nextFloat();
        System.out.print("Enter Your Marks IN Social science =  ");
        float ss= sc.nextFloat();
        System.out.print("Enter Your Marks IN sanskrit =  ");
        float san= sc.nextFloat();
        System.out.print("Enter Your Marks IN english = ");
        float eng= sc.nextFloat();
        System.out.print("Enter Your Marks IN computer =  ");
        float com= sc.nextFloat();
        System.out.print("Give Your Total Marks in all subject = ");
        float total = sc.nextFloat();
        float totalmarks= m+s+ss+san+eng+com;
        System.out.println("Your Total marks is = "+totalmarks);
        float t1=totalmarks/total;
        float per= t1*100;
        System.out.print("Your percentage is "+per);



    }
}
