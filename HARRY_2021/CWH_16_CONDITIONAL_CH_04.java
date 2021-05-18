package HARRY_2021;
import java.util.Scanner;

public class CWH_16_CONDITIONAL_CH_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Yes you can drive!");
        }
        else {
            System.out.println("No you can drive!");
        }

        if (age==18 || age >18){
            System.out.println("Yes you can drive!");
        }
        else {
            System.out.println("No you can drive!");
        }

    }
}
